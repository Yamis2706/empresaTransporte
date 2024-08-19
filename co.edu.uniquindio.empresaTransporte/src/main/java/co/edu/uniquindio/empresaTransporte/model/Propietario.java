package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario  {

    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;
    private VehiculoPrincipal vehiculo;
    private List<VehiculoCarga> listaVehiculosAsociados = new ArrayList<>();


    public Propietario() {

    }

    public String getNombre(String nombre) {
        return this.nombre;
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

    public VehiculoPrincipal getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoPrincipal vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<VehiculoCarga> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }


    public void setListaVehiculosAsociados(List<VehiculoCarga> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public Propietario(String nombre, String cedula, String correo,
                       String telefono, VehiculoPrincipal vehiculo,
                       List<VehiculoCarga> listaVehiculosAsociados ) {
        super();
    }

    public Propietario(List<VehiculoCarga> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }


    public void agregarVehiculoCarga(VehiculoPrincipal vehiculoPrincipal) {
        this.listaVehiculosAsociados.add(new VehiculoCarga());

    }
    public void agregarVehiculoTransporte() {
        this.listaVehiculosAsociados.add(new VehiculoCarga());
    }

}
