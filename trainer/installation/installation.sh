#!/bin/bash
#docker run -it -v $PWD:/src -p 8080:8080 ubuntu:20.04

function executeInstruction() {
    MESSAGE="$1"
    INSTRUCTION="$2"
    echo $MESSAGE
    echo "Command: $INSTRUCTION"
    ${INSTRUCTION}
    echo "Press a key to continue"
    read
    clear
}

executeInstruction "Run apt update" "apt-get -y update"
executeInstruction "Install wget" "apt-get -y install wget"
executeInstruction "Get LTS key" "wget -O /usr/share/keyrings/jenkins-keyring.asc   https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key"
# executeInstruction "Add debian-stable apt repository." "echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]   https://pkg.jenkins.io/debian-stable binary/ | tee /etc/apt/sources.list.d/jenkins.list > /dev/null"
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]   https://pkg.jenkins.io/debian-stable binary/ | tee /etc/apt/sources.list.d/jenkins.list > /dev/null
executeInstruction "Udate package manager" "apt-get update"
executeInstruction "Install Jenkins" "apt-get install jenkins"
executeInstruction "Install Systemctl" "apt-get -y install systemctl"
executeInstruction "Install JDK" "apt install fontconfig openjdk-17-jre"
executeInstruction "Start Jenkins" "systemctl start jenkins"
executeInstruction "Validate Jenkins started" "ps -ef | grep jenkins"
executeInstruction "Jenkins temp password" "cat /var/lib/jenkins/secrets/initialAdminPassword"
executeInstruction "Installing Git" "apt-get -y install git"