# Instrucciones para Crear una Base de Datos MySQL con Docker

Este repositorio incluye un ejemplo de cómo crear y ejecutar una base de datos MySQL utilizando Docker.

## Requisitos Previos

- Docker instalado en tu máquina.

## Pasos para Crear la Base de Datos

1. **Descargar la Imagen de MySQL**
   ```bash
    docker pull mysql:latest
2. **Crear y Ejecutar un Contenedor de MySQL**

   Usa este comando para crear y ejecutar un contenedor de MySQL. Especifica un nombre para el contenedor (`mi_mysql`), establece una contraseña para el usuario `root` (`mi_contraseña`), y expón el puerto 3306 para conectarte a MySQL.

   ```bash
   docker run --name mi_mysql -e MYSQL_ROOT_PASSWORD=mi_contraseña -p 3306:3306 -d mysql:latest
3. **Verificar que el Contenedor se Está Ejecutando**

   Para confirmar que el contenedor de MySQL se está ejecutando correctamente, usa el siguiente comando:

   ```bash
   docker ps

