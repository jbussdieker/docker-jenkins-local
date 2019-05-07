println("# Set Jenkins URL")

import jenkins.model.JenkinsLocationConfiguration

def config = JenkinsLocationConfiguration.get()
config.setUrl("http://localhost:8080/")
config.save()
