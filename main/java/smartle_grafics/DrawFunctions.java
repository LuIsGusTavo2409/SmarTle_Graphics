package SmarTle_Graphics.main.java.smartle_grafics;
import SmarTle_Graphics.main.java.galapagos.*;
import java.util.*;

public class DrawFunctions {
  
  public static void draw(Turtle wally, Equations equation, double init, double fin){
    List<Double> rango = equation.rango(init, fin);
    double dom = init;
    double img1 = rango.get(0);
    wally.jumpTo(dom * 50, img1 * 50);
    wally.print("" + init);
    int i = 0;
    for(Double img : rango){
      Double savedom = round2decimals(dom);
      //System.out.println(savedom);
      //System.out.println(img);
      if(img.isNaN()){
        wally.jumpTo((savedom + 0.01) * 50, rango.get(i + 1) * 50);
      }
      wally.moveTo(savedom * 50, img * 50);
      dom += 0.01;
      if(rango.size() > i){
        i++;
      }
      if(i == rango.size() - 1)
        wally.print("" + fin);
    }
  } 
  public static double round2decimals(double num){
    int integer = (int)(num * 100);
    return integer / 100.0;
  }
}
