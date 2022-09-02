FROM openjdk:11-jdk-slim as build
WORKDIR /workspace/app

COPY .. .

RUN ./discovery-server/mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../../discovery-server/target/*.jar)

FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.app.discoveryserver.DiscoveryServerApplication"]