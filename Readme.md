## Tabla de contenido
1. [Información general](Información_general)
2. [Tecnologías](Tecnologías)
3. [Ejecución](Ejecución)
### Información general
***
Este proyecto fue creado con el fin de poner a prueba los skill para automatizar front.
La prueba consiste en ingresar a la pagina de Fallabela desde el buscador de google,
buscar celulares y agregar uno a la bolsa de compras.


## Tecnologías
***
Esta es la lista de tecnologías utilizadas:

* [Patron de diseño POM](#)
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
