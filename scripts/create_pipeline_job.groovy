println("# Creating multibranch pipeline jobs")

import jenkins.model.Jenkins
import org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition
import org.jenkinsci.plugins.workflow.job.WorkflowJob
import com.cloudbees.hudson.plugins.folder.*

def createPipelineJob(folderName, name, script) {
  def folder = Jenkins.instance

  if (folderName?.trim()) {
    folder = Jenkins.instance.getItem(folderName)
    if (folder == null)
      folder = Jenkins.instance.createProject(Folder.class, folderName)
  }

  WorkflowJob job
  def item = folder.getItem(name)
  if ( item != null ) {
    job = (WorkflowJob) item
  } else {
    job = folder.createProject(WorkflowJob.class, name)
  }

  def flowDefinition = new CpsFlowDefinition(script, true)
  job.definition = flowDefinition
}

createPipelineJob("pipelines", "script", '''

stage('echo') {
  echo "Testing 1,2,3"
}

stage('node') {
  node {
    sh "date"
  }
}

stage('other') {
  other()
}

'''.trim())
