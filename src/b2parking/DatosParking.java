/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2parking;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Antonio
 */


/**
 * Clase de datos de partida para el ejercicio del Parking (Modelo B).
 * Proporciona secuencias de entradas y salidas de vehículos para poder
 * verificar el comportamiento de tu clase Parking de forma reproducible.
 *
 * INSTRUCCIONES:
 *   1. Descarga este fichero y añádelo a tu proyecto.
 *   2. En tu clase de prueba crea un objeto Parking, llama a iniciarParking()
 *      y simula las operaciones usando las listas de este fichero.
 *   3. Usa comprobarVehiculos() con las cadenas CSV de ejemplo para verificar
 *      el funcionamiento de tu implementación.
 *
 * Ejemplo de prueba:
 *   Parking parking = new Parking();
 *   parking.iniciarParking();
 *   for (String m : DatosParking.getEntradas()) {
 *       System.out.println("Plaza asignada a " + m + ": " + parking.entrarVehiculo(m));
 *   }
 *   for (String m : DatosParking.getSalidas()) {
 *       System.out.println("Sale " + m + ": " + parking.salirVehiculo(m));
 *   }
 *   System.out.println(parking.comprobarVehiculos(DatosParking.GRUPO_DENTRO));
 *   System.out.println(parking.comprobarVehiculos(DatosParking.GRUPO_MIXTO));
 */
public class DatosParking {

    /**
     * Lista de 60 matrículas que entran al parking en este orden.
     * El parking tiene 90 plazas, por lo que todas deben obtener plaza.
     */
    public static List<String> getEntradas() {
        List<String> entradas = new ArrayList<>();
        entradas.add("1234ABC"); entradas.add("5678DEF"); entradas.add("9012GHI");
        entradas.add("3456JKL"); entradas.add("7890MNO"); entradas.add("2345PQR");
        entradas.add("6789STU"); entradas.add("0123VWX"); entradas.add("4567YZA");
        entradas.add("8901BCD"); entradas.add("1111EFG"); entradas.add("2222HIJ");
        entradas.add("3333KLM"); entradas.add("4444NOP"); entradas.add("5555QRS");
        entradas.add("6666TUV"); entradas.add("7777WXY"); entradas.add("8888ZAB");
        entradas.add("9999CDE"); entradas.add("1010FGH"); entradas.add("2020IJK");
        entradas.add("3030LMN"); entradas.add("4040OPQ"); entradas.add("5050RST");
        entradas.add("6060UVW"); entradas.add("7070XYZ"); entradas.add("8080ABC");
        entradas.add("9090DEF"); entradas.add("1122GHI"); entradas.add("2233JKL");
        entradas.add("3344MNO"); entradas.add("4455PQR"); entradas.add("5566STU");
        entradas.add("6677VWX"); entradas.add("7788YZA"); entradas.add("8899BCD");
        entradas.add("9900EFG"); entradas.add("1357HIJ"); entradas.add("2468KLM");
        entradas.add("3579NOP"); entradas.add("4680QRS"); entradas.add("5791TUV");
        entradas.add("6802WXY"); entradas.add("7913ZAB"); entradas.add("8024CDE");
        entradas.add("9135FGH"); entradas.add("0246IJK"); entradas.add("1357LMN");
        entradas.add("2468OPQ"); entradas.add("3579RST"); entradas.add("4680UVW");
        entradas.add("5791XYZ"); entradas.add("6802ABC"); entradas.add("7913DEF");
        entradas.add("8024GHI"); entradas.add("9135JKL"); entradas.add("0246MNO");
        entradas.add("1111PQR"); entradas.add("2222STU"); entradas.add("3333VWX");
        return entradas;
    }

    /**
     * Lista de 15 matrículas que salen del parking.
     * Todas están en la lista de entradas, por lo que salirVehiculo() debe devolver true.
     */
    public static List<String> getSalidas() {
        List<String> salidas = new ArrayList<>();
        salidas.add("5678DEF"); salidas.add("3456JKL"); salidas.add("1111EFG");
        salidas.add("4444NOP"); salidas.add("9999CDE"); salidas.add("3030LMN");
        salidas.add("7070XYZ"); salidas.add("2233JKL"); salidas.add("6677VWX");
        salidas.add("9900EFG"); salidas.add("4680QRS"); salidas.add("0246IJK");
        salidas.add("6802ABC"); salidas.add("0246MNO"); salidas.add("2222STU");
        return salidas;
    }

    /**
     * Grupo de matrículas que siguen dentro del parking tras las salidas.
     * comprobarVehiculos() debe devolver true para este grupo.
     */
    public static final String GRUPO_DENTRO  =
        "1234ABC,9012GHI,7890MNO,2345PQR,6789STU,8901BCD,2222HIJ,3333KLM";

    /**
     * Grupo mixto: algunas matrículas están dentro y otras han salido ya.
     * comprobarVehiculos() debe devolver false para este grupo.
     */
    public static final String GRUPO_MIXTO   =
        "1234ABC,5678DEF,9012GHI";

    /**
     * Matrícula que nunca ha entrado al parking.
     * salirVehiculo() debe devolver false para esta matrícula.
     */
    public static final String MATRICULA_INEXISTENTE = "0000XXX";

    /**
     * Matrícula duplicada para probar que entrarVehiculo() devuelve -1
     * cuando el vehículo ya está dentro.
     */
    public static final String MATRICULA_DUPLICADA = "1234ABC";
}

