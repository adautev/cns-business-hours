# Introduction
A simple microservice stub for answering the business hours global problem. (;

It is based on a stabe and covered version of http://search.cpan.org/~pryan/Period-1.20/Period.pm.
The solution is implemented by: https://github.com/dhatim/business-hours-java.

Basically this is a great generic microservice candidate for a problem that has been solved in a proprietary(or not?) fashion in many ITSM/CRM/ERP implementations, but I am leaving it here for my own convenience as I am facing this type of requirements whereever I go. (:

The project is based on the Spring hateoas archetype: https://projects.spring.io/spring-hateoas/

Which is based on the Richardson REST maturity model: https://martinfowler.com/articles/richardsonMaturityModel.html

# Installation and usage specifics
The current business time library implementation in Maven is dependant on javafx, that is distributed to Ubuntu 12.04+ via:
sudo apt-get install openjfx

# Example usage

curl --request POST \
  --url http://localhost:8080/validate \
  --header 'Content-Type: application/json' \
  --data '{
	"date": "2016-03-16T13:56:39.492",
	"businessTimeDefinition": "wday{Mon-Fri} hour{9am-6pm}, wday{Sat} hour{9am-12pm}"
}

# Setting up docker
https://docs.docker.com/install/linux/docker-ce/ubuntu/#set-up-the-repository

# Using maven-docker plugin

# Problems faced
https://github.com/spotify/dockerfile-maven/issues/123
