# fugerit-template-project

Template for some common frameworks

## Micronaut 4 (fugerit-micronaut4-template)

Module [fugerit-micronaut4-template](fugerit-micronaut4-template/README.md) generated with command : 

```shell
mn create-app --build=maven --jdk=21 --lang=java --test=junit --features=openapi,openapi-explorer,yaml,graalvm,micronaut-aot,netty-server,serialization-jackson org.fugerit.java.template.fugerit-micronaut4-template
```

## Quarkus 3 (fugerit-quarkus3-template)

Module [fugerit-quarkus3-template](fugerit-quarkus3-template/README.md) generated with command : 

```shell
mvn io.quarkus.platform:quarkus-maven-plugin:3.14.2:create \
-DprojectGroupId=org.fugerit.java.template \
-DprojectArtifactId=fugerit-quarkus3-template \
-Dextensions='rest,rest-jackson,config-yaml,smallrye-openapi'
```

## SpringBoot (fugerit-springboot3-template)

Module [fugerit-springboot3-template](fugerit-springboot3-template/README.md) generated with [spring initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.3.3&packaging=jar&jvmVersion=21&groupId=org.fugerit.java.template&artifactId=fugerit-springboot3-template&name=fugerit-springboot3-template&description=Fugerit%20SpringBoot%20Template&packageName=org.fugerit.java.template.fugerit-springboot3-template&dependencies=web,native,devtools,lombok).

Project info : 

- base version : 3.3.3
- project : maven
- language : java
- dependencies : Spring Web, GraalVM Native SUpport

## OpenLiberty (fugerit-openliberty-template)

Module [fugerit-openliberty-template](fugerit-springboot3-template/README.md) generated with <https://openliberty.io/start/>.

Project info : 

- base version : 24.0.0.9
- project : maven
- jakarta EE version : 10.0
- microprofile version : 6.1
