include ../Makefile
REPO=https://github.com/opstree/spring3hibernate.git
BRANCH=java7
# REPO=https://github.com/OT-MICROSERVICES/salary-api.git
clone:
	echo "Fetching code base of repo"
	rm -rf code
	git clone ${REPO} code
	cd code ;\
	git checkout ${BRANCH}

compile:
	cd code ;\
	mvn compile ;\

test:
	cd code ;\
	mvn test
