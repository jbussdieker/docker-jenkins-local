def call(name) {
  node {
    stage('clone') {
      checkout scm
    }

    stage('build') {
      docker.build(name).inside {
        sh "echo ok"
      }
    }
  }
}
