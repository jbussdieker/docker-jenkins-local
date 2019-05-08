def call(cmd = "version --client") {
  docker.image("jbussdieker/kubectl:stable").inside {
    sh "kubectl ${cmd}"
  }
}
