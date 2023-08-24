FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_ValidTest_ce75e68f_2d68_4eaf_90f9_9237d27875d6 backend_ValidTest_ce75e68f_2d68_4eaf_90f9_9237d27875d6
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_ValidTest_ce75e68f_2d68_4eaf_90f9_9237d27875d6/target/ValidTest-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar ValidTest-0.0.1-SNAPSHOT.jar"]