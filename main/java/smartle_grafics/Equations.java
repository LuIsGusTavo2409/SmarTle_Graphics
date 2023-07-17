package smartle_grafics;
import java.util.*;

public class Equations {
  public String equ;
  public int posX;

  Equations(String equsinconvertir, boolean isModified){
    if(isModified){
      this.equ = equsinconvertir;
      this.equ = equ.concat("+");
    }else{
      this.equ = equsinconvertir.replace(" ", "").toLowerCase();
      this.equ = equ.replace("-", "+-");
      this.equ = equ.concat("+");
      this.posX = equ.indexOf('x');
    }
  }
  public String getEquation(){
    return this.equ;
  }
  public List<String> getTerms(){
    return SeparateTerms.getTerms(this.equ);
  }
  public List<Double> rango(){
    return ConvertTerms.rango(getTerms());
  }
}
