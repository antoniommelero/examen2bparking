/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2parking;

/**
 *
 * @author Antonio
 */
public class B2Parking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Parking parking = new Parking();
//
//        System.out.println("Entrando vehículos...");
//        System.out.println("1234ABC -> plaza " + parking.entrarVehiculo("1234ABC"));
//        System.out.println("5678DEF -> plaza " + parking.entrarVehiculo("5678DEF"));
//        System.out.println("9999XYZ -> plaza " + parking.entrarVehiculo("9999XYZ"));
//        System.out.println("1234ABC repetido -> " + parking.entrarVehiculo("1234ABC")); // -1
//
//        System.out.println("\n Estado actual");
//        System.out.print(parking.mostrarEstado());
//
//        System.out.println("Comprobar 1234ABC,5678DEF,9999XYZ: "
//            + parking.comprobarVehiculos("1234ABC,5678DEF,9999XYZ")); // true
//        System.out.println("Comprobar 1234ABC,0000ZZZ: "
//            + parking.comprobarVehiculos("1234ABC,0000ZZZ")); // false
//
//        System.out.println("\nSale 5678DEF: " + parking.salirVehiculo("5678DEF")); // true
//        System.out.println("Sale 0000ZZZ: " + parking.salirVehiculo("0000ZZZ")); // false
//
//        System.out.println("\nEntra AAAA001 -> plaza " + parking.entrarVehiculo("AAAA001")); // plaza 2 (la más baja libre)
//
//        System.out.println("\nEstado final");
//        System.out.print(parking.mostrarEstado());
        Parking parking = new Parking();
        parking.iniciarParking();
        for (String m : DatosParking.getEntradas()) {
            System.out.println("Plaza asignada a " + m + ": " + parking.entrarVehiculo(m));
        }
        for (String m : DatosParking.getSalidas()) {
            System.out.println("Sale " + m + ": " + parking.salirVehiculo(m));
        }
        System.out.println("estan los coches "+ DatosParking.GRUPO_DENTRO + " "+ parking.comprobarVehiculos(DatosParking.GRUPO_DENTRO));
        System.out.println("estan los coches "+ DatosParking.GRUPO_MIXTO + " "+parking.comprobarVehiculos(DatosParking.GRUPO_MIXTO));
        System.out.println("Estado del parking 1");
        System.out.println(parking.mostrarEstado());
        System.out.println("Estado del parking 2");
        System.out.println(parking.mostrarEstado2());
    }

}
