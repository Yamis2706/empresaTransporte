package co.edu.uniquindio.empresaTransporte.model;


public class VehiculoCarga extends VehiculoPrincipal {

    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String rjf147, String number, String mercedes,
                         String blanco, double v, int i) {
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }


}

