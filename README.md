# Jenkins Local

This project creates a local Jenkins server running inside docker with a few key features setup:

  * The image is configured such that the Manage Jenkins screen is free of security/configuration warnings
  * The image creates a single Multibranch Pipeline job using any local git repo mounted to /local
  * The container is setup to enable Jenkins to create images on the hosts docker installation

## Usage

```shell
> export PATH=$PATH:/path/to/docker-jenkins-local
> cd /path/to/my/project
> ci
```

## TODO

  * Setup git commit hooks to trigger builds
  * Support multiple local mounts
