FROM openjdk:17
COPY ./target/Shopdatabase-0.0.1-SNAPSHOT.jar.original ./
WORKDIR ./
ENTRYPOINT ["java", "-jar", "Shopdatabase-0.0.1-SNAPSHOT.jar.original"]
