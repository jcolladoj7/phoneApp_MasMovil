# phoneApp_MasMovil
Code Challenge PhoneApp MasMovil

## Run this project with

1. Build docker image with Maven profile
```
docker build -f Dockerfile -t docker_phoneapp .
```

2. Run docker with image

```
docker run -p 8080:8080 docker_phoneapp
