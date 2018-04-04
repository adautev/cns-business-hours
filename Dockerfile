FROM openjdk:8-jre
MAINTAINER David Flemström <dflemstr@spotify.com>

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/cns-business-time/business-time.jar"]

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/cns-business-time/business-time.jar