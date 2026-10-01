# spring-native-demo

A tiny Spring Boot app (`GET /greet?name=...`) compiled to a native image with Spring Native, so it starts in milliseconds instead of seconds.

Companion code for my article [Spring Native: Start Spring Boot Application in Less Than 100ms (with Example)](https://medium.com/@kumarprabhashanand/spring-native-start-spring-boot-application-in-less-than-100ms-with-example-bdb42982ce30).

## Run it

Build the native image with Cloud Native Buildpacks (needs Docker):

```
./gradlew bootBuildImage
docker run --rm -p 8080:8080 spring-native-demo:0.0.1-SNAPSHOT
```

Then `curl "localhost:8080/greet?name=you"`.

Spring Boot 2.6 with Spring Native 0.11 (experimental at the time; Spring Boot 3 has native support built in now).
