def call(cmd = "version --client") {
  docker.image("jbussdieker/helm:stable").inside {
    sh "helm ${cmd}"
  }
}
