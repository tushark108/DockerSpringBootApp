FROM openjdk:27-ea-oraclelinux8
ADD target/DockerDemo.jar DockerDemo.jar
ENTRYPOINT ["java","-jar","/DockerDemo.jar"]