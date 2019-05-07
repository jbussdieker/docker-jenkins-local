all: build run

build:
	docker build -t jenkins-local .

run:
	docker run \
		--group-add 0 \
		-p 8080:8080 \
		-v ${PWD}:/local \
		-v ${PWD}/workflow-libs:/var/jenkins_home/workflow-libs \
		-v /var/run/docker.sock:/var/run/docker.sock \
		-v /usr/local/bin/docker:/usr/local/bin/docker \
		--rm \
		jenkins-local
