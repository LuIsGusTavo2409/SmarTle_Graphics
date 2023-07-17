package SmarTle_Graphics.main.java.smartle_grafics;

import java.util.*;

public class ConvertTerms {

  public static double convertC(String conv) {
    return ConvertToCoef.convertC(conv, conv.indexOf("x"));
  }
  public static double convertCpar(String conv){
    return ConvertToCoef.convertCpar(conv);
  }
  public static double convertG(String conv, double dominio) {
    return ConvertToGrado.convertG(conv, dominio);
  }
  public static double convertCR(String conv){
    return ConvertToCoef.convertCR(conv);
  }
  public static double convertCSen(String conv){
    return ConvertToCoef.convertCSen(conv);
  }
  public static double convertCCos(String conv){
    return ConvertToCoef.convertCTan(conv);
  }
  public static double convertCCot(String conv){
    return ConvertToCoef.convertCCot(conv);
  }
  public static double convertCSec(String conv){
    return ConvertToCoef.convertCSec(conv);
  }
  public static double convertCCsc(String conv){
    return ConvertToCoef.convertCCsc(conv);
  }
  public static double convertCLn(String conv){
    return ConvertToCoef.convertCLn(conv);
  }
  public static double convertCAsen(String conv){
    return ConvertToCoef.convertCAsen(conv);
  }
  public static double convertCAcos(String conv){
    return ConvertToCoef.convertCAcos(conv);
  }
  public static double convertCAtan(String conv){
    return ConvertToCoef.convertCAtan(conv);
  }
  public static double convertAcot(String conv){
    return ConvertToCoef.convertCAcot(conv);
  }
  public static double convertAsec(String conv){
    return ConvertToCoef.convertCAsec(conv);
  }
  public static double convertAcsc(String conv){
    return ConvertToCoef.convertCAcsc(conv);
  }
  public static double sqrtEquation(String conv, double dominio){
    return ConvertToEspecialFunction.sqrtEquation(conv, dominio);
  }
  public static boolean isSqrt(String equ){
    return ConvertToEspecialFunction.isSqrt(equ);
  }
  
  public static boolean oneTerm(String equ){
    if(equ.indexOf("sqrt") != -1){
      return true;
    }
    String saveEqu = equ;
    int posX = equ.indexOf("x");
    int oneX = 0;
    int posPlus = equ.indexOf("+"); 
    int isPlus = 0;
    int posPot = equ.indexOf("^");
    while(posX != -1){
      oneX++;
      equ = equ.substring(posX + 1);
      posX = equ.indexOf("x", posX);
    }
    while(posPlus != -1){
      isPlus++;
      saveEqu = saveEqu.substring(posPlus + 1);
      posPlus = saveEqu.indexOf("+", posPlus);
    }
    return ((oneX == 1 || oneX == 0) && isPlus == 0) ||  posPot != -1;
  }
  public static double convertOneTerm(String term, double dominio){
    //necesitamos identificar si hay potenciador, ademas de parentesis
    int posPot = term.indexOf("^");
    if(posPot != -1 && term.charAt(posPot - 1) == ')'){
      if(term.charAt(posPot - 1) == ')'){
        String otherEqu = "";
        int numPar = 1;
        char myChar = '\u0000';                        
        for(int i = posPot - 2; numPar != 0; i--){
          myChar = term.charAt(i);
          if(myChar == ')'){
            numPar++;
          }
          if(myChar == '('){
            numPar--;
            if(numPar == 0)
              break;
          }
          otherEqu = myChar + otherEqu;
        }
        Equations myEqu = new Equations(otherEqu, true);
        return convertCpar("(" + otherEqu +")") * Math.pow(imagen(convertTerms(myEqu.getTerms(), dominio)), convertG(term, dominio));
      }
    }
    return convertC(term) * Math.pow(dominio, convertG(term, dominio));
  }

  public static List<Double> convertTerms(List<String> terms, double dominio){
    List<Double> realTerms = new ArrayList<Double>();
    for(String term : terms){
      if(!oneTerm(term)){
        Equations equ = new Equations(term, true);
        realTerms.add(imagen(convertTerms(equ.getTerms(), dominio)));
      }else{
        if(isSqrt(term)){
          double coef = convertCR(term);
          realTerms.add(coef * sqrtEquation(term, dominio));
        }else{
          double result = convertOneTerm(term, dominio);
          realTerms.add(result);
        }
      }
    }
    return realTerms;
  }
  public static double imagen(List<Double> realterms){
    double imagen = 0;
    for(double term : realterms){
      imagen += term;
    }
    return imagen;
  }
  public static List<Double> rango(List<String> terms){
    List<Double> rango = new ArrayList<Double>();
    for(Double i = -7.0; i < 8; i += 0.01){
      double savei = round2decimals(i);
      //System.out.println(i);
      List<Double> realterms = convertTerms(terms, savei);
      double img = imagen(realterms);
      //System.out.println(img);
      rango.add(img);
    }
    return rango;
  }
  public static double round2decimals(double num){
    int integer = (int)(num * 100);
    return integer / 100.0;
  }
}
