def call(cmd = "version") {
  docker.image("jbussdieker/terraform:stable").inside {
    sh "terraform ${cmd}"
  }
}
