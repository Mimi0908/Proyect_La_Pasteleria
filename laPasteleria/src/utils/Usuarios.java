
package utils;

public class Usuarios {
    int idUsusario;
    String contraseña;
    String cargo;
    String nombre;
    String apellido;
    int telefono;

    public Usuarios(int idUsusario, String contraseña, String cargo, String nombre, String apellido, int telefono) {
        this.idUsusario = idUsusario;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getIdUsusario() {
        return idUsusario;
    }

    public void setIdUsusario(int idUsusario) {
        this.idUsusario = idUsusario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
