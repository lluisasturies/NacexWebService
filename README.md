# Nacex WebService
<img src="blob/logo-nacex.png"/>

📦 `NacexWebService` es un módulo para la integración del WebService de Nacex en JAVA.

## Uso
Para utilizar la libreria añadiremos a nuestro `pom.xml` de Maven la dependencia.
```ssh
<dependency>
  <groupId>com.nacex</groupId>
  <artifactId>nacexwebservice</artifactId>
  <version>0.0.1</version>
</dependency>
```

En nuestro código lo inicializaremos de la siguiente manera:
````java
NacexWebService nacexWebService = new NacexWebService("usuario", "password");
````