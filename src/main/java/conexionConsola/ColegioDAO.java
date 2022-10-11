package conexionConsola;
import java.sql.*;


public class ColegioDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    Conexion acceso = new Conexion();
    
    public void listar(){
        String sql = "SELECT * FROM alumnos";
        try{
            //inicializa la base de datos
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //LISTAR DATOS DE LA TABLA
            while(rs.next()){
                System.out.println("**************************");
                System.out.println("Id:" + rs.getInt(1));
                System.out.println("Nombre:" + rs.getString(2));
                System.out.println("Direccion:" + rs.getString(3));
                System.out.println("Telefono:" + rs.getInt(4));
            }           
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        
        ColegioDAO objselect = new ColegioDAO();
        objselect.listar();
    }      
}
