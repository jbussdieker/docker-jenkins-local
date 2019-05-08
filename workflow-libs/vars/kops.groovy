def call() {
  docker.image("jbussdieker/kops:stable").inside {
    sh "kops version"
  }
}
