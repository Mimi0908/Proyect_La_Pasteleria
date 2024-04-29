package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import principal.viewPedidos;
import principal.PasteleriaChef;
import principal.Status_Pedido;
import principal.Status_Reserva;

public class BaseDatos {

    Connection conexion;
    Statement manipularDB;

    public BaseDatos() {

        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "la_pasteleria";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://" + hostname + ":" + puerto + "/" + databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa");
        } catch (SQLException ex) {
            System.out.println("Error en conexion: " + ex.getMessage());
        }

    }

    //funcion para imprimir los datos de la tabla persona en una tabla
    public void imprimirDatosPersona(DefaultTableModel modelo) {
        //se crea la tabla y el metodo donde se guarda los datos
        ResultSet registros = null;
        modelo.setRowCount(0);
        int i = 1;
        try {
            //se cogen los datos
            String consulta = "SELECT * FROM persona";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            //si los datos estan en primera fila 
            if (registros.getRow() == 1) {
                do {
                    //se colocan todos los datos de las personas
                    Object datos1[] = new Object[]{i, registros.getString("ID_persona"), registros.getString("Nombre") + " " + registros.getNString("Apellido"), registros.getString("Telefono"), registros.getString("Email")};
                    modelo.addRow(datos1);
                    i++;
                } while (registros.next());
            } else {
                System.out.println("No se encuentran clientes registrados.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
    }

    //se imprimen los datos de los encargos en una tabla
    public void imprimirDatosEncargo(DefaultTableModel modelo) {
        //se crea la tabla y el metodo donde se guarda los datos
        ResultSet registros = null;
        modelo.setRowCount(0);
        try {
            //se cogen los datos
            String consulta = "SELECT persona.Nombre, persona.Apellido, encargo.*,usuarios.Nombre AS nombreEncargado, usuarios.Apellido AS apellidoEncargado FROM ((encargo INNER JOIN persona ON encargo.persona_Id=persona.ID_persona)INNER JOIN usuarios ON encargo.id_usuario=usuarios.IdUsuario )";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            //si los datos estan en primera fila 
            if (registros.getRow() == 1) {
                do {
                    //se colocan todos los datos de los encargos
                    Object datos1[] = new Object[]{registros.getString("Id_encargo"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("FechaPedido"), registros.getString("FechaEntrega"), registros.getString("Descripcion"), registros.getString("Precio"), registros.getString("Abono"), registros.getString("SaldoPendiente"), registros.getString("Estado"), registros.getString("nombreEncargado") + " " + registros.getString("apellidoEncargado")};
                    modelo.addRow(datos1);
                } while (registros.next());
            } else {
                System.out.println("No se encuentran clientes registrados.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
    }

    //se imprimen los datos de las reservas en una tabla
    public void imprimirDatosReservas(DefaultTableModel modelo) {
        //se crea la tabla y el metodo donde se guarda los datos
        ResultSet registros = null;
        modelo.setRowCount(0);
        try {
            //se cogen los datos
            String consulta = "SELECT persona.Nombre, persona.Apellido, reserva.*, usuarios.Nombre AS nombreEncargado, usuarios.Apellido AS apellidoEncargado, zonas.nombre AS nombreZona FROM (((reserva INNER JOIN persona ON reserva.persona_id=persona.ID_persona)INNER JOIN usuarios ON reserva.id_usuario=usuarios.IdUsuario) INNER JOIN zonas ON reserva.Zona = zonas.idZonas)";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            //si los datos estan en primera fila
            if (registros.getRow() == 1) {
                do {
                    //se colocan todos los datos de las reservas
                    Object datos1[] = new Object[]{registros.getString("Id_reserva"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("FechaReserva"), registros.getString("Zona"), registros.getString("horaReserva"), registros.getString("Anexos"), registros.getString("Precio"), registros.getString("Abono"), registros.getString("SaldoPendiente"), registros.getString("nombreEncargado") + " " + registros.getString("apellidoEncargado")};
                    modelo.addRow(datos1);
                } while (registros.next());
            } else {
                System.out.println("No se encuentran clientes registrados.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
    }

    public void imprimirDatosEncargoChef(DefaultTableModel modelo, JButton btn) {

        //se crea la tabla y el metodo donde se guarda los datos
        ResultSet registros = null;
        modelo.setRowCount(0);

        try {
            //se cogen los datos
            String consulta = "SELECT persona.Nombre, persona.Apellido, encargo.* FROM (encargo INNER JOIN persona ON encargo.persona_Id=persona.ID_persona)";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            //si los datos estan en primera fila 
            if (registros.getRow() == 1) {
                do {
                    int idEncargo = registros.getInt("Id_encargo");
                    //se colocan todos los datos de los encargos
                    Object datos1[] = new Object[]{registros.getString("Id_encargo"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("Descripcion"), registros.getString("FechaEntrega"), btn};
                    modelo.addRow(datos1);
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                            // creara una instancia del nuevo contenedor
                            Status_Pedido pedido = new Status_Pedido(idEncargo);
                        }
                    });
                } while (registros.next());
            } else {
                System.out.println("No se encuentran clientes registrados.");
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
    }

    //se imprimen los datos de las reservas en una tabla
    public void imprimirDatosReservasChef(DefaultTableModel modelo, JButton btn) {
        //se crea la tabla y el metodo donde se guarda los datos
        ResultSet registros = null;
        modelo.setRowCount(0);
        try {
            //se cogen los datos
            String consulta = "SELECT persona.Nombre, persona.Apellido, reserva.*, usuarios.Nombre AS nombreEncargado, usuarios.Apellido AS apellidoEncargado, zonas.nombre AS nombreZona FROM (((reserva INNER JOIN persona ON reserva.persona_id=persona.ID_persona)INNER JOIN usuarios ON reserva.id_usuario=usuarios.IdUsuario) INNER JOIN zonas ON reserva.Zona = zonas.idZonas)";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            //si los datos estan en primera fila
            if (registros.getRow() == 1) {
                do {
                    //se colocan todos los datos de las reservas
                    Object datos1[] = new Object[]{registros.getString("Id_reserva"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("FechaReserva"), registros.getString("Zona"), registros.getString("horaReserva"), registros.getString("Anexos"), registros.getString("Precio"), registros.getString("Abono"), registros.getString("SaldoPendiente"), registros.getString("nombreEncargado") + " " + registros.getString("apellidoEncargado"), btn};
                    modelo.addRow(datos1);
                    
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                            // creara una instancia del nuevo contenedor
                            Status_Reserva reserva = new Status_Reserva();
                        }
                    });
                    
                } while (registros.next());
            } else {
                System.out.println("No se encuentran clientes registrados.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
    }

    //se guardan los datos de las personas
    public void insertarDatosPersona(int documento, String nombre, String apellido, String tel, String correo) {
        boolean respuesta = false;
        try {
            //se organizan los datos
            int cedula = documento;
            String nombres = nombre;
            String apellidos = apellido;
            String telefono = tel;
            String email = correo;
            //se guardan los datos 
            String consulta = "INSERT INTO persona (ID_persona, Nombre, Apellido, Telefono, Email) VALUES ('" + cedula + "','" + nombres + "','" + apellidos + "','" + telefono + "','" + email + "')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }

    }

    //se guardan los datos de los encargos
    public void insertarDatosEncargo(String fechaI, String fechaF, String anexos, int preciof, int abonado, int saldoP, int documento, int id_Ususario) {
        boolean respuesta = false;
        try {
            //se organizan los datos
            String fechaPedido = fechaI;
            String fechaEntrega = fechaF;
            String descripcion = anexos;
            int precio = preciof;
            int abono = abonado;
            int saldoPendiente = saldoP;
            String estado = "en espera";
            int id_Persona = documento;
            //se guardan los datos
            String consulta = "INSERT INTO encargo ( FechaPedido, FechaEntrega, Descripcion, Precio, Abono, SaldoPendiente, Estado, persona_Id, id_usuario) VALUES ('" + fechaPedido + "','" + fechaEntrega + "','" + descripcion + "','" + precio + "','" + abono + "','" + saldoPendiente + "','" + estado + "','" + id_Persona + "','" + id_Ususario + "')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
    }

    //se guardan los datos de la reserva
    public void insertarDatosReservas(int id_persona, String fechaR, int zona, String horaR, String anexos, int preciof, int abonado, int saldoP, int id_usuario) {
        boolean respuesta = false;
        try {
            //se organizan los datos
            int persona = id_persona;
            String fechaReserva = fechaR;
            int lugar = zona;
            String hora = horaR;
            String descrip = anexos;
            int precio = preciof;
            int abono = abonado;
            int saldoPendiente = saldoP;
            //se guardan los datos
            String consulta = "INSERT INTO reserva (persona_id, FechaReserva, Zona, horaReserva, Anexos, Precio, Abono, SaldoPendiente,id_usuario ) VALUES ('" + persona + "','" + fechaReserva + "','" + lugar + "','" + hora + "','" + descrip + "','" + precio + "','" + abono + "','" + saldoPendiente + "','" + id_usuario + "')";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
    }

    //se buscan los datos de la reserva mediante el id de la reserva
    public Reserva buscarDatosReserva(int id_reserva) {
        ResultSet registros = null;
        Reserva datos = null;
        try {
            //se recogen los datos necesarios para imprimir con el idreserva;
            String consulta = "SELECT persona.Nombre, persona.Apellido, reserva.*, usuarios.Nombre AS nombreEncargado, usuarios.Apellido AS apellidoEncargado, zonas.nombre AS nombreZona FROM (((reserva INNER JOIN persona ON reserva.persona_id=persona.ID_persona)INNER JOIN usuarios ON reserva.id_usuario=usuarios.IdUsuario) INNER JOIN zonas ON reserva.Zona = zonas.idZonas)WHERE reserva.ID_reserva='" + id_reserva + "' ";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                datos = new Reserva(registros.getInt("id_reserva"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("FechaReserva"), registros.getString("horaReserva"), registros.getString("nombreZona"), registros.getString("Anexos"), registros.getInt("Precio"), registros.getInt("Abono"), registros.getInt("SaldoPendiente"), registros.getString("nombreEncargado") + " " + registros.getString("apellidoEncargado"));
                //hay coincidencias se guardan los valores en la clase reserva
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
        return datos;
    }
    //se buscan los datos del encargo mediante el id del encargo

    public Encargo buscarDatosEncargo(int id_encargo) {
        ResultSet registros = null;
        Encargo datos = null;
        try {
            //se recogen los datos necesarios para imprimir con el id
            String consulta = "SELECT persona.Nombre, persona.Apellido, encargo.*, usuarios.Nombre AS nombreEncargado, usuarios.Apellido AS apellidoEncargado FROM ((encargo INNER JOIN persona ON encargo.persona_Id=persona.ID_persona)INNER JOIN usuarios ON encargo.id_usuario=usuarios.IdUsuario )WHERE encargo.Id_encargo='" + id_encargo + "' ";
            registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                datos = new Encargo(registros.getInt("id_encargo"), registros.getString("FechaPedido"), registros.getString("FechaEntrega"), registros.getString("Descripcion"), registros.getInt("Precio"), registros.getInt("Abono"), registros.getInt("SaldoPendiente"), registros.getString("Estado"), registros.getString("Nombre") + " " + registros.getString("Apellido"), registros.getString("nombreEncargado") + " " + registros.getString("apellidoEncargado"));
                //hay coincidencias se guardan los valores en la clase encargo
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
        return datos;
    }

    //se recogen los datos para editar
    public void editarDatosReserva(int id_reserva, String fechaR, String horaR, String descripcion) {
        boolean respuesta = false;
        try {
            String fecha = fechaR;
            String hora = horaR;
            String anexos = descripcion;
            //mediante el ingreso del id se modificaran los datos de fecha, hora y descripcion
            String consulta = "UPDATE reserva SET  FechaReserva='" + fecha + "', horaReserva='" + hora + "', Anexos='" + anexos + "' WHERE ID_reserva='" + id_reserva + "' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
    }

    //se recogen los datos para editar
    public void editarDatosEncargo(int id_encargo, String fechaE, String descripcion) {
        boolean respuesta = false;
        try {
            String fechaF = fechaE;
            String anexos = descripcion;
            //mediante el ingreso del id se modificaran los datos de fecha y descripcion
            String consulta = "UPDATE encargo SET fechaEntrega='" + fechaE + "', Anexos='" + anexos + "' WHERE Id_encargo='" + id_encargo + "' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
    }

    //se editara el estado del encargo
    public void editarEstadoEncargo(int id_encargo, String est) {
        boolean respuesta = false;
        try {
            String estado = est;
            //mediante el estado que se ingrese se colocara en la coincidencia del id
            String consulta = "UPDATE encargo SET  Estado='" + estado + "' WHERE Id_encargo='" + id_encargo + "' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
    }

    //se eliminan los datos de la reserva que coincida con el id
    public void eliminarDatosReserva(int idReserva) {
        boolean respuesta = false;
        try {
            int cedula = idReserva;
            //si el id coincide se eliminara la fia
            String consulta = "DELETE FROM reserva WHERE ID_reserva='" + cedula + "' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
    }

    //se eliminan los datos del encargo que coincida con el id
    public void eliminarDatosEncargo(int idEncargo) {
        boolean respuesta = false;
        try {
            int cedula = idEncargo;
            //si el id coincide se eliminara la fia
            String consulta = "DELETE FROM encargo WHERE Id_encargo='" + cedula + "' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
    }

    public Usuarios login(int usuario, String contraseña) {
        ResultSet registro = null;
        Usuarios data = null;
        try {
            String consulta = "SELECT * FROM `usuarios` WHERE `IdUsuario`='" + usuario + "' AND `contraseña`='" + contraseña + "'";
            registro = manipularDB.executeQuery(consulta);
            registro.next();
            if (registro.getRow() == 1) {
                data = new Usuarios(registro.getInt("IdUsuario"), registro.getString("contraseña"), registro.getString("cargo"), registro.getString("Nombre"), registro.getString("Apellido"), registro.getInt("Telefono"));
            } else {
                data = null;
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar el cliente: " + ex.getMessage());
        }
        return data;
    }
}
