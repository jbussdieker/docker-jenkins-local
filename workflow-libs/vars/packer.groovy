def call(cmd = "version") {
  docker.image("jbussdieker/packer:stable").inside {
    sh "packer ${cmd}"
  }
}
