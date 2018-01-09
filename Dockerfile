FROM java:8
MAINTAINER dinuka.malalanayake@gmail.com
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} gps-coordinates-receiver.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/gps-coordinates-receiver.jar"]