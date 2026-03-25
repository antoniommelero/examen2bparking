# examen2bparking
Ejercicio para simular la gestión de las plazas de un parking

***

En este ejercicio modelarás el sistema de control de un parking. El parking dispone de 90 plazas numeradas del 1 al 90. Los vehículos se identifican por su matrícula (un String). El sistema gestiona la entrada y salida de vehículos, controlando en todo momento que plazas están libres y que matricula ocupa cada plaza.

**Clase que debes implementar: Parking**

***

**1. iniciarParking()**

Prepara el parking para empezar a operar. Todas las plazas quedan libres, descartando cualquier estado anterior.

**2. entrarVehiculo(String matricula)**

Registra la entrada de un vehículo y le asigna una plaza libre.

-   Si hay plazas disponibles y el vehículo no está ya dentro, asigna una plaza, la marca como ocupada y devuelve el número de plaza asignado. Deberá asignar la plaza de número más bajo disponible. (desde a 1 en adelante)
-   Si el vehículo ya está dentro del parking, devuelve -1 sin realizar ningún cambio.
-   Si el parking está completo, devuelve -1.

**3. salirVehiculo(String matricula)**

Registra la salida de un vehículo y libera su plaza.

-   Si el vehículo se encuentra en el parking, libera su plaza y devuelve true.
-   Si la matricula no corresponde a ningún vehículo dentro, devuelve false.

**4. comprobarVehiculos(String matriculas)**

Recibe un String con matrículas separadas por comas (formato CSV) y comprueba si todas esas matriculas se encuentran actualmente en el parking.

-   Devuelve true si todas las matriculas del String están dentro.
-   Devuelve false si alguna de ellas no está.

Ejemplo de llamada:

parking.comprobarVehiculos("1234ABC,5678DEF,9999XYZ");

**5. mostrarEstado()**

Devuelve un String con la relación de plazas ocupadas y matrícula del vehículo que la ocupa, uno por línea.

No es necesario hacer un programa principal operativo, pero si instanciar datos y usar los métodos para comprobar su correcto funcionamiento.

**Justificacion de estructuras de datos**

***

| *Antes del codigo, incluye un comentario en la cabecera de la clase donde expliques:*<br> *- Que estructura o estructuras del framework Collections has utilizado.*<br> *- Por qué esa estructura es adecuada para cada caso (plazas libres, vehículos aparcados).* |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

**Restricciones**

***

-   No se pueden usar arrays primitivos (int[]) como estructura principal de almacenamiento.
-   Debes usar al menos una clase del framework Collections (java.util.\*).
-   El código debe compilar y no lanzar excepciones durante un uso normal.
-   No es necesaria ninguna validación sobre las matrículas.
