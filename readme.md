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
4. **Conectar a la Base de Datos MySQL**

   Una vez que el contenedor esté en ejecución, puedes conectarte a la base de datos MySQL. Hay varias formas de hacerlo:

   - **Usando el Cliente MySQL desde la Línea de Comandos**

     Si tienes el cliente de MySQL instalado en tu máquina, puedes conectarte al contenedor ejecutando:

     ```bash
     mysql -h 127.0.0.1 -P 3306 -u root -p
     ```

     Se te pedirá que ingreses la contraseña que especificaste anteriormente (`mi_contraseña`).

   - **Usando Docker Exec**

     También puedes conectarte directamente al contenedor utilizando `docker exec`:

     ```bash
     docker exec -it mi_mysql mysql -u root -p
     ```

     Luego, ingresa la contraseña cuando se te solicite.

   - **Usando un Cliente Gráfico (como MySQL Workbench)**

     Si prefieres una interfaz gráfica, puedes usar herramientas como MySQL Workbench, DBeaver o HeidiSQL. Conéctate utilizando `localhost` como host, `3306` como puerto, `root` como usuario y `mi_contraseña` como contraseña.


