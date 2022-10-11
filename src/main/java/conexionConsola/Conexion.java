
package conexionConsola;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

//colocar driver y libreria
Connection con; //
    String url="jdbc:mysql://localhost:3306/test";
    String user="root";
    String pass="1234";
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
           
        } catch (Exception e) {
            System.out.println("Error en la conexion!");
            System.out.println(e);
        }      
        return con; 
    }

public static void main(String []args){
    Conexion sp = new Conexion();
    System.out.println(sp.Conectar());
}

    
}

