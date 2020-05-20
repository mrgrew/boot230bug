# Boot 230 Bug

## Overview

This Spring Boot project uses Spring Data JDBC with a test depending on HSQLDB.
The build succeeds with Spring Boot 2.2.7 but fails with Spring Boot 2.3.0.

The log output shows the following insert statement generated using Spring Boot 2.3.0:
```sql
INSERT INTO "stats.counter" ("COUNTER_NAME") VALUES (?)
```

This is the working statement generated using Spring Boot 2.2.7:
```sql
INSERT INTO stats.counter (counter_name) VALUES (?)
```

Spring Boot 2.3.0 uses Spring Data JDBC 2.0.0 while Spring Boot 2.2.7 uses Spring Data JDBC 1.1.7. A quick scan
of the release notes didn't reveal a reason why the behavior would change.

## Running the tests

Running the tests demonstrates the build failing:
```shell script
mvnw clean test 
```

The build succeeds when depending on Spring Boot 2.2.7 (see branch boot227). 