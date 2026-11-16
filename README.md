<img width="462" height="427" alt="image" src="https://github.com/user-attachments/assets/5033d492-1fae-447f-bafa-4aace8066399" />

Simulación de Movimiento y Comportamiento en Videojuegos (Personajes)

Descripción

Este proyecto consiste en desarrollar un sistema de simulación de unidades de combate en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo, la herencia y la abstracción.

El sistema permite representar diferentes tipos de unidades, como infantería, caballería y unidades aéreas, cada una con sus propias características y comportamientos de movimiento y ataque.
 
 Objetivo

Implementar un sistema que permita gestionar diferentes unidades de combate mediante métodos comunes, respetando las capacidades y restricciones de cada tipo de unidad.

Clases utilizadas

UnidadCombate: Clase abstracta que contiene los atributos posicionX, posicionY y energia, además de los métodos abstractos moverse() y atacar().

Infanteria: Representa las unidades de infantería y define sus propias reglas de movimiento y ataque.

Caballeria: Representa las unidades de caballería y establece sus propias restricciones de desplazamiento.

UnidadAerea: Representa las unidades aéreas y define su propio comportamiento de movimiento y ataque.

Main: Contiene el método principal, instancia las diferentes unidades, las almacena en una colección y demuestra su comportamiento polimórfico.

 Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Colecciones de objetos.

Encapsulamiento.

Manejo de atributos y métodos.

Funcionamiento

Se define la clase abstracta UnidadCombate con los atributos y métodos generales.

Se crean las clases Infanteria, Caballeria y UnidadAerea, cada una con su propia implementación de movimiento y ataque.

Se establecen las restricciones de desplazamiento según el tipo de unidad.

Se crean diferentes objetos y se almacenan en una lista de tipo UnidadCombate.

Se recorren las unidades y se ejecutan sus acciones de manera polimórfica.

Finalmente, se muestran por consola los movimientos realizados y las posiciones actualizadas.

Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

Resultado esperado

Al ejecutar el programa, se podrán gestionar diferentes unidades de combate mediante una estructura común. Cada unidad realizará sus propios movimientos y ataques según sus características, mostrando por consola los resultados y las posiciones actualizadas.
