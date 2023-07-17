package smartle_grafics;
import java.util.*;
public class ConvertToEspecialFunction extends ConvertTerms{
  public static boolean isSqrt(String equ){
    return equ.indexOf("sqrt") != -1;
  }
  public static double sqrtEquation(String equ, double dominio){
    int i = equ.indexOf("sqrt") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.sqrt(imagen);
  }
  public static boolean isSen(String equ){
    return equ.indexOf("sen") != -1;
  }
  public static double senEquation(String equ, double dominio){
    int i = equ.indexOf("sen") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.sin(imagen);
  }
  public static boolean isCos(String equ){
    return equ.indexOf("cos") != -1;
  }
  public static double cosEquation(String equ, double dominio){
    int i = equ.indexOf("cos") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.cos(imagen);
  }
  public static boolean isTan(String equ){
    return equ.indexOf("tan") != -1;
  }
  public static double tanEquation(String equ, double dominio){
    int i = equ.indexOf("tan") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.tan(imagen);
  }
  public static boolean isCot(String equ){
    return equ.indexOf("cot") != -1;
  }
  public static double cotEquation(String equ, double dominio){
    int i = equ.indexOf("cot") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    double tangente = Math.tan(imagen);
    if(tangente != 0)
      return 1.0 / tangente;
    return Double.NaN;
  }
  public static boolean isSec(String equ){
    return equ.indexOf("sec") != -1;
  }
  public static double secEquation(String equ, double dominio){
    int i = equ.indexOf("sec") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    double coseno = Math.cos(imagen);
    if(coseno != 0)
      return 1.0 / coseno;
    return Double.NaN;
  }
  public static boolean isCsc(String equ){
    return equ.indexOf("csc") != -1;
  }
  public static double cscEquation(String equ, double dominio){
    int i = equ.indexOf("csc") + 3; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    double seno = Math.sin(imagen);
    if(seno != 0)
      return 1.0 / seno;
    return Double.NaN;
  }
  public static boolean isLn(String equ){
    return equ.indexOf("csc") != -1;
  }
  public static double lnEquation(String equ, double dominio){
    int i = equ.indexOf("ln") + 2; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.log(imagen);
  }
  public static boolean isAsen(String equ){
    return equ.indexOf("asen") != -1;
  }
  public static double asenEquation(String equ, double dominio){
    int i = equ.indexOf("asen") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.asin(imagen);
  }
  public static boolean isAcos(String equ){
    return equ.indexOf("acos") != -1;
  }
  public static double acosEquation(String equ, double dominio){
    int i = equ.indexOf("acos") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.acos(imagen);
  }
  public static boolean isAtan(String equ){
    return equ.indexOf("acos") != -1;
  }
  public static double atanEquation(String equ, double dominio){
    int i = equ.indexOf("atan") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.atan(imagen);
  }
  public static boolean isAcot(String equ){
    return equ.indexOf("acot") != -1;
  }
  public static double acotEquation(String equ, double dominio){
    int i = equ.indexOf("acot") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    return Math.PI / 2.0 - Math.atan(imagen);
  }
  public static boolean isAsec(String equ){
    return equ.indexOf("asec") != -1;
  }
  public static double asecEquation(String equ, double dominio){
    int i = equ.indexOf("asec") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    if(imagen != 0.0000) 
      return Math.PI / 2.0 - Math.asin(1.0 / imagen);
    return Double.NaN;
  }
  public static boolean isAcsc(String equ){
    return equ.indexOf("acsc") != -1;
  }
  public static double acscEquation(String equ, double dominio){
    int i = equ.indexOf("acsc") + 4; 
    String arg = SeparateTerms.parenTerm(equ, i);
    Equations equation = new Equations(arg, true);
    List<Double> realterms = convertTerms(equation.getTerms(), dominio);
    double imagen = imagen(realterms);
    if(imagen != 0.0000) 
      return Math.asin(1.0 / imagen);
    return Double.NaN;
  }
}
