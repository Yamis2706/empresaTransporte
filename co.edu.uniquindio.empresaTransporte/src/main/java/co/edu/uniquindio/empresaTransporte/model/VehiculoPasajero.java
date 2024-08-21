package co.edu.uniquindio.empresaTransporte.model;


import java.util.ArrayList;
import java.util.List;

public class VehiculoPasajero extends VehiculoPrincipal  {

    public VehiculoPrincipal vehiculoPasajero;
    private int numeroMaximoPasajeros;
    private List<VehiculoPasajero> listaVehiculosAsociadosPasajeros = new ArrayList<>();

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color,
                            int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }


    public List<VehiculoPasajero> getListaVehiculosAsociadosPasajeros() {
        return listaVehiculosAsociadosPasajeros;
    }

    public void setListaVehiculosAsociadosPasajeros(List<VehiculoPasajero> listaVehiculosAsociadosPasajeros) {
        this.listaVehiculosAsociadosPasajeros = listaVehiculosAsociadosPasajeros;
    }
}



