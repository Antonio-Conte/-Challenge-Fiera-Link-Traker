# -Challenge-Fiera-Link-Traker

------------------------------
Instrucciones para levantar la app
------------------------------
1- Levantar la base de datos: fiera.
  Ir a la carpeta: [Antes]LevantarProyecto\MySqlServer\Dump20201005, se encuentra un archivo que debe importar en su base de datos: "mysql workbench".
  Debe seguir los siguientes pasos:
  -Crear una conexion local a la base de datos con "Mysql Workbench". 
  -Ir a "Server" -> "Data Import".
  -Se abrira una nueva ventana.Seleccionar el directorio donde se encuentre la base de datos que desea importar.
  -Ir a la pestaña Import Progress y hacer click en "Start Import".

2- Correr la app de Spring.
   Importar el proyecto "fierachallenge" con su compilador de Java preferido.(Recomendado: Java Sprin ToolSuit).
   Correr "Main.java".
   Esperar que levante el proyecto antes de seguir al siguiente paso. 
3- Utilizar los metodos mediante Postman o Swagger.
Swagger : localhost:9099/products/v1/swagger-ui.html

** La aplicacion corre en el puerto 9099.
   La base de datos, en el puerto por defecto: 3306.





