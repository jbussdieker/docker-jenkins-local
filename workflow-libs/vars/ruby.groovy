def call() {
  node {
    stage('clone') {
      checkout scm
    }

    stage('build') {
      docker.image('ruby').inside {
        sh "bundle install"
        sh "rake spec"
      }
    }
  }
}
