def call() {
  docker.image("jbussdieker/aws:stable").inside {
    sh "aws --version"
  }
}