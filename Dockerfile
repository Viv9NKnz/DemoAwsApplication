# Usamos Amazon Corretto 17 como base (compatible con AWS)
FROM amazoncorretto:17-alpine-jdk

# Argumento para localizar el JAR generado
ARG JAR_FILE=target/*.jar

# Copiamos el JAR al contenedor
COPY ${JAR_FILE} app.jar

# Exponemos el puerto
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java","-jar","/app.jar"]