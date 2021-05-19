REST Assured Test
==================
Proyecto creado para ejecutar pruebas de API Rest

Recursos necesario
---
Java 8 ó Java 11
maven 
IDE (Ambiente de desarrollo integrado)

Que se ejecuta?
---
Puede abrir cada clase de prueba src\test\javay ejecutarlas todas, pero le recomiendo que la ejecute mediante la línea de comandos. Nos permite ejecutar diferentes estrategias de ejecución de pruebas y, también en un pipeline de jenkins.

Cómo ejecutar?
---
Los conjuntos de pruebas se pueden ejecutar directamente con su IDE o mediante la línea de comandos. Si ejecuta, mvn testtodas las pruebas se ejecutarán porque es el ciclo de vida normal de Maven para ejecutar todas las pruebas.

Ejecución Jenkins
---
En el archivo jenkinsFile se especifican los stage con la tarea de la ejecución (Api Tests), uno de generación de reporte (Generate HTML report) y una tarea Post, para la notificación de los seguimientos de ejecución.

Correr tests con maven
---
```bash

mvn clean compile test
```
