package TELESUP.JAVA.PRINCIPAL;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class Mobil01 extends MIDlet implements CommandListener {

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
    
    venPrincipal.setCommandListener(this);
    venPrincipal.addCommand(botonejecutar);
    pantalla.setCurrent(venPrincipal);
     }
    public void ventanaopcion1(){
    pantalla=Display.getDisplay(this);
    venopcion1=new Form("Ventana Opcion2");
    
   botonregresarop1=new Command("regresar",Command.OK,1);
    venopcion1.addCommand(botonregresarop1);
    venopcion1.setCommandListener(this);
    
    pantalla.setCurrent(venopcion1);
     }
    public void ventanaopcion2(){
    pantalla=Display.getDisplay(this);
    venopcion2=new Form("Ventana Opcion 2");
    pantalla.setCurrent(venopcion2);
    
    
    
   botonregresarop2=new Command("regresar",Command.OK,1);
    venopcion2.addCommand(botonregresarop2);
    venopcion2.setCommandListener(this);
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

    public void commandAction(Command c, Displayable d) {
        
        
        if(c==botonejecutar){
        Ejecutar();
        }
        if(c==botonregresarop1){
        ventanaPrincipal();
        }
        if(c==botonregresarop2){
        ventanaPrincipal();
        }
        
        
    }
    public void Ejecutar(){
    
    int op=opciones.getSelectedIndex();
    
    switch(op){
        case 0: ventanaopcion1();break;
        case 1: ventanaopcion2();break;
    
    }
    
    }
    
    
    public void InsertarImagen(String Imagen, Form ventana){
    
    
    }
    
}
