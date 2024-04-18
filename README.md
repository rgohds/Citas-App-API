Estatus Travis CI: <img src="https://app.travis-ci.com/rgohds/Citas-App-API.svg?token=8AZHV9emiQXrppbG7XNx&branch=develop">

# Proyecto 
Citas Pilates

## Descripción

Este proyecto se enfoca en desarrollar una solución que cubra la necesidad de un cliente que en la actualidad cuenta con un gimnasio pero busca incrementar su propuesta de valor a sus usuarios, impartiendo clases específicas, iniciando con pilates, para lo cual se apoyo en un proveedor de desarrollo de software y en el cual se ha plasmado en este proyecto.

## Problematica

Existe la necesidad de un de los clientes de expandir su propuesta de valor, en la actualidad el cliente cuenta con un gimnasio y quiere extender sus servicios proporcionando clases específicas, de forma inicial en pilates, con múltiples horarios, dando flexibilidad a sus clientes para comprar sesiones y posteriormente utilizarlas durante un periodo o vigencia y si bien este proceso pudiera hacerse de forma tradicional, se busca dar esa flexibilidad proporcionando una herramienta que facilite a sus clientes poder agendar sus sesiones, comprar los paquetes, etc.

## Solución

La solución que se plantea, consiste en una aplicación web, que permita en la parte administrativa realizar ciertas actividades como la gestión de datos maestros de instructores, clases, horarios disponibles, confirmar pagos (debido a que de manera inicial no habría integración con una pasarela de pagos), cancelar clases por eventualidades o por solicitud de un cliente, así como los días inhábiles.

y de cada al usuario final, que el sistema le permita realizar a manera de autoservicio la compra de paquetes de clases, su consumo o asignación de cuando desea tomarlas dentro una vigencia de tiempo dada por el paquete comprado

La solución ha sido dividida en 2, una enfocada en el front end (web) [CitasApp](https://github.com/rgohds/Citas-App.git), empleando Angular con PrimeNG y otra en las reglas de negocio generando un API REST empleando Java con Spring Boot [CitasAPP-API](https://github.com/rgohds/Citas-App-API.git).

## Arquitectura

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/8bfaf92d-d774-4e22-be7a-7faed96636f3)

## Tabla de Contenidos

- [Requerimientos](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#requerimientos)
- [Instalación](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#instalaci%C3%B3n)
- [Configuración](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#configuraci%C3%B3n)
- [Uso](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#uso)
- [Contribución](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#contribuci%C3%B3n)
- [Roadmap](https://github.com/rgohds/Citas-App-API/blob/develop/README.md#roadmap)


## Requerimientos

La solución se dividio en 2 secciones, como se describe en la descripción de la arquitectura.

Los requerimientos de software para la aplicación web (angular):

- Node.js, que puede ser descargado en https://nodejs.org/en/download/current, para el momento de esta publicación se empleo la versión 21.7.3, en esta versión, este software se requiere para la instalación del NPM (node package management), para poder realizar las intalaciones subsecuentes.
- Angular 
- PrimeNG [Guía oficial](https://primeng.org/installation)
- [Visual Studio Code](https://code.visualstudio.com/download)
  - en ese sentido se recomiendan los siguientes plug in:
  -   [Angular Snippets (versión 16)](https://marketplace.visualstudio.com/items?itemName=johnpapa.Angular2)
  -   [Angular 17 Snippets (versión 17)](https://marketplace.visualstudio.com/items?itemName=Mikael.Angular-BeastCode)

Para el caso de la solución de parte del backend, los requerimientos:
- JDK (Java SE Development Kit) [versión 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [IDE Eclipse for Enterprise Java and Web Developers](https://www.eclipse.org/downloads/packages/)
      ![image](https://github.com/rgohds/Citas-App-API/assets/127057257/784c234b-e5a1-4f68-81c2-b794a95e258b)
- Spring Tools desde el marketplace eclipse
- Sql Server 2019, de forma local o servicios de nube.


## Instalación

Como primer paso se debe instalar [NodeJS](https://nodejs.org/en/download/current)

Similar a la siguiente:

<img width="602" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/6e88fd08-bc24-46c2-9d87-c6d9200e8612">

Ejecute el programa descartado para proceder a instalar:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/36348aec-1e29-4433-9b59-305992143fa3">

Acepte el acuerdo de licencia:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/93676312-5732-4d8d-9f45-078124bc1a4b">

Confirme el directorio de instalacion:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/0b17f04a-d29d-466d-85c5-6ccd792eb60a">

Sin realizar cambios en los componentes:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/373c5345-f2b8-414f-b7e0-9b4fe165ac5c">

Seleccione la instalacion:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/a876780b-40b9-4568-af10-88098424abf1">

Al finalizar se desplegara una pantalla similar a la siguiente:

<img width="387" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/e311ce07-c383-49a4-b08f-f27be6efb327">

Posteriormente procederemos a instalación de angular [guía oficial angular](https://angular.io/guide/setup-local).

Esto se debe realizar en línea de comando en windows o power shell:
- npm install -g @angular/cli
  
<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/6940678f-c5a6-4b83-94eb-539f777c17d0">

Al concluir se visualizara similar a la siguiente:

<img width="385" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/525597e6-15a9-403e-96fc-8d9b54a755dd">

Posteriormente procederemos a la instalacion de PrimeNG, de forma similar empleando power shell

npm install primeng

al finalizar se observara similara a la siguiente:

<img width="315" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/d6e5154b-cbaa-4c04-919e-f749fd9b80ed">

Posteriormente [Visual Studio Code](https://code.visualstudio.com/download)

<img width="778" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/f6448a0d-2216-4994-86c1-30fbedc22701">

Al ejecutar el instalador, acepte la licencia:

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/388571a4-a153-49e1-ab50-502ef50fa818">

confirme el directorio de instalacion:

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/a5859e4d-85ec-48c3-827b-f48cf2e7a46f">

Continue:

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/ab3b0f41-e67b-4118-b5ac-d63e8ca3af1a">

Continue:

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/d327f4a2-06d8-43d3-a9f0-bd054ce5bf30">

Confirme para proceder a la instalacion:

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/7afeff7a-10d1-47c2-b31a-25626a12cb6d">

Al finalizar se visualizara una pantalla similara a la siguiente: 

<img width="449" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/a97d216f-d3d9-47bf-b49f-98ef912cb1cf">

Posteriormente los snippets de visual studio code:

<img width="626" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/d77954a3-9e34-4ce3-bd9a-ca7bda0fef54">

y proceda a la instalacion:

<img width="666" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/c88537ce-8424-420f-aaef-5f927947f970">

de forma similar instale el siguiente snippet:

<img width="728" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/fcf930d2-543c-4ff7-8f50-d9f42936647d">


Instalacon de JDK 17:

seleccione el instalador:
<img width="998" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/ac1fa5b6-e05c-4793-b261-5c60e5b54def">

Seleccione "Next":

<img width="392" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/b7314bbb-e63b-4fcc-b168-a50f8339d82b">

Nuevamente seleccione "Next" o ajuste el directorio de instalacion:

<img width="392" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/09b962a8-1a6b-4f6a-86c5-b841a1465b44">

Al concluir se mostrara una pantalla similar a la siguiente:

<img width="392" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/8eb7d74e-f7ef-4694-a33e-a87f20268ccc">

Instalacion de Eclipse:

Proceda a descargarlo:

<img width="397" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/b0b57221-f65d-4a9a-a8a1-956214bab24e">

una vez descargado descomprima el .zip (eclipse no requiere instalacion) en un directorio donde se descomprimira el software:

<img width="664" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/43c01504-a847-41df-b774-11b690b62fe1">

de una forma similar a la siguiente:

<img width="559" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/648cb404-1ffd-474b-8d83-0f9330e4bad7">

proceda a ejecutar eclipse:

<img width="572" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/fdba55d5-bf41-4a98-a05f-75e6147b941e">

proceda a seleccionar la ubicacion del workspace y puede marcar la opcion para que no vuelva a ser solicitado, en mi caso la he cambiado:

<img width="428" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/5d6dbe2e-2e61-4e6f-8edc-6ebb543a25d8">

En la primera ejecucion se presentara una pantalla similar a la siguiente, donde podra seleccionar si desea excluir a eclipse del scan de windows defender:

<img width="500" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/a8342381-de22-451d-8f08-9b123c140ddd">

Spring Boot:

Para la instalacion de Spring Boot, seleccione del menu Help la opcion de Eclipse Marketplace:

<img width="531" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/1778d7b4-f0d0-4305-af28-88dd44292f66">

procedemos a buscar con la palabra "Spring" y seleccionamos la version 4:

<img width="428" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/ae8d3af8-fe2a-4fa3-89d6-d14f781b801b">

marcamos todas las opciones y confirmamos:

<img width="428" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/30a885b0-f4ae-4acc-88fc-519549b9be2f">

Debemos aceptar los terminos:

<img width="581" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/f1710a55-abba-4b13-85c0-45bf41d3d9ff">

Seleccionamos todos en los certificados:

<img width="635" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/1488abb2-6f9a-4cd4-b665-e9de1df2cb29">

De forma similar:

<img width="635" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/e0f01ed3-d475-4722-ab06-debc91b83228">

Al final del proceso se solicitara reiniciar el entorno de Eclipse:

<img width="405" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/5df413b8-8201-499f-8ed1-280e74adfe7e">





Sql Server 2019

Tras crear la base de datos en SQL Server y crear el dbo de la base de datos, es necesario crear la tabla tblinstructor, el script para este fin se encuentra :
https://github.com/rgohds/Citas-App-API/wiki/Sql-Server-Script-%E2%80%90-tblInstructor

[GitHub Desktop](https://desktop.github.com/)

Proceda a descargarlo:

<img width="754" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/156f468e-b87b-4205-92b5-c5a5b4e14328">

Para realizar la descarga de las aplicaciones, ejecute GitHub Desktop:

<img width="725" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/2ae1554f-6489-4bc5-b5bb-5df04878e946">

seleccione la opcion de clonar un repositorio desde internet:

<img width="725" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/32bde9eb-af76-4d11-b7dc-1aff1afc0dc3">

seleccione el repositorio de Citas-App-API y ajuste el path donde sera generado el repositorio, cambiando el nombre a spring-boot-backend-apirest-RE-1:

<img width="959" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/14a47f5c-305b-4c1e-b80e-94b940a3465e">

en el caso de repositorio de terceros, introduzca el URL https://github.com/rgohds/Citas-App-API.git y cambie el nombre a spring-boot-backend-apirest-RE-1:

<img width="962" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/d4fc8ef3-a28f-4375-90e6-f4df48116798">

Posteriormente en eclipse abra el proyecto:

<img width="1004" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/64143331-0345-4d24-85db-f50f0cde9227">

selecionando el path del mismo:

<img width="483" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/a8d9d883-08e6-47f9-8c13-477989bbc6f6">

y posteriormente proceda a ejecutarlo seleccionando la ejecucion como una spring boot app:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/f0e15d12-d4b0-47c8-81ca-8afb6466a1ea)

podra observar en la consola, la ejecucion:

<img width="998" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/32458571-ce4b-4a58-8ed3-ccd2bf28c452">

Para el proyecto del front end de angular, de forma similar introduzca los datos del repositorio y el directorio destino:

<img width="962" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/be93754e-0ddc-42ee-8f04-bc5956aff1bb">

GitHub desktop presentara una pantalla similar a la siguiente:

<img width="962" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/175c5406-1f10-4183-97d5-81ea4d089339">

En PowerShell cambie al directorio de la aplicacion y ejecute el comando ng serve -o, de forma similar:

<img width="1033" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/e731dc6e-895b-4e5e-8277-b99678c01f68">

Tras la ejecucion se abrira un browser presentando una pantalla similar a la siguiente:

<img width="1049" alt="image" src="https://github.com/rgohds/Citas-App-API/assets/127057257/2410a830-b535-4090-a4d9-ad19f4430c2f">



Como realizar pruebas:

Para realizar una prueba de forma manual con el API Rest, solo es necesario ejecutar la aplicación:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/538cf1b3-4fbb-4231-91a9-ccaad58a0d2a)

y realizar una consulta directamente en el navegador como chrome de forma similar a la siguiente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/c6349b4e-f612-4d1c-a70f-cd5faca9568e)

o empleando postman, ej: http://localhost:8080/api/instructores

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/c1958e9f-de23-4c64-bfce-05c19721f6eb)

o similar a este segundo ejemplo donde se consulta el id 1:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/3b4ebda6-ebc5-4b7b-ad71-8b6fc7b9fb47)



## Configuración

Para el caso del API Rest, es necesario ajustar los parametros de conectividad directamente en el application.properties, dentro del roadmap se espera cambiar la ubicación de estos datos:

spring.datasource.url = para establecer la conexión a la base de datos, en la actualidad apunta a un servidor en nube
spring.datasource.username = con el usuario dbo de la BD
spring.datasource.password = pwd del usuario dbo

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/51cb1fce-71ef-4cef-963d-b63b28e58e65)

Para el caso de la aplicación web, dependiendo de la entidad, por el momento se debe modificar la ubicación del API Rest, en el siguiente ejemplo se encuentra fijo su ejecución de forma local en el puerto 8080, de forma similar en el roadmap se espera ajustar posteriormente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/3a7bbb9f-9803-41f2-a643-3b944fc51acb)


## Uso

Como usuario por el momento entraras de forma local, vía el navegador como chrome y observaran una pantalla similar a la siguiente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/7551b0d6-3517-42b7-a957-12daa0fb894a)

Por el momento al ser un MVP, se cuenta solamente con un catalogo terminado, el de instructores, lo podrás acceder mediante la opción del menu dentro de la sección de "Admin":

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/d1fd9670-4bd2-46c8-9b9f-4b136d167c0a)

presentando una pantalla similar a la siguiente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/ea2b0719-3d56-469f-a0e9-d435c3094c70)

donde se cuentan con las alternativas básicas de mantenimiento:

**Alta de Instructores**

Seleccione el botón "Nuevo":

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/5e730ab3-3bd0-4bf4-8caa-6c2aaeb8c773)

Introduzca los datos solicitados, donde el nombre corresponde al nombre o en caso de tener un segundo nombre sería en el primer paso indicado, posteriormente introduzca los apellidos del instructor en el segundo paso, para por último presionar el botón de Save:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/467407da-fc6f-43df-8215-3946275c190b)

el sistema presentara un mensaje confirmando la creación del registro, así como podra ser observado en el listado del registro:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/16caa3a1-d991-4ec7-a692-929f5c395574)

**Modificación de un Instructor**

Para modificar los datos de un instructor, tan solo es necesario seleccionar el icono en forma de lapiz del registro que se desea modificar:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/8fbe368d-43f0-43c7-a273-68f8cdcd15df)

el sistema presentara una ventana con los datos actuales del instructor:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/7497ed91-f8bd-49c3-8d81-825307d4e737)

donde usted podrá proceder a ajustar ya sea el nombre o los apellidos, como en el siguiente ejemplo:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/4476bda7-05bd-4e44-b477-4534664bd0c1)

Una vez selecciona la opción para guardar, de igual forma el sistema presentara un mensaje de confirmación y podrá observar el registro actualizado:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/bfdc0bf5-8930-42b5-9e40-4da82284a922)

**Borrar un instructor**

De forma similar para poder borrar un registro de algun instructor, tan solo es necesario presionar el icono de bote de basura del registro que se desea eliminar:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/9ae21096-8644-47f1-a49f-879ad9d89209)

El sistema le solicitara una confirmación antes de eliminarlo:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/56aa1e44-2725-4034-860b-a87ac1b8e488)

presentando una confirmación una vez eliminado y dicho registro desaparecera del listado:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/bba3df09-b83d-4f92-8dd6-c7b720a617e8)

**Exportar a CSV**

Tambien es posible exportar el listado a un formato CSV que es posible abrir en excel, tan solo seleccione la opción "Export"

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/4d2136ba-2540-4232-a0ee-1b2d4248e96c)


y una vez exportado visualice los archivos descargados de su navegador:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/31712a64-3116-43b2-89ec-ba0899af484d)

al abrirlo se podrá observar un listado sencillo con los atributos del instructor:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/03725d01-e7d8-42e3-a6df-9aa45beb0d3a)

Tambien es posible visualizar el siguiente video donde se muestra la funcionalidad:



## Contribución

Para realizar contribuciones la forma de trabajo es la siguiente, realizar la creación de un nuevo Branch nuevo a partir del branch de develop.

Lo puedes realizar desde eclipse, seleccionando desde la raíz del proyecto y la opción de equipo, en la opción de Switch to->New Branch

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/00e73c35-ad09-4ffa-96bf-d850996e84d0)

Para posteriormente introducir el nombre del Branch, buscando identificar el objetivo, en este ejemplo estamos modificando el API Rest, agregando los metodos CRUD sobre la entidad Instructores:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/992a096d-ed5f-4438-a747-b3906f2c7e76)

Una vez concluidos los cambios, de forma similar ahora seleccione la opción de commit:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/0124a0f9-d350-4989-81f6-80abaa0265b0)

Lo cual presentará en la parte baja los archivos modificados y podrá introductir los comentarios de dicho commit, para posteriormente seleccionar la opción Commit and Push:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/0bc251f6-59ee-48ad-a829-e44daf16d4e6)

Eclipse solicitar los datos de acceso a github:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/5d1ab35c-7985-4e04-8884-a112f87b0f20)

En caso de que Eclipse no acepte las credenciales, tendrá que generar un token de la siguiente forma:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/b8277db5-4f4c-4990-b8f6-2273fa0c0578)

Para posteriormente seleccionar la opción de settings:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/8059f5f6-891c-4dd2-9096-846f0ce473e0)

y posteriormente la opción de "Developer Settings":

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/2872c2f0-ef46-4cc3-a696-e0ce75c2c8c4)

y "tokens (classic)"

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/8cba6663-1c6f-4e3c-8a62-19d3d8204490)

en mi caso ya había generado el token pero lo he olvidado, así que se seleciona nuevamente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/1d550200-702a-4c47-bcc8-a9adac63a71c)

y se selecciona la opción de regenerar el token:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/6b82157c-46d6-40cd-aa66-34a1cb3c0726)

presentara una pantalla similar a la siguiente:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/858f9046-8ea7-40ff-b829-0a681052b941)

vuelva a introducir el usuario y el token recien generado:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/02228fbc-0410-4002-a3e3-eb6c7f816609)

y posteriormente una pantalla similar donde seleccionara "Close":

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/e4e51c73-bffb-43df-8957-226c29e73bca)

al revisar el repositorio de Github, podremos observar el push que acabamos de realizar y podremos generar el pull request:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/e9e51c47-7ddf-47af-940f-2a89a9125980)

En el, deberemos capturar mayor detalle de las modificaciones realizadas:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/f55d7883-e6c1-4947-9f2c-3146980563d4)

Una vez generado se podrá autorizar dicho pull request, en la siguiente imagen se podrá observar la integración con travis-ci, donde realiza el proceso de integración continua:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/67dcdd3a-003e-440b-8e4c-c573d6d9c7ab)

y una vez concluido se podrán observar las validaciones terminadas:

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/e942bd1b-ed35-430b-82c6-36e9118f1b5e)

al concluir, github te dara la opción de borrar el branch :

![image](https://github.com/rgohds/Citas-App-API/assets/127057257/355b1503-7df8-48de-b62a-040317502011)




##  Roadmap
