
package utils;

import java.sql.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BaseDatos {
    
    Connection conexion;
    Statement manipularDB;
    boolean respuesta = false;
    
    public BaseDatos(){
        
        String hostname="localhost";
        String puerto="3306";
        String databasename="app_java";
        String user="root";
        String password="";
        
        String url ="jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB=conexion.createStatement();
            System.out.println("Conexion Exitosa");
        } catch (SQLException ex) {
            System.out.println("Error en conexion: "+ex.getMessage());
        }
        
        
    }
    public void imprimirDatos(DefaultTableModel modelo){
        ResultSet registros = null;
        modelo.setRowCount(0);
        int i=1;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
                    Object datos1 []= new Object[]{i, registros.getString("cedula"), registros.getString("nombres")+" "+registros.getNString("Apellidos"), registros.getString("telefono"), registros.getString("email")};
                    modelo.addRow(datos1);
                    i++;
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    
    public void insertarDatos(String documento, String nombre, String apellido, String tel, String correo){
        
        try {
            String cedula = documento;
            String nombres = nombre;
            String apellidos = apellido;
            String direccion = "null";
            String telefono = tel;
            String email = correo;

            String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+direccion+"','"+telefono+"','"+email+"')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        } 
    }
    public void buscarDAtos(String documento, JTextField cajanombre, JTextField cajaapellidos, JTextField cajatel, JTextField cajaemail){
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas WHERE cedula='"+documento+"' ";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
            cajanombre.setText(registros.getString("nombres"));
            cajaapellidos.setText(registros.getString("Apellidos"));
            cajatel.setText(registros.getString("telefono"));
            cajaemail.setText(registros.getString("email"));
	    
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    public void editarDatos(String documento, String nombre, String apellido, String tel, String correo){
        respuesta = false;
        try {
            String cedula = documento;
            String nombres = nombre;
            String apellidos = apellido;
            String direccion = "null";
            String telefono = tel;
            String email = correo;

            String consulta = "UPDATE personas SET nombres='"+nombres+"', apellidos='"+apellidos+"', direccion='"+direccion+"', telefono='"+telefono+"', email='"+email+"' WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }  
    }
    public void eliminarDatos( String documento){
        respuesta = false;
        try {
            String cedula = documento;

            String consulta = "DELETE FROM personas WHERE cedula='"+cedula+"' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        } 
    }
    
}
