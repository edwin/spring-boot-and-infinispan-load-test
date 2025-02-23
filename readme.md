# Integrate Spring Boot and Remote Infinispan 15

## Version
- Spring Boot 3.0.5
- Infinispan 15.0.8.Final
- Java 17

## How to Start Infinispan
```
$ docker run -p 11222:11222 -e USER="admin" -e PASS="password" infinispan/server:15.0.8.Final
```

## How to Test
```
$ curl -kv http://localhost:8080/generate-data
```

```
$ curl -kv http://localhost:8080/generate-get
```

## Logs
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

23-02-2025 13:03:24 [main] INFO  com.edw.Main.logStarting - Starting Main using Java 17.0.6 with PID 14400 (spring-boot-and-infinispan-load-test\target\classes started by EDWIN in spring-boot-and-infinispan-load-test)
23-02-2025 13:03:24 [main] INFO  com.edw.Main.logStartupProfileInfo - No active profile set, falling back to 1 default profile: "default"
23-02-2025 13:03:25 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer.initialize - Tomcat initialized with port(s): 8080 (http)
23-02-2025 13:03:25 [main] INFO  org.apache.catalina.core.StandardService.log - Starting service [Tomcat]
23-02-2025 13:03:25 [main] INFO  org.apache.catalina.core.StandardEngine.log - Starting Servlet engine: [Apache Tomcat/10.1.7]
23-02-2025 13:03:26 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].log - Initializing Spring embedded WebApplicationContext
23-02-2025 13:03:26 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.prepareWebApplicationContext - Root WebApplicationContext: initialization completed in 1139 ms
23-02-2025 13:03:26 [main] INFO  org.infinispan.HOTROD.actualStart - ISPN004021: Infinispan version: Infinispan 'I'm Still Standing' 15.0.8.Final
23-02-2025 13:03:27 [main] INFO  org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver.<init> - Exposing 1 endpoint(s) beneath base path '/actuator'
23-02-2025 13:03:27 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer.start - Tomcat started on port(s): 8080 (http) with context path ''
23-02-2025 13:03:27 [main] INFO  com.edw.Main.logStarted - Started Main in 2.975 seconds (process running for 3.531)
23-02-2025 13:03:27 [RMI TCP Connection(3)-172.21.160.1] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/].log - Initializing Spring DispatcherServlet 'dispatcherServlet'
23-02-2025 13:03:27 [RMI TCP Connection(3)-172.21.160.1] INFO  org.springframework.web.servlet.DispatcherServlet.initServletBean - Initializing Servlet 'dispatcherServlet'
23-02-2025 13:03:27 [RMI TCP Connection(3)-172.21.160.1] INFO  org.springframework.web.servlet.DispatcherServlet.initServletBean - Completed initialization in 2 ms

```