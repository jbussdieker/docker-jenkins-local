def call(cmd) {
  docker.image("jbussdieker/aws:stable").inside {
    sh "aws ${cmd}"
  }
}
