build:
	docker build -t opstree/jenkins:1.0 .

run-vm:
	docker rm -f jenkins || true > /dev/null
	docker run -itd --name jenkins --rm opstree/jenkins:1.0