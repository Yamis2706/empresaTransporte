package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    private List<Propietario> listaPropietarios = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}

