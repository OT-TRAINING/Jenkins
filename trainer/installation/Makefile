include ../Makefile

install-jenkins:
	wget -O /usr/share/keyrings/jenkins-keyring.asc   https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
	echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]   https://pkg.jenkins.io/debian-stable binary/ | tee /etc/apt/sources.list.d/jenkins.list > /dev/null
	apt-get -y update
	apt-get -y install jenkins

install-jdk:
	apt-get -y install fontconfig openjdk-17-jre

start-jenkins:
	systemctl start jenkins

get-jenkins-pass:
	cat /var/lib/jenkins/secrets/initialAdminPassword