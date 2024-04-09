
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
        String databasename="la_pasteleria";
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
    public void imprimirDatosPersona(DefaultTableModel modelo){
        ResultSet registros = null;
        modelo.setRowCount(0);
        int i=1;
	try {
	    String consulta = "SELECT * FROM persona";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
                    Object datos1 []= new Object[]{i, registros.getString("ID_persona"), registros.getString("Nombre")+" "+registros.getNString("Apellido"), registros.getString("Telefono"), registros.getString("Email")};
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
    
    public void imprimirDatosEncargo(DefaultTableModel modelo){
        ResultSet registros = null;
        modelo.setRowCount(0);
        int i=1;
	try {
	    String consulta = "SELECT * FROM encargo";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
                    Object datos1 []= new Object[]{i, registros.getString("Id_encargo"), registros.getString("FechaPedido")+" "+registros.getNString("FechaEntrega"), registros.getString("Descripcion"), registros.getString("Precio"), registros.getString("Abono"), registros.getString("SaldoPendiente"), registros.getString("Estado"), registros.getString("persona_Id"), registros.getString("id_usuario")};
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
    
    public void imprimirDatosReservas(DefaultTableModel modelo){
        ResultSet registros = null;
        modelo.setRowCount(0);
        int i=1;
	try {
	    String consulta = "SELECT * FROM reserva";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
                    Object datos1 []= new Object[]{i, registros.getString("Id_encargo"), registros.getString("persona_id")+" "+registros.getNString("FechaReserva"), registros.getString("Zona"), registros.getString("horaReserva"), registros.getString("Anexos"), registros.getString("Precio"), registros.getString("Abono"), registros.getString("SaldoPendiente"), registros.getString("id_usuario")};
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
    
    public void insertarDatosPersona(int documento, String nombre, String apellido, String tel, String correo){
        
        try {
            int cedula = documento;
            String nombres = nombre;
            String apellidos = apellido;
            String telefono = tel;
            String email = correo;

            String consulta = "INSERT INTO persona (ID_persona, Nombre, Apellido, Telefono, Email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+email+"')";
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
    public void insertarDatosEncargo(String fechaI, String fechaF, String anexos, int preciof, int abonado, int saldoP,int documento){
        
        try { 
            String fechaPedido = fechaI;
            String fechaEntrega= fechaF;
            String descripcion = anexos;
            int precio = preciof;
            int abono=abonado;
            int saldoPendiente=saldoP;
            String estado= "en espera";
            int id_Persona=documento;

            String consulta = "INSERT INTO encargo ( FechaPedido, FechaEntrega, Descripcion, Precio, Abono, SaldoPendiente, Estado, persona_Id, id_usuario) VALUES ('"+fechaPedido+"','"+fechaEntrega+"','"+descripcion+"','"+precio+"','"+abono+"','"+saldoPendiente+"','"+estado+"','"+id_Persona+"')";
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
    public void insertarDatosReservas(int id_persona, String fechaR, int zona, String horaR, String anexos, int preciof, int abonado, int saldoP){
        
        try {
            int persona=id_persona;
            String fechaReserva=fechaR;
            int lugar=zona;
            String hora=horaR;
            String descrip=anexos;
            int precio = preciof;
            int abono=abonado;
            int saldoPendiente=saldoP;

            String consulta = "INSERT INTO reserva (persona_id, FechaReserva, Zona, horaReserva, Anexos, Precio, Abono, SaldoPendiente ) VALUES ('"+persona+"','"+fechaReserva+"','"+lugar+"','"+hora+"','"+descrip+"','"+precio+"','"+abono+"','"+saldoPendiente+"')";
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
    public void buscarDatosReserva(String documento, JTextField cajanombre, JTextField cajaapellidos, JTextField cajatel, JTextField cajaemail){
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
    public void buscarDatosEncargo(String documento, JTextField cajanombre, JTextField cajaapellidos, JTextField cajatel, JTextField cajaemail){
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
