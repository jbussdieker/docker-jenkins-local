println("# Setting up private security realm")

import jenkins.model.Jenkins
import hudson.security.HudsonPrivateSecurityRealm

def realm = new HudsonPrivateSecurityRealm(false)
realm.createAccount("admin", "admin")
Jenkins.instance.setSecurityRealm(realm)
