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
## Creando el primer módulo para el proyecto shared-library
- Clic derecho en el proyecto padre **my-company-project/New/Module...**
- En la ventana que se abre, completamos:
  ````
  Name: shared-library
  Location: lo dejamos tal cual
  Languaje: Java
  Build system: Maven
  JDK: 17
  Parent: my-company-project <---- seleccioamos nuestro proyecto padre
  GroupId: lo dejamos tal cual
  ArtifactId: shared-library <--- es el mismo nombre del proyecto
  ````
- Clic en create

## Modificaciones luego de haber creado el módulo shared-library
1. Como el proyecto shared-library es un módulo de my-company-project, entonces hereda las configuraciones realizadas en el pom.xml de su padre,
   por lo tanto, las properties creadas automáticamente las eliminamos puesto que el pom.xml del padre ya las tiene.
2. En el pom.xml del shared-library solo se define el **artifactId**, mientras que los
   valores para su **groupId**, **version**, las hereda del pom padre, ya que cuando creamos el módulo shared-library las definimos
   igual que el de su padre.