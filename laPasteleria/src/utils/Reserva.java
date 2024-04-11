
package utils;

public class Reserva {
        int numeroReserva;
        String nombre;
        String fecha;
        String hora;
        String nombreZona;
        String descripcion;
        int precio;
        int abono;
        int saldoPendiente;
        String nombreEncargado;

    public Reserva(int numeroReserva, String nombre, String fecha, String hora,String nombreZona, String descripcion, int precio, int abono, int saldoPendiente, String nombreEncargado) {
        this.numeroReserva = numeroReserva;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreZona = nombreZona;
        this.descripcion = descripcion;
        this.precio = precio;
        this.abono = abono;
        this.saldoPendiente = saldoPendiente;
        this.nombreEncargado = nombreEncargado;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }
        public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
