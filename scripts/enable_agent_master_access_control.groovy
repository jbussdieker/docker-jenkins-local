println("# Enable Agent -> Master Access Control")

import jenkins.model.Jenkins
import jenkins.security.s2m.AdminWhitelistRule

Jenkins.instance.getInjector().getInstance(AdminWhitelistRule.class).setMasterKillSwitch(false)
