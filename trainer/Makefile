build:
	docker build -t opstree/jenkins:1.0 .

run-vm:
	docker rm -f jenkins || true > /dev/null
	docker run -itd --name jenkins -v ${PWD}:/src -p 8080:8080 --rm opstree/jenkins:1.0

connect-vm:
	docker exec -it jenkins  bash

help:
	@make -qpRr | egrep -e '^[a-z].*:$$' | sed -e 's~:~~g' | sort