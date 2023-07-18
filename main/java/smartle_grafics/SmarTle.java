package SmarTle_Graphics.main.java.smartle_grafics;
import SmarTle_Graphics.main.java.galapagos.*;

import javax.swing.JOptionPane;

public class SmarTle {

  public static void main(String[] args) {
    
    //draw.setGrid(false);
    //Metodo para extraer coeficiente : yes
    //Metodo para extraer grado : no
    //Metodo para extraer termino independiente : no
    //Seno: yes
    //Coseno: yes
    //Tangente: no
    //Cotangente: no
    //Secante: no
    //Cosecante: no
    //aquí va la programación de interfaz gráfica
    //la ejecucion no esta optimizada, ya que c auomo hice el cambio en separate terms, la clase 
    //convertTerms aun no soporta ese cambio,n se debe mejorar, estaba pensando en hacer llama
    //llamada de los terminos anidados recursivamente
    //exacto
    //no funciona ln
    JOptionPane.showMessageDialog(null, "No esta soportado, el logaritmo natural\nLa forma para ingresar la ecuacion es:\n\tx^(2) + x + 1\nNo ingresar '*', sin embargo si esta soportado la multiplicacion implicitá\nDe la forma\n\t 3(x + 5)^(2)\nPero no de la forma 3(x+5)");
    int quiereGraficar = 0;
    do{
      String laEcu = JOptionPane.showInputDialog(null, "Ingrese la función");
      if(laEcu.length() == 0) return; 
      Equations conv = new Equations(laEcu, false);
      //System.out.println(conv.getTerms());
      //System.out.println(conv.rango());
      TurtleDrawingWindow draw = new TurtleDrawingWindow();
      Turtle wally = new Turtle(Turtle.NO_DEFAULT_WINDOW);
      wally.speed(5000);//al final tendremos que hacer que el origan siga a la tortuga
      /* para que de smart explanatiosn, 10000 de velocidad es muy overkill */
      /*
      * es solo para no demorar en probar que grafique xd
      si me lo imaginaba... entonces invocamos a los demás que ni los conozco
      */
      draw.add(wally);
      draw.setUnit(0.5);
      draw.setVisible(true);
      try{
        DrawFunctions.draw(wally, conv);
      }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Hay un error intenta con otra funcion :(");
      }
      quiereGraficar = JOptionPane.showConfirmDialog(null, "¿Quiere graficar?");
      if(quiereGraficar == 1 || quiereGraficar == 2){
        draw.setVisible(false);
        return;
      }
      if(quiereGraficar == 0){
        draw.setVisible(false);
      }
    }while(quiereGraficar == 0);
    return;
  }
} 
