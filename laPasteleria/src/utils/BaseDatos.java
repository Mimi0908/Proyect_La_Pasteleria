
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
    public void imprimirDatosEncargoPaginaEstado(int id_encargo, JTextField cajaorden, JTextField cajanombre, JTextField cajafechai, JTextField cajafechaf, JTextField cajadescrip, JTextField cajaestado){
        ResultSet registros = null;
        ResultSet registrosPersonas = null;
	try {
	    String consulta = "SELECT * FROM encargo WHERE Id_encargo='"+id_encargo+"' ";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
            String idPersona ="SELECT * FROM persona WHERE ID_persona='"+registros.getInt("persona_Id")+"'";
            registrosPersonas = manipularDB.executeQuery(consulta);
	    registrosPersonas.next();
            cajaorden.setText(registros.getString("Id_encargo"));
	    cajanombre.setText(registrosPersonas.getString("Nombre"));
            cajafechaf.setText(registros.getString("FehcaEntrega"));
            cajadescrip.setText(registros.getString("Descripcion"));
            cajaestado.setText(registros.getString("Estado"));
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    public void imprimirDatosReservaPaginaEstado(int id_reserva, JTextField cajaorden, JTextField cajanombre, JTextField cajafechaf, JTextField cajadescrip){
        ResultSet registros = null;
        ResultSet registrosPersonas = null;
	try {
	    String consulta = "SELECT * FROM reserva WHERE ID_reserva='"+id_reserva+"' ";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
            String idPersona ="SELECT * FROM persona WHERE ID_persona='"+registros.getInt("persona_Id")+"'";
            registrosPersonas = manipularDB.executeQuery(consulta);
	    registrosPersonas.next();
            cajaorden.setText(registros.getString("Id_encargo"));
	    cajanombre.setText(registrosPersonas.getString("Nombre"));
            cajafechaf.setText(registros.getString("FehcaReserva"));
            cajadescrip.setText(registros.getString("Anexos"));
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

            String consulta = "INSERT INTO encargo ( FechaPedido, FechaEntrega, Descripcion, Precio, Abono, SaldoPendiente, Estado, persona_Id, id_usuario) VALUES ('"+fechaPedido+"','"+fechaEntrega+"','"+descripcion+"','"+precio+"','"+abono+"','"+saldoPendiente+"','"+estado+"','"+id_Persona+"','"+id_Persona+"')";
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

            String consulta = "INSERT INTO reserva (persona_id, FechaReserva, Zona, horaReserva, Anexos, Precio, Abono, SaldoPendiente,id_usuario ) VALUES ('"+persona+"','"+fechaReserva+"','"+lugar+"','"+hora+"','"+descrip+"','"+precio+"','"+abono+"','"+saldoPendiente+"','"+id_persona+"')";
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
    public void buscarDatosReserva(int ID_reserva, JTextField cajanombre, JTextField cajafecha, JTextField cajaHora, JTextField cajaZona, JTextField cajaDesc){
        ResultSet registros = null;
        ResultSet registrosPersonas = null;
        ResultSet registrosZona = null;
	try {
	    String consulta = "SELECT * FROM reserva WHERE ID_reserva='"+ID_reserva+"' ";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
            String idPersona ="SELECT * FROM persona WHERE ID_persona='"+registros.getInt("persona_id")+"'";
            registrosPersonas = manipularDB.executeQuery(consulta);
	    registrosPersonas.next();
            String idZona ="SELECT * FROM persona WHERE ID_persona='"+registros.getInt("Zona")+"'";
            registrosZona = manipularDB.executeQuery(consulta);
	    registrosZona.next();
            cajanombre.setText(registrosPersonas.getString("Nombre"));
            cajafecha.setText(registros.getString("FechaReserva"));
            cajaHora.setText(registros.getString("horaReserva"));
            cajaZona.setText(registrosZona.getString("nombre"));
            cajaDesc.setText(registros.getString("Anexos"));
	    
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    public void buscarDatosEncargo(int id_encargo, JTextField cajanombre, JTextField cajafechai, JTextField cajafechaf, JTextField cajadescrip, JTextField cajaestado){
        ResultSet registros = null;
        ResultSet registrosPersonas = null;
	try {
	    String consulta = "SELECT * FROM encargo WHERE Id_encargo='"+id_encargo+"' ";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
            String idPersona ="SELECT * FROM persona WHERE ID_persona='"+registros.getInt("persona_Id")+"'";
            registrosPersonas = manipularDB.executeQuery(consulta);
	    registrosPersonas.next();
            cajanombre.setText(registrosPersonas.getString("Nombre"));
            cajafechai.setText(registros.getString("FechaPedido"));
            cajafechaf.setText(registros.getString("FehcaEntrega"));
            cajadescrip.setText(registros.getString("Descripcion"));
            cajaestado.setText(registros.getString("Estado"));
	    
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    public void editarDatosReserva(int id_reserva, String fechaR, String horaR, String descripcion){
        respuesta = false;
        try {
            String fecha = fechaR;
            String hora = horaR;
            String anexos= descripcion;

            String consulta = "UPDATE reserva SET  FechaReserva='"+fecha+"', horaReserva='"+hora+"', Anexos='"+anexos+"' WHERE ID_reserva='"+id_reserva+"' ";
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
    public void editarDatosEncargo(int id_encargo, String fechaE, String descripcion){
        respuesta = false;
        try {
            String fechaF = fechaE;
            String anexos= descripcion;

            String consulta = "UPDATE encargo SET fechaEntrega='"+fechaE+"', Anexos='"+anexos+"' WHERE Id_encargo='"+id_encargo+"' ";
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
    public void editarEstadoEncargo(int id_encargo, String est){
        respuesta = false;
        try {
            String estado = est;

            String consulta = "UPDATE encargo SET  Estado='"+estado+"' WHERE ID_reserva='"+id_encargo+"' ";
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
    public void eliminarDatosReserva(int idReserva){
        respuesta = false;
        try {
            int cedula = idReserva;

            String consulta = "DELETE FROM reserva WHERE cedula='"+cedula+"' ";
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
    public void eliminarDatosEncargo(int idEncargo){
        respuesta = false;
        try {
            int cedula = idEncargo;

            String consulta = "DELETE FROM encargo WHERE cedula='"+cedula+"' ";
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
    public void login(int usuario, String contraseña){
        ResultSet registrosusuario = null;
        ResultSet registroscontraseña = null;
        respuesta = false;
	try {
	    String consulta = "SELECT * FROM usuarios WHERE IdUsuario='"+usuario+"' ";
	    registrosusuario = manipularDB.executeQuery(consulta);
	    String consulta2 = "SELECT * FROM usuarios WHERE contraseña='"+contraseña+"' ";
	    registroscontraseña = manipularDB.executeQuery(consulta2);
            
	    
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	} 
        if (respuesta){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Incorrecto");
        }  
    }
}
