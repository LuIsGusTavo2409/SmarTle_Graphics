package smartle_grafics;

public class ConvertToGrado extends ConvertTerms{
  public static double convertG(String equ, double dominio){
    int posPot = equ.indexOf('^');
    if(posPot == -1 && equ.indexOf("x") == -1){
      return 0;
    }
    if(posPot == -1){
      return 1;
    }  //busca la posición del signo potenciador
    String exp = "";
    String find = "";
    int i = posPot + 2;
    boolean sinCerrar = posPot != -1;
    while (sinCerrar && !find.equals(")")) {
      try {
        exp += find;
        find = equ.substring(i, i + 1);
      } catch (Exception e) {
        sinCerrar = false;
      }
      i++;
    }
    Equations myEqu = new Equations(exp, true);
    return imagen(convertTerms(myEqu.getTerms(), dominio));
  }
}
