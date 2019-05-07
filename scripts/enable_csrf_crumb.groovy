println("# Enable CSRF crumb")

import jenkins.model.Jenkins
import hudson.security.csrf.DefaultCrumbIssuer

Jenkins.instance.setCrumbIssuer(new DefaultCrumbIssuer(true))
