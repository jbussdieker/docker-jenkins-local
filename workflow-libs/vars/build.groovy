// Something
import Foo
import Bar

def call() {
  def foo = new Foo()
  def bar = new Bar(this)

  foo.bar()
  bar.bar()

  node {
    stage('clone') {
      checkout scm
    }

    stage('build') {
      docker.build("jenkins-local").inside {
        sh "ls -lah /"
      }
    }
  }
}
