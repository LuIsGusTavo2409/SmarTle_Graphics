package SmarTle_Graphics.main.java.smartle_grafics;
import SmarTle_Graphics.main.java.galapagos.*;

public class SmarTle {

  public static void main(String[] args) {
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
    Equations conv = new Equations("x^(2) + x- 1", false);
    System.out.println(conv.getTerms());
    //System.out.println(conv.rango());
    DrawFunctions.draw(wally, conv);
  }
} 
