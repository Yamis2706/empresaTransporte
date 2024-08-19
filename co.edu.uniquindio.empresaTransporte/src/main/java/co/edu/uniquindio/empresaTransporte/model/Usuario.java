package co.edu.uniquindio.empresaTransporte.model;


import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private int edad;
    private int peso;
    private VehiculoPrincipal vehiculo;
    private List<VehiculoTransporte> listaUsuariosAsociados = new ArrayList<>();

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public VehiculoPrincipal getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoPrincipal vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<VehiculoTransporte> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaVehiculosAsociados(List<VehiculoCarga> listaVehiculosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public Usuario(String nombre, String cedula, String correo, String telefono,
                   int edad, int peso, VehiculoPrincipal vehiculo,
                   List<VehiculoTransporte> listaUsuariosAsociados) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.peso = peso;
        this.vehiculo = vehiculo;
        this.listaUsuariosAsociados = listaUsuariosAsociados;


    }
}
