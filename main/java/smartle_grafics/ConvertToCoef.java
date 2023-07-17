package SmarTle_Graphics.main.java.smartle_grafics;

public class ConvertToCoef{
  public static double convertC(String equ, int posX){
    //int posX = equ.indexOf("x");
    int realcoef = 0, p = 0, p1 = 0;
    double ext = 0;
    char coef = '"';
    boolean noErrors = posX != -1;
    while (noErrors) { //bucle hasta encontrar el coeficiente real
      try {
        coef = equ.charAt(posX - p - 1);
        realcoef = Integer.parseInt(String.valueOf(coef));
        ext = ext + realcoef * (int)Math.pow(10, p1);
        p++;
        p1++;
      } catch (Exception e) {
        noErrors = false;
        if (p == 0) {
          ext = -1;
        }
        switch (coef) {
          case '-':
            ext = -1 * ext;
            if (p == 0) {
              ext = -1;
            }
            break;
          case '"':
            ext = 1;
            break;
          case '.':
            ext = ext / (int)Math.pow(10, p);
            p1 = 0;
            p++;
            noErrors = true;
            break;
        }
      }
    }
    if (posX == -1) {
      ext = Double.valueOf(equ);
    } 
    return ext;
  }
  public static double convertCpar(String equ){
    return convertC(equ, equ.indexOf("("));
  }
  public static double convertCR(String equ){
    return convertC(equ, equ.indexOf("sqrt"));
  }
  public static double convertCSen(String equ){
    return convertC(equ, equ.indexOf("sen"));
  }
  public static double convertCCos(String equ){
    return convertC(equ, equ.indexOf("cos"));
  }
  public static double convertCTan(String equ){
    return convertC(equ, equ.indexOf("tan"));
  }
  public static double convertCCot(String equ){
    return convertC(equ, equ.indexOf("cot"));
  }
  public static double convertCSec(String equ){
    return convertC(equ, equ.indexOf("sec"));
  }
  public static double convertCCsc(String equ){
    return convertC(equ, equ.indexOf("csc"));
  }
  public static double convertCLn(String equ){
    return convertC(equ, equ.indexOf("ln"));
  }
  public static double convertCAsen(String equ){
    return convertC(equ, equ.indexOf("asen"));
  }
  public static double convertCAcos(String equ){
    return convertC(equ, equ.indexOf("acos"));
  }
  public static double convertCAtan(String equ){
    return convertC(equ, equ.indexOf("atan"));
  }
  public static double convertCAcot(String equ){
    return convertC(equ, equ.indexOf("acot"));
  }
  public static double convertCAsec(String equ){
    return convertC(equ, equ.indexOf("asec"));
  }
  public static double convertCAcsc(String equ){
    return convertC(equ, equ.indexOf("acsc"));
  }
}
