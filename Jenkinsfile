#!groovy
node {
  aws()
  helm()
  kops()
  kubectl()
  packer()
  terraform()

  aws("--version")
  helm("version --client")
  kops("version")
  kubectl("version --client")
  packer("version")
  terraform("version")
}
