println("# Creating multibranch pipeline jobs")

import hudson.util.PersistedList
import jenkins.model.Jenkins
import jenkins.branch.*
import jenkins.plugins.git.*
import org.jenkinsci.plugins.workflow.multibranch.*
import com.cloudbees.hudson.plugins.folder.*
 
def createMultibranchScm(folderName, name, repo, jobScript) {
  def folder = Jenkins.instance

  if (folderName?.trim()) {
    folder = Jenkins.instance.getItem(folderName)
    if (folder == null)
      folder = Jenkins.instance.createProject(Folder.class, folderName)
  }

  WorkflowMultiBranchProject job
  def item = folder.getItem(name)
  if ( item != null ) {
    job = (WorkflowMultiBranchProject) item
  } else {
    job = folder.createProject(WorkflowMultiBranchProject.class, name)
  }

  job.getProjectFactory().setScriptPath(jobScript)

  GitSCMSource gitSCMSource = new GitSCMSource(null, repo, null, "*", "", false)
  BranchSource branchSource = new BranchSource(gitSCMSource)

  PersistedList sources = job.getSourcesList()
  sources.clear()
  sources.add(branchSource)
}

createMultibranchScm(null, "local", "/local", "Jenkinsfile")
