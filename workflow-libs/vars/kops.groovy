def call(cmd = "version") {
  docker.image("jbussdieker/kops:stable").inside {
    sh "kops ${cmd}"
  }
}
