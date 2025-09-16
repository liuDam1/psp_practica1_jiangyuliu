package es.etg.psp.modelo;

public class Alumno {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private int numeroHermano;


    public Alumno(String nombre, String apellido, String direccion, int edad, int numeroHermano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.numeroHermano = numeroHermano;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getNumeroHermano() {
        return numeroHermano;
    }
    public void setNumeroHermano(int numeroHermano) {
        this.numeroHermano = numeroHermano;
    } 
}
