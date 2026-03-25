/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b2parking;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Antonio
 */
/*
 * Clase Parking
 *
 * Estructuras utilizadas:
 * - TreeSet<Integer> plazasLibres: almacena los números de plaza disponibles.
 *   Se elige TreeSet porque mantiene las plazas ordenadas automáticamente de menor
 *   a mayor, lo que permite obtener la plaza de número más bajo con first(),
 *   cumpliendo el requisito de asignar siempre la plaza libre más baja.
 *
 * - HashMap<String, Integer> vehiculosAparcados: mapea matrícula → número de plaza.
 *   Se elige HashMap porque necesitamos dos operaciones frecuentes:
 *   comprobar si una matrícula ya está dentro (containsKey) y
 *   recuperar el número de plaza al salir (get).
 */

public class Parking {

    private TreeSet<Integer> plazasLibres;
    private HashMap<String, Integer> vehiculosAparcados;

    public Parking() {
        iniciarParking();
    }

    // 1. Inicializa el parking con las 90 plazas libres
    public void iniciarParking() {
        plazasLibres = new TreeSet<>();
        vehiculosAparcados = new HashMap<>();
        for (int i = 1; i <= 90; i++) {
            plazasLibres.add(i);
        }
    }

    // 2. Entrada de vehículo: asigna la plaza libre de número más bajo
    public int entrarVehiculo(String matricula) {
        if (vehiculosAparcados.containsKey(matricula)) {
            return -1;
        }
        if (plazasLibres.isEmpty()) {
            return -1; // esta lleno
        }
        int plaza = plazasLibres.first();
        plazasLibres.remove(plaza); // elimino la que se ocupa
        vehiculosAparcados.put(matricula, plaza);
        return plaza;
    }

    // 3. Salida de vehículo: libera su plaza
    public boolean salirVehiculo(String matricula) {
        if (!vehiculosAparcados.containsKey(matricula)) {
            return false;
        }
        int plaza = vehiculosAparcados.remove(matricula); // elimina el coche que sale
        plazasLibres.add(plaza); // se recupera la plaza
        return true;
    }

    // 4. Comprueba si todas las matrículas del CSV están en el parking
    public boolean comprobarVehiculos(String matriculas) {
        String[] partes = matriculas.split(",");
        for (String parte : partes) {
            if (!vehiculosAparcados.containsKey(parte.trim())) {
                return false;
            }
        }
        return true;
    }

    // 5. Muestra las plazas ocupadas y su matrícula, ordenadas por plaza
    public String mostrarEstado() {
        // Usamos un TreeMap para mostrar por orden de plaza
        // tenemos las plazas libres por un lado (Set plazasLIbres) 
        // y por otro un Map de entradas <matricula, plaza>
        // como queremos ordenar por plaza no por matricula
        // el artificio es llevar los datos a otro Map con clave, valor invertido
        TreeSet<Integer> plazasOcupadas = new TreeSet<>();
        Map<Integer, String> plazaAMatricula = new HashMap<>();
        for (Map.Entry<String, Integer> entrada : vehiculosAparcados.entrySet()) {
            plazaAMatricula.put(entrada.getValue(), entrada.getKey());
            plazasOcupadas.add(entrada.getValue());
        }
        StringBuilder sb = new StringBuilder();
        // ahora ya se puede obtener la matricula asociada a cada plaza
        for (int plaza : plazasOcupadas) {
            sb.append("Plaza ").append(plaza).append(" - ").append(plazaAMatricula.get(plaza)).append("\n");
        }
        return sb.toString();
    }

    public String mostrarEstado2() {
        return vehiculosAparcados.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(e -> "Plaza " + e.getValue() + " - " + e.getKey())
                .collect(Collectors.joining("\n"));
    }
}
