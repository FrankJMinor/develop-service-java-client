# develop-service-java-client
Desarrollo de un microservicio RestAPI en Java

# Objetivo
Implementar servicio de java como su equivalente a Python 
desde spring.io o a partir de una especificaciond e OpenAPI swagger

# Metodos
Los metodos a utilizar son los siguientes:
1. GET: Prueba de llamado al servicio raiz

# Contribuyentes
* Francisco Granados

# Repositorios
* GitHub [link](https://github.com/FrankJMinor/develop-service-java-client.git) (develop)

# Intrucciones de Construccion a partir de una especificacion
* 1.- Instalar nodeJs y ejecutar npm install @openapitools/openapi-generator-cli -g
* 2.- Descargar archivo jar de la url: https://repo1.maven.org/maven2/org/openapitools
      /openapi-generator-cli/4.3.1/openapi-generator-cli-4.3.1.jar y colocar donde se desea crear el proyecto
* 3.- Colocar archivo YAML donde se desea crear el proyecto
* 4.- Colocar archivo Json de estructura del proecto.
* 5.- Ejecutar la siguiente linea de comando java -jar openapi-generator-cli-4.3.1.jar generate -g spring -i specification-client.yml -c config-clientes.json -o usuarios
