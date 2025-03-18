# README - Backend

## Descripción
Este es el backend de la aplicación de gestión de productos, desarrollado en Spring Boot con PostgreSQL como base de datos.

## Requisitos
- Java 17 o superior
- Maven
- PostgreSQL (versión recomendada: 14 o superior)

## Instalación
1. Clonar el repositorio:
   ```sh
   git clone https://github.com/tu-usuario/tu-repositorio-back.git
   ```
2. Ingresar al directorio del proyecto:
   ```sh
   cd tu-repositorio-back
   ```
3. Configurar la base de datos PostgreSQL:
   - Crear una base de datos llamada `productos_db`.
   - Configurar el usuario y contraseña en `application.properties` o `application.yml`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/productos_db
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     ```

## Ejecución
1. Compilar y ejecutar la aplicación:
   ```sh
   mvn spring-boot:run
   ```
2. El backend estará disponible en `http://localhost:8080`.

## Endpoints Principales
- `GET /productos`: Obtener todos los productos.
- `POST /productos`: Agregar un nuevo producto.
- `PUT /productos/{id}`: Editar un producto existente.
- `DELETE /productos/{id}`: Eliminar un producto.

## Pruebas
Para ejecutar las pruebas unitarias:
```sh
mvn test
```
