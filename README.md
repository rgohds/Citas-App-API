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
- Angular (npm install -g typescript)
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

Se debe proceder a realizar la instalación de angular [guía oficial angular](https://angular.io/guide/setup-local).

Esto se debe realizar en línea de comando en windows o power shell:
- npm install -g typescript
- npm install -g @angular/cli
- 

## Configuración

## Uso

## Contribución

## Roadmap


