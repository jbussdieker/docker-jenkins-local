def call() {
  docker.image("jbussdieker/terraform:stable").inside {
    sh "terraform version"
  }
}
