# [Create Multi-Module Maven Project in IntelliJ IDEA](https://www.youtube.com/watch?v=XqC1zeFdxMs)

## Create the Root Project
- Creamos un New Proyect
- Completamos los siguientes campos:
 ```
Name: my-company-project
Location: Seleccionamos ubicación de nuestro proyecto
Language: Java
Build system: Maven
JDK: 17
GroupId: com.magadiflo.my-company-project
ArtifacId: my-company-project
 ```
- Clic en create

## Modificaciones luego de creado el proyecto raíz
1. Por defecto, creará el directorio **/src** y dentro de él habrán varios directorios propios de
  un proyecto de java. Nosotros eliminaremos ese directorio **/src** ya que este proyecto que
  acabamos de crear será el proyecto padre, solo tendrá nuestro pom.xml.
2. En el archivo **.gitignore** agregamos el directorio **.idea/** para que git no le dé seguimiento.
3. En el **pom.xml**, se crea implícitamente por defecto el tipo de packaging a jar, le cambiamos explícitamente a pom:
  ````   
  <packaging>pom</packaging>
  ````
