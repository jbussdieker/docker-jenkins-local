def call() {
  docker.image("jbussdieker/helm:stable").inside {
    sh "helm version --client"
  }
}
