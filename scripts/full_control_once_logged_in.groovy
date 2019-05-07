println("# Setting up full control once logged in strategy")

import jenkins.model.Jenkins
import hudson.security.FullControlOnceLoggedInAuthorizationStrategy

def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.denyAnonymousReadAccess = true
Jenkins.instance.setAuthorizationStrategy(strategy)
Jenkins.instance.save()
