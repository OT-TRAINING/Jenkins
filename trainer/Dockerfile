FROM ubuntu:20.04

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get -y update
RUN apt-get -y install wget systemctl openjdk-17-jre git
RUN apt-get -y install make maven
ADD https://github.com/gitleaks/gitleaks/releases/download/v8.18.1/gitleaks_8.18.1_linux_x64.tar.gz /usr/local/bin/

WORKDIR /src