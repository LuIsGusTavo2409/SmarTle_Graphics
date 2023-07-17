package smartle_grafics;
import java.util.*; 

public class SeparateTerms {

  public static String getTerm(String equ, int inindex){
    String term = "";
    int i = inindex;
    boolean noSign = true;
    boolean isParenthesis = false;
    while(noSign){
      char letter = equ.charAt(i);
      noSign = letter != '+';
      isParenthesis = letter == '(';
      if(isParenthesis && term.equals("")){
        return parenTerm(equ, i);
      }
      if(isParenthesis){
        return term + "(" + parenTerm(equ, i) + ")";
      }
      if(!noSign){
        return term;
      }
      term += letter;
      i++;
    }
    return term;
  }
  public static String parenTerm(String equ, int posPar){
    int numPar = 1;
    String term = "";
    boolean pot = false;
    for(int i = posPar + 1; i < equ.length(); i++){
      if(equ.charAt(i) == '('){
        numPar++;
      }
      if(equ.charAt(i) == ')'){
        numPar--;
        if(numPar == 0){
          if((i < equ.length() - 1 && equ.charAt(i + 1) == '^')){
            term = "(" + term;
            pot = true;
          }else{
            if(pot){
              term += ")";
            }
            return term;
          }
        }
      }
      term += equ.charAt(i);
    }
    return term;
  }
  public static int posSeparateTerm(String equ, int posAntTerm){
    int numPar = 0;
    boolean signoAntesDePar = equ.indexOf("+", posAntTerm) < equ.indexOf('(', posAntTerm);
    boolean hayPar = equ.indexOf('(', posAntTerm) != -1;
    if(hayPar && !signoAntesDePar){
      for(int i = posAntTerm; i < equ.length(); i++){
        if(equ.charAt(i) == '('){
          numPar++;
        }
        if(equ.charAt(i) == ')'){
          numPar--;
          if(numPar == 0){
            if((i < equ.length() - 1 && equ.charAt(i + 1) == '^')){
            }else{
              return i + 1;
            }
          }
        }
      }
    }
    return equ.indexOf("+", posAntTerm);
  }
  
  public static List<String> getTerms(String equation){
    List<String> result = new ArrayList<String>();
    boolean noErrors = true;
    int posSeparateTerm = 0;
    if(equation.indexOf("+-") == 0){
      posSeparateTerm = 1;
    }
    do{
      try{
        result.add(getTerm(equation, posSeparateTerm));
        posSeparateTerm = posSeparateTerm(equation, posSeparateTerm) + 1;
      }catch(Exception e){
        noErrors = false;
      }
    } while(noErrors);
    return result;
  }
}
