# spring-boot23-oci-buildpack-ex
Spring boot cloud native build and layered file approach to create the docker image of spring boot application

Example repository by my blog post: https://www.techwasti.com/spring-boot-cloud-native-buildpacks-and-layered-jars/


## Build the Cloud native image for your Spring Boot application
`` $ mvn spring-boot:build-image``

## build Docker image
`` $ docker images| grep spring``

## to run application image
`` $ docker run -d -p 8080:8080  — name springbuildpackex spring-boot23-oci-buildpack-ex:0.0.1-SNAPSHOT``

to check other docker image
`` $ docker images| grep gcr``

## Layered jar using jarmode
``$ java -Djarmode=layertools -jar target/spring-boot23-oci-buildpack-ex-0.0.1-SNAPSHOT.jar list``
