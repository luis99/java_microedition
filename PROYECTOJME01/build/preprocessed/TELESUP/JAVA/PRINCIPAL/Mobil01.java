package TELESUP.JAVA.PRINCIPAL;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Mobil01 extends MIDlet {

    Form venPrincipal,venopcion1,venopcion2;
    Display pantalla;
    String x[]={"PRIMERA OPCION","SEGUNDA OPCION"};
    ChoiceGroup opciones;     
    Command botonejecutar,botonregresarop1,botonregresarop2;
   
    public Mobil01()
    {
        ventanaPrincipal();
    }
    
    public void ventanaPrincipal(){
    pantalla=Display.getDisplay(this);
    venPrincipal=new Form("Ventana principal");
    opciones=new ChoiceGroup("Menu opciones",List.EXCLUSIVE,x,null); 
    venPrincipal.append(opciones);
    botonejecutar=new Command("Ejecutar",Command.OK,1);
    venPrincipal.addCommand(botonejecutar);
    pantalla.setCurrent(venPrincipal);
     }
    public void ventanaopcion1(){
    pantalla=Display.getDisplay(this);
    venopcion1=new Form("Ventana Opcion2");
    pantalla.setCurrent(venopcion1);
     }
    public void ventanaopcion2(){
    pantalla=Display.getDisplay(this);
    venopcion2=new Form("Ventana Opcion 2");
    pantalla.setCurrent(venopcion2);
     }
    
    public void startApp()
    {
        
        
        
    }
    
    public void pauseApp()
    {
        
    }
    
    public void destroyApp(boolean unconditional)
    {
        
    }
}
