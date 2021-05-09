# ejercitacion02
ejercicios utilizando java
12) La empresa CoCode está construyendo un software para análisis de calidad de código llamado
Sophie. Este recibe programas para ser analizados y generar un informe de calidad de código. Los
programas se van procesando por orden de llegada y se identifican con un id, un nombre, el nombre
del responsable, un flag que indica si pasó las pruebas unitarias o no y un conjunto de fuentes.
Para la primera versión, se decidió soportar 2 categorías de fuentes: fuentes de lenguajes de
programación (ej. Java, C#, JavaScript) y fuentes de lenguajes de marcado (ej. HTML, XML). Todos
los archivos fuentes tienen un nombre y ubicación (path). Los fuentes de programación tienen un
conjunto de métodos. Cada método tiene un nombre, cantidad de parámetros, la cantidad de
instrucciones y la cantidad de ramificaciones de flujo. Por otro lado, los fuentes de marcado tienen
el tamaño del archivo en KB.
El índice de calidad de los programas, fuentes y métodos es calificable mediante un mecanismo
común definido según las siguientes reglas:
▪ Programas: 0 (cero) si no pasó las pruebas unitarias o el promedio del índice de calidad de sus
fuentes.

▪ Fuentes de programación: promedio de índice de calidad de sus métodos.
▪ Métodos:
5 / (cantidad de parámetros + 1) + 20 / cantidad de instrucciones + 3 / (cantidad de ramificaciones + 1)
▪ Fuentes de marcado:

450 / tamaño en KB

Cada cierto período se ejecuta un proceso que recorre la estructura donde se encuentran los
programas pendientes para validar la calidad de acuerdo a la lógica descrita.
Basado en el enunciado descripto, realizá:
A) El diagrama de clases que lo modelice, con sus relaciones, atributos y métodos.
B) Los métodos indiceCalidad de las clases calificables.
C) El método programasPorDebajoDe que recibe un umbral de calidad mínima y retorna una
lista de programas cuyo índice de calidad esté por debajo de tal valor.
D) El método mostrarDetalleDeMetodo de la clase Programa que recibe el nombre de un
método y muestra por consola su cantidad de parámetros, instrucciones y ramificaciones,
además del índice de calidad. Si no existe, se informa tal situación.
E) El método listadoFuentesMayoresAlPromedio de la clase Programa que retorne una
lista de fuentes cuyo índice de calidad supere al promedio.
