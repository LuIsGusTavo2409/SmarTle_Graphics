package smartle_grafics;
import galapagos.*;
import java.util.*;

public class DrawFunctions {
  
  public static void draw(Turtle wally, Equations equation){
    List<Double> rango = equation.rango();
    double dom = -7;
    double img1 = rango.get(0);
    wally.jumpTo(dom * 50, img1 * 50);
    for(double img : rango){
      double savedom = round2decimals(dom);
      //System.out.println(savedom);
      //System.out.println(img);
      wally.moveTo(savedom * 50, img * 50);
      dom += 0.01;
    }
  } 
  public static double round2decimals(double num){
    int integer = (int)(num * 100);
    return integer / 100.0;
  }
}
