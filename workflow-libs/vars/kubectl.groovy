def call() {
  docker.image("jbussdieker/kubectl:stable").inside {
    sh "kubectl version --client"
  }
}
