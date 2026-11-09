package app;

import model.Direccion;
import model.Empleado;

public class Main {

    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Avenida Los Lagos 1733","Llanquihue");

        Direccion direccion2 =  new Direccion("Calle los rios 1356", "Puerto Varas");

        Direccion direccion3 = new Direccion("Portal del lago 0348", "Frutillar");

        Empleado empleado1 = new Empleado("Juan Segura", "18.382.481-1", direccion1, "Guia Turistico");

        Empleado empleado2 = new Empleado("Maria Soto", "19.823.500-2", direccion2, "Coordinadora");

        Empleado empleado3 = new Empleado("Pablo Rojas", "19.972.602-7", direccion3, "Operador");

        System.out.println("----- EMPLEADO 1 -----");
        System.out.println(empleado1);

        System.out.println();

        System.out.println("----- EMPLEADO 2 -----");
        System.out.println(empleado2);

        System.out.println();

        System.out.println("----- EMPLEADO 3 -----");
        System.out.println(empleado3);
    }
}