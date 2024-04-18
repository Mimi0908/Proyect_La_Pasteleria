
package utils;

public class Encargo {
    int numeroEncargo;
    String fechaRealizada;
    String fechaEntrega;
    String anexos;
    int precio;
    int abono;
    int saldoPendiente;
    String estado;
    String nombre;
    String nombreEncargado;

    public Encargo(int numeroEncargo, String fechaRealizada, String fechaEntrega, String anexos, int precio, int abono, int saldoPendiente, String estado, String nombre, String nombreEncargado) {
        this.numeroEncargo = numeroEncargo;
        this.fechaRealizada = fechaRealizada;
        this.fechaEntrega = fechaEntrega;
        this.anexos = anexos;
        this.precio = precio;
        this.abono = abono;
        this.saldoPendiente = saldoPendiente;
        this.estado = estado;
        this.nombre = nombre;
        this.nombreEncargado = nombreEncargado;
    }

    public int getNumeroEncargo() {
        return numeroEncargo;
    }

    public void setNumeroEncargo(int numeroEncargo) {
        this.numeroEncargo = numeroEncargo;
    }

    public String getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(String fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getAnexos() {
        return anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(int saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }
    
}
