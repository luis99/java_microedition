/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELESUP.JAVA.PRINCIPAL;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/**
 * @author telesup
 */
public class mobil01 extends MIDlet implements CommandListener{

    Display pantalla;
    Form ventana1;
    TextField campo1,campo2;
    StringItem resultado;
    Command botonproducto, botonsalir;
    public mobil01()
    {

    
    }
    public void startApp()
    {
   
     /*******se instancia la pantalla *****/
        pantalla=Display.getDisplay(this);
         ventana1=new Form("VENTANA PRINCIPAL");
         resultado=new StringItem("Resultado:\n","");
         
         
         
         
         campo1=new TextField("numero 1", null,10, TextField.NUMERIC);
        campo2=new TextField("numero 2", null,10, TextField.NUMERIC);
       ventana1.append(resultado);
        ventana1.append(campo1);
        ventana1.append(campo2);
        pantalla.setCurrent(ventana1);
        
        botonproducto=new Command("calcular",Command.OK,1);
        botonsalir=new Command("salir",Command.EXIT,1);
         
         ventana1.addCommand(botonproducto);
         ventana1.addCommand(botonsalir);
         
   
        /*******fin de la pantalla *****/
    }
    
    public void pauseApp() 
    {
    }
    
    public void destroyApp(boolean unconditional) 
    {
    
    
    }

    public void commandAction(Command c, Displayable d) {
       if(c==botonproducto){}
       if(c==botonsalir){} 
      }
    
    public void calcularproducto(){
    
    String txtcampo1,txtcampo2;
    int numero1,numero2;
    int producto=0;
    campo1.getString();
    
    }
    
    public void salirprograma(){}
}
