## Tabla de contenido
1. [Información general](Información_general)
2. [Tecnologías](Tecnologías)
3. [Ejecución](Ejecución)
### Información general
***
Este proyecto fue creado con el fin de poner a prueba los skill para automatizar front.
La prueba consiste en ingresar a la pagina de Fallabela desde el buscador de google,
buscar celulares y agregar uno a la bolsa de compras.

Se construye el feature dando una descripción a alto nivel de una de las funciones de la APP, 
se escribe el caso de prueba en lenguaje Gherkin, el cual es el lenguaje común entre negocio,
Qa y desarrollo. Esta dividido en característica, comportamiento y acción. Para este caso se
elige comparar los valores más importantes del resumen de la orden.

Se encuentra en la captura del resumen de la orden que los elementos de precio del articulo 
y precio del seguro comparten la misma clase dentro del DOM y la única clave que los diferencia
es su contenido (Precio artículo, Precio seguro) no es un bug pero puede ser una mala practica 
por parte de desarrollo no tener un distintivo para este valor. Se puede sugerir agregarle un 
distintivo a una de las clases.


## Tecnologías
***
Esta es la lista de tecnologías utilizadas:

* [Patron de diseño ScreenPlay](https://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html)
* [Junit](https://mvnrepository.com/artifact/junit/junit/4.12) 
* [ChromeDriver 88.0.4324.96](https://chromedriver.chromium.org/) 
* [Serenity-Cumcumber](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber/)
* [Serenity-WebDriver](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay-webdriver/)
* [Serenity-Core](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core/)
* [Serenity-ScreenPlay](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay/)
## Ejecución
***
Se debe seguir los siguientes pasos 
```
* Validar la version del navegador chrome y agregar en la siguiente ruta 
  la version de chrome driver correspondiente en caso que no corresponda
   "src/test/resources/webdriver/windows/chromedriver.exe"

* Se puede ejecutar todo el proyecto desde la terminal de gradle con el
  comando $gradle clean test

* Ejecutar la clase CompraCelularRunner en intelliJ, puede correr con gradle
  o Junit

* El reporte quedan en la ruta: target\site\serenity\index.html

```
