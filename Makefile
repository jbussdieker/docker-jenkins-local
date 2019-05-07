all: build ci

build: Dockerfile scripts/*
	docker build -t jenkins-local .

ci: build
	./ci

_PHONEY:
