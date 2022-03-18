FROM java:8

MAINTAINER ningzhicheng

VOLUME /tmp

ADD ./target/*.jar /devops-springboot.jar

ENTRYPOINT ["java","-jar","/devops-springboot.jar"]

EXPOSE 8888