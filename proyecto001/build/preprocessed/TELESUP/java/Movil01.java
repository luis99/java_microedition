/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TELESUP.java;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author telesup
 */
public class Movil01 extends MIDlet implements CommandListener{
    
Display pantalla;
Form ventana1;
TextField campo1,campo2;
StringItem resultado;
Command botonproducto,botonsalir;

public Movil01()
{
    
}
    public void startApp() {
        pantalla=Display.getDisplay(this);
    ventana1=new Form("Ventana Principal");
    campo1=new TextField("numero 1",null,10,TextField.NUMERIC);
    
     campo2=new TextField("numero 2",null,10,TextField.NUMERIC);        
        ventana1.append(campo1);
            ventana1.append(campo2);
            resultado=new StringItem("Resultado :\n",null);
            ventana1.append(resultado);
          botonproducto=new Command ("calcular",Command.OK,1);
            botonsalir=new Command ("salir",Command.OK,1);
        
        ventana1.addCommand(botonsalir);
         ventana1.addCommand(botonproducto);
        ventana1.setCommandListener(this);
        pantalla.setCurrent(ventana1);
    
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if(c==botonproducto)
        {
            calcularproducto();
            
        }
        if(c==botonsalir)
            
        {
            salirprograma();
            
        }  
        
            
    }
public void calcularproducto()
{
   String txtcampo1,txtcampo2;
   int numero1,numero2;
   int producto=0;
  txtcampo1= campo1.getString();
    txtcampo2= campo2.getString();
numero1=Integer.parseInt(txtcampo1);
numero2=Integer.parseInt(txtcampo2);
producto=numero1*numero2;
resultado.setText("Producto:"+producto);

}

public void salirprograma()
{
    
}
}

