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
    return ConvertToCoef.convertCCos(conv);
  }
  public static double convertCTan(String conv){
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
  public static double convertCAcot(String conv){
    return ConvertToCoef.convertCAcot(conv);
  }
  public static double convertCAsec(String conv){
    return ConvertToCoef.convertCAsec(conv);
  }
  public static double convertCAcsc(String conv){
    return ConvertToCoef.convertCAcsc(conv);
  }
  public static double sqrtEquation(String conv, double dominio){
    return ConvertToEspecialFunction.sqrtEquation(conv, dominio);
  }
  public static boolean isSqrt(String equ){
    return ConvertToEspecialFunction.isSqrt(equ);
  }
  public static boolean isSen(String equ){
    return ConvertToEspecialFunction.isSen(equ);
  }
  public static double senEquation(String conv, double dominio){
    return ConvertToEspecialFunction.senEquation(conv, dominio);
  }
  public static boolean isCos(String equ){
    return ConvertToEspecialFunction.isCos(equ);
  }
  public static double cosEquation(String conv, double dominio){
    return ConvertToEspecialFunction.cosEquation(conv, dominio);
  }
  public static boolean isTan(String equ){
    return ConvertToEspecialFunction.isTan(equ);
  }
  public static double tanEquation(String conv, double dominio){
    return ConvertToEspecialFunction.tanEquation(conv, dominio);
  }
  public static boolean isCot(String equ){
    return ConvertToEspecialFunction.isCot(equ);
  }
  public static double cotEquation(String conv, double dominio){
    return ConvertToEspecialFunction.cotEquation(conv, dominio);
  }
  public static boolean isSec(String equ){
    return ConvertToEspecialFunction.isSec(equ);
  }
  public static double secEquation(String conv, double dominio){
    return ConvertToEspecialFunction.secEquation(conv, dominio);
  }
  public static boolean isCsc(String equ){
    return ConvertToEspecialFunction.isCsc(equ);
  }
  public static double cscEquation(String conv, double dominio){
    return ConvertToEspecialFunction.cscEquation(conv, dominio);
  }
  public static boolean isLn(String equ){
    return ConvertToEspecialFunction.isLn(equ);
  }
  public static double lnEquation(String conv, double dominio){
    return ConvertToEspecialFunction.lnEquation(conv, dominio);
  }
  public static boolean isAsen(String equ){
    return ConvertToEspecialFunction.isAsen(equ);
  }
  public static double asenEquation(String conv, double dominio){
    return ConvertToEspecialFunction.asenEquation(conv, dominio);
  }
  public static boolean isAcos(String equ){
    return ConvertToEspecialFunction.isAcos(equ);
  }
  public static double acosEquation(String conv, double dominio){
    return ConvertToEspecialFunction.acosEquation(conv, dominio);
  }
  public static boolean isAtan(String equ){
    return ConvertToEspecialFunction.isAtan(equ);
  }
  public static double atanEquation(String conv, double dominio){
    return ConvertToEspecialFunction.atanEquation(conv, dominio);
  }
  public static boolean isAcot(String equ){
    return ConvertToEspecialFunction.isAcot(equ);
  }
  public static double acotEquation(String conv, double dominio){
    return ConvertToEspecialFunction.acotEquation(conv, dominio);
  }
  public static boolean isAsec(String equ){
    return ConvertToEspecialFunction.isAsec(equ);
  }
  public static double asecEquation(String conv, double dominio){
    return ConvertToEspecialFunction.asecEquation(conv, dominio);
  }
  public static boolean isAcsc(String equ){
    return ConvertToEspecialFunction.isAcsc(equ);
  }
  public static double acscEquation(String conv, double dominio){
    return ConvertToEspecialFunction.acscEquation(conv, dominio);
  }
  public static boolean globalEspecialFunction(String conv){
    return isSqrt(conv) || isSen(conv) || isCos(conv) || isTan(conv) || isCot(conv) || isSec(conv) || isCsc(conv) || isLn(conv) || isAsen(conv) || isAcos(conv) || isAtan(conv) || isAcot(conv) || isAsec(conv) || isAcsc(conv);
  }
  public static double toEspecialFunction(String term, double dominio){
    if(isAsen(term)){
      double coef = convertCAsen(term);
      return coef * asenEquation(term, dominio);
    }else if(isAcos(term)){
      double coef = convertCAcos(term);
      return coef * acosEquation(term, dominio);
    }else if(isAtan(term)){
      double coef = convertCAtan(term);
      return coef * atanEquation(term, dominio);
    }else if(isAcot(term)){
      double coef = convertCAcot(term);
      return coef * acotEquation(term, dominio);
    }else if(isAsec(term)){
      double coef = convertCAsec(term);
      return coef * asecEquation(term, dominio);
    }else if(isAcsc(term)){
      double coef = convertCAcsc(term);
      return coef * acscEquation(term, dominio);
    }else if(isSen(term)){
      double coef = convertCSen(term);
      return coef * senEquation(term, dominio);
    }else if(isCos(term)){
      double coef = convertCCos(term);
      return coef * cosEquation(term, dominio);
    }else if(isTan(term)){
      double coef = convertCTan(term);
      return coef * tanEquation(term, dominio);
    }else if(isCot(term)){
      double coef = convertCCot(term);
      return coef * cotEquation(term, dominio);
    }else if(isSec(term)){
      double coef = convertCSec(term);
      return coef * secEquation(term, dominio);
    }else if(isCsc(term)){
      double coef = convertCCsc(term);
      return coef * cscEquation(term, dominio);
    }else if(isLn(term)){
      double coef = convertCLn(term);
      return coef * lnEquation(term, dominio);
    }else if(isSqrt(term)){ //llamado de acuerdo al tipo de funcion
      double coef = convertCR(term);
      return coef * sqrtEquation(term, dominio);
    }//en caso de no ser una funcion base, añadirlo a la l
    double result = convertOneTerm(term, dominio);
    return result;
  }

  public static boolean oneTerm(String equ){
    if(globalEspecialFunction(equ)){
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
        realTerms.add(toEspecialFunction(term, dominio));
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
  public static List<Double> rango(List<String> terms, double init, double fin){
    List<Double> rango = new ArrayList<Double>();
    for(Double i = init; i < fin; i += 0.01){
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
