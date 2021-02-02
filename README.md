# phoneApp_MasMovil
Code Challenge PhoneApp MasMovil

## Run this project

1. Build jar
```
mvn clean install
```

2. Run jar

```
java -jar ./target/phoneApp-0.0.1-SNAPSHOT.jar

```

## Run this project with Docker Container

1. Build docker image with Maven profile
```
docker build -f Dockerfile -t docker_phoneapp .
```

2. Run docker with image

```
docker run -p 8080:8080 docker_phoneapp
