def call() {
  docker.image("jbussdieker/packer:stable").inside {
    sh "packer version"
  }
}
