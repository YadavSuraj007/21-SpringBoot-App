FROM openjdk:17
 
 COPY target/21-SpringBoot-App.jar /usr/app/
 
 WORKDIR /usr/app/
 
 ENTRYPOINT ["java", "jar", "21-SpringBoot-App.jar"]
