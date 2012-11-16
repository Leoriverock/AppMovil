package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManejadorBD {
    
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String bd = "jdbc:mysql://localhost:3306/grupo2";
    private final static String usuario = "grupo2";
    private final static String password = "pa2012";
    
    private Connection conexion;
    private java.sql.Statement st;
    
    private static ManejadorBD instancia = null;
    
    public static ManejadorBD getInstancia(){
        if(instancia == null){
            instancia = new ManejadorBD();
        }
        return instancia;
    }
    
    private ManejadorBD() {
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(bd, usuario, password);
            st = conexion.createStatement();
            System.out.println("Conexion exitosa");
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public java.sql.Statement getStatement(){
        return st;
    }
    
    public List ObtenerEquipos()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select ID_Equipos,Nombre from equipos");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2)); 
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayEquipo(String ID)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select ID_Equipos from equipos where ID_Equipos='"+ID+"'");
            while(res.next())
            {   
                if(ID.equals(String.valueOf(res.getObject(1))));
                {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarEquipo(String ID, String Nombre){
        try{
            st.executeUpdate("insert into equipos (ID_Equipos, Nombre) values ('"+ID+"','"+Nombre+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
    
   //////////////////////////////////////////////////////////////////////
    
    public List ObtenerCompeticiones()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select id_competicion,Nombre,anio,tipo,penca from competiciones");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2));
                Lista.add(res.getObject(3)); 
                Lista.add(res.getObject(4));
                Lista.add(res.getObject(5));
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayCompeticiones(String ID)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select ID_competicion from competiciones where ID_competicion='"+ID+"'");
            while(res.next())
            {   
                if(ID.equals(String.valueOf(res.getObject(1))));
                {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarCompeticion(String ID, String Nombre, String Anio, String Tipo, String Penca){
        try{
            st.executeUpdate("insert into competiciones (ID_Competicion, Nombre, Anio, Tipo, Penca) values ('"+ID+"','"+Nombre+"','"+Anio+"','"+Tipo+"','"+Penca+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
    //////////////////////////////////////////////////////////////////////////////////
    public List ObtenerJugadores()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select ID_jugador,Nombre,nombrecompleto,fecha_nacimiento,nacionalidad,posicion,altura,peso from jugadores");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2)); 
                Lista.add(res.getObject(3)); 
                Lista.add(res.getObject(4)); 
                Lista.add(res.getObject(5)); 
                Lista.add(res.getObject(6)); 
                Lista.add(res.getObject(7)); 
                Lista.add(res.getObject(8)); 
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayJugador(String ID)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select ID_jugador from jugadores where ID_jugador='"+ID+"'");
            while(res.next())
            {   
                if(ID.equals(String.valueOf(res.getObject(1))));
                {
                    return true;
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarJugador(String ID, String Nombre, String NombreCompleto, String FechaNac, String Nacionalidad, String Posicion, String Altura, String Peso){
        try{
            st.executeUpdate("insert into jugadores (ID_jugador, Nombre, nombrecompleto, fecha_nacimiento, nacionalidad, posicion, altura, peso) values ('"+ID+"','"+Nombre+"','"+NombreCompleto+"','"+FechaNac+"','"+Nacionalidad+"','"+Posicion+"','"+Altura+"','"+Peso+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public List ObtenerJugadorEquipo()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select jugador,equipo from jugadores_equipos");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2)); 
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayJugadorEquipo(String Jugador,String Equipo)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select Jugador,Equipo from Jugadores_equipos where Jugador='"+Jugador+"' and Equipo='"+Equipo+"'");
            while(res.next())
            {   
                if(Jugador.equals(String.valueOf(res.getObject(1))));
                {
                    if(Equipo.equals(String.valueOf(res.getObject(2))));
                    {                        
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarJugadorEquipo(String Jugador, String Equipo){
        try{
            st.executeUpdate("insert into jugadores_equipos (jugador, equipo) values ('"+Jugador+"','"+Equipo+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public List ObtenerLigaEquipo()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select id_liga,id_equipo,dividendo from liga_equipo");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2));
                Lista.add(res.getObject(3));
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayLigaEquipo(String Liga,String Equipo)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select id_liga,id_equipo from liga_equipo where id_liga='"+Liga+"' and id_equipo='"+Equipo+"'");
            while(res.next())
            {   
                if(Liga.equals(String.valueOf(res.getObject(1))));
                {
                    if(Equipo.equals(String.valueOf(res.getObject(2))));
                    {                        
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarLigaEquipo(String Liga, String Equipo, String Dividendo){
        try{
            st.executeUpdate("insert into liga_equipo (id_liga, id_equipo, dividendo) values ('"+Liga+"','"+Equipo+"','"+Dividendo+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////
    public List ObtenerGolesJugador()
    {
        ResultSet res;
        List Lista=new ArrayList();
        try {
            res = st.executeQuery("select id_jugador,id_competicion,cant_goles from goles_jugador");
            while(res.next())
            {                
                Lista.add(res.getObject(1)); 
                Lista.add(res.getObject(2));
                Lista.add(res.getObject(3));
            }
            return Lista;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public boolean HayGolesJugador(String Jugador,String Competicion)
    {
        ResultSet res;
        try {
            res = st.executeQuery("select id_jugador, id_competicion from goles_jugador where id_jugador='"+Jugador+"' and id_competicion='"+Competicion+"'");
            while(res.next())
            {   
                if(Jugador.equals(String.valueOf(res.getObject(1))));
                {
                    if(Competicion.equals(String.valueOf(res.getObject(2))));
                    {                        
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public void AgregarGolesJugador(String Jugador, String Competicion, String Cant_goles){
        try{
            st.executeUpdate("insert into goles_jugador (id_jugador, id_Competicion, cant_goles) values ('"+Jugador+"','"+Competicion+"','"+Cant_goles+"')");
           
        } catch (SQLException e){
            System.out.println("errorcompeticion"+e.toString());
        }
    }
}