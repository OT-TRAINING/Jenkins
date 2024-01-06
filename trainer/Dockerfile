FROM ubuntu:20.04

ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get -y update
RUN apt-get -y install wget systemctl openjdk-17-jre git
RUN apt-get -y install make maven

WORKDIR /src