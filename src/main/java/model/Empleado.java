package model;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String nombre, String rut, Direccion direccion, String cargo) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  "nombre=" + getNombre() + '\n' +
                "rut=" + getRut() + '\n' +
                "direccion=" + getDireccion() + '\n'+
                "cargo=" + cargo + '\n';
    }
}
