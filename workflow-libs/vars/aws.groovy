def call(cmd = "--version") {
  docker.image("jbussdieker/aws:stable").inside {
    sh "aws ${cmd}"
  }
}
