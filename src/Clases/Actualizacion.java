
package Clases;

import Clases.ManejadorBD;
import WebService.Conexion;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPFaultException;

public class Actualizacion {
    
    public void actualizacion() 
    {        
        equipos();
        competiciones();
        jugadores();
        jugadoresequipos();
        ligaequipos();
        GolesJugador();
    }
    
    public void equipos()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List EquiposR= new ArrayList();
        List EquiposL= new ArrayList();
        EquiposR=Actualizacion.obtenerEquipos();
        EquiposL=BD.ObtenerEquipos();
        String ID;
        if(EquiposR.size()!=EquiposL.size())
        {  
            for(int i=0;i<EquiposR.size();i++)
            {
                ID=String.valueOf(EquiposR.get(i));
                if(BD.HayEquipo(ID)==false)
                {
                    BD.AgregarEquipo(ID, String.valueOf(EquiposR.get(i+1)));
                }
                i++;
            }
        }
        
    }
    
    public void competiciones()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List competicionR= new ArrayList();
        List competicionL= new ArrayList();
        competicionR=Actualizacion.obtenerCompeticiones();
        competicionL=BD.ObtenerCompeticiones();
        String ID;
        String Anio="";
        if(competicionR.size()!=competicionL.size())
        {  
            for(int i=0;i<competicionR.size();i++)
            {
                ID=String.valueOf(competicionR.get(i));
                if(BD.HayCompeticiones(ID)==false)
                {
                    Anio=String.valueOf(competicionR.get(i+2));
                    Anio=Anio.substring(0,4);
                    BD.AgregarCompeticion(ID, String.valueOf(competicionR.get(i+1)),Anio,String.valueOf(competicionR.get(i+3)),String.valueOf(competicionR.get(i+4)));
                }
                i++;
                i++;
                i++;
                i++;
            }
        }
        
    }
    
    public void jugadores()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List jugadorR= new ArrayList();
        List jugadorL= new ArrayList();
        jugadorR=Actualizacion.obtenerJugadores();
        jugadorL=BD.ObtenerJugadores();
        String ID;
        String Nacimiento="";
        if(jugadorR.size()!=jugadorL.size())
        {  
            for(int i=0;i<jugadorR.size();i++)
            {
                ID=String.valueOf(jugadorR.get(i));
                if(BD.HayJugador(ID)==false)
                {
                    Nacimiento=String.valueOf(jugadorR.get(i+3));
                    Nacimiento=Nacimiento.substring(0,10);
                    BD.AgregarJugador(ID, String.valueOf(jugadorR.get(i+1)),String.valueOf(jugadorR.get(i+2)),Nacimiento,String.valueOf(jugadorR.get(i+4)),String.valueOf(jugadorR.get(i+5)),String.valueOf(jugadorR.get(i+6)),String.valueOf(jugadorR.get(i+7)));
                }
                i++;
                i++;
                i++;
                i++;
                i++;
                i++;
                i++;
            }
        }
        
    }
    
    public void jugadoresequipos()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List EquiposR= new ArrayList();
        List EquiposL= new ArrayList();
        EquiposR=Actualizacion.obtenerJugadorEquipo();
        EquiposL=BD.ObtenerJugadorEquipo();
        String Jugador;
        String Equipo;
        if(EquiposR.size()!=EquiposL.size())
        {  
            for(int i=0;i<EquiposR.size();i++)
            {
                Jugador=String.valueOf(EquiposR.get(i));
                Equipo=String.valueOf(EquiposR.get(i+1));
                if(BD.HayJugadorEquipo(Jugador,Equipo)==false)
                {
                    BD.AgregarJugadorEquipo(Jugador, Equipo);
                }
                i++;
            }
        }
        
    }
    
    public void ligaequipos()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List EquiposR= new ArrayList();
        List EquiposL= new ArrayList();
        EquiposR=Actualizacion.obtenerLigaEquipo();
        EquiposL=BD.ObtenerLigaEquipo();
        String Liga;
        String Equipo;
        if(EquiposR.size()!=EquiposL.size())
        {  
            for(int i=0;i<EquiposR.size();i++)
            {
                Liga=String.valueOf(EquiposR.get(i));
                Equipo=String.valueOf(EquiposR.get(i+1));
                if(BD.HayLigaEquipo(Liga,Equipo)==false)
                {
                    BD.AgregarLigaEquipo(Liga, Equipo, String.valueOf(EquiposR.get(i+2)));
                }
                i++;
                i++;
            }
        }
        
    }
    
    public void GolesJugador()
    {
        ManejadorBD BD= ManejadorBD.getInstancia();        
        List JugadorR= new ArrayList();
        List JugadorL= new ArrayList();
        JugadorR=Actualizacion.obtenerGolesJugador();
        JugadorL=BD.ObtenerGolesJugador();
        String Jugador;
        String Competicion;
        if(JugadorR.size()!=JugadorL.size())
        {  
            for(int i=0;i<JugadorR.size();i++)
            {
                Jugador=String.valueOf(JugadorR.get(i));
                Competicion=String.valueOf(JugadorR.get(i+1));
                if(BD.HayGolesJugador(Jugador,Competicion)==false)
                {
                    BD.AgregarGolesJugador(Jugador, Competicion, String.valueOf(JugadorR.get(i+2)));
                }
                i++;
                i++;
            }
        }
        
    }
    
    public static String URL = "http://192.168.56.101:8084/ConexionBDWS/Conexion?wsdl";

public static int getResponseCode(String urlString) throws MalformedURLException, IOException {
    URL u = new URL(urlString); 
    HttpURLConnection huc =  (HttpURLConnection)  u.openConnection(); 
    huc.setRequestMethod("GET"); 
    huc.connect(); 
    return huc.getResponseCode();
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   

    private void ventana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventana2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventana2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        /*Object o;
        try
        {
        o=Actuali.conect();
        }
        catch(Exception ex){
        }
        prueba2.setText("preuba");*/
    }//GEN-LAST:event_formWindowGainedFocus

    private static java.util.List<java.lang.Object> obtener() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtener();
    }


    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel prueba2;
    private javax.swing.JButton ventana2;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.Object> sql3() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.sql3();
    }

    private static Object conect() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();         
        return port.conect(); 
    }

    private static java.util.List<java.lang.Object> obtenerEquipos() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerEquipos();
    }

    private static java.util.List<java.lang.Object> obtenerCompeticiones() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerCompeticiones();
    }

    private static java.util.List<java.lang.Object> obtenerJugadores() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerJugadores();
    }

    private static java.util.List<java.lang.Object> obtenerJugadorEquipo() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerJugadorEquipo();
    }

    private static java.util.List<java.lang.Object> obtenerLigaEquipo() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerLigaEquipo();
    }

    private static java.util.List<java.lang.Object> obtenerGolesJugador() {
        WebService.Conexion_Service service = new WebService.Conexion_Service();
        WebService.Conexion port = service.getConexionPort();
        return port.obtenerGolesJugador();
    }
}
