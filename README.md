﻿
<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>

    Considere el siguiente problema:

    Escriba un programa corto donde se tenga un array de enteros como parámetro de entrada y otro como resultado de salida.
    Se necesita calcular las siguientes operaciones.
    
    Clasifica :
    Números positivos.
    Números negativos.
    Números igual a 0.
    
    Calcula el número de elementos de cada clasificación, dividido por el número del array.
    Represente el número de cada operación con un redondeo de 4 decimales.
    Devuelva un array de salida con cada operación en el siguiente orden [Npositivos, Nnegativos, Nzero]
    
    Se atiente al siguiente ejemplo:
    
    Array: [1, 2 ,-8, -2, 0, 9]
    
    Números positivos = 1, 2, 9
    Números negativos = -8, -2
    Números igual a 0 = 0
    
    Resultado: [(Npositivios/Array.size), (Nnegativos/Array.size), (Nzero/Array.size)]


    En la carpeta 'src/main/java/es/geekshubs/academy/Numbers.java' se encuentra el fichero con la definición de nuestro
    método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/NumbersTest.java' se encuentra el fichero con la suite de test.

    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    A continuación se muestran los resultado que se tienen que obtener tras desarrollar el algoritmo.
    
    [Suite Test]

    NumbersTest.test01 - OK
    NumbersTest.test02 - OK
    NumbersTest.test03 - OK
    NumbersTest.test04 - OK
    NumbersTest.test05 - OK
    NumbersTest.test06 - OK
    NumbersTest.test07 - OK
    NumbersTest.test08 - OK
    NumbersTest.test09 - OK

    Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.665 s
    [INFO] Finished at: 2021-05-07T09:44:22Z
    [INFO] Final Memory: 17M/210M
    [INFO] ------------------------------------------------------------------------

    Process finished with exit code 0



## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
