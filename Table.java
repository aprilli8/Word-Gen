import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class Table{
  private Vector<Association<String, FrequencyList>> initialChars;

  public Table(String input){
    initialChars = new Vector<Association<String, FrequencyList>>();
  }

  //pre: letters is a string of three letters
  public void addTableElem(String letters){
    //int index = initialChars.indexOf(new Vector<Association<String, FrequencyList>>(letters.substring(0,letters.length()-2), (letters.charAt(letters.length()-1), null)));
    int index = initialChars.indexOf(new Association<String, FrequencyList>(letters.substring(0,letters.length()-2), null));
    Association<String, FrequencyList> newAs;
    if(index == -1){
      newAs = new Association<String, FrequencyList>(letters.substring(0,letters.length()-2), new FrequencyList());
      initialChars.add(newAs);
    }
    else{
      newAs = initialChars.get(index);
    }
    newAs.getValue().addNewElem(letters.substring(letters.length()-1,letters.length()));
  }

  public String pickNext(String letters){
    int index = initialChars.indexOf(new Association<String, FrequencyList>(letters.substring(0,letters.length()-2), null));
    if(index == -1){
      System.out.println("Error");
    }
    else{
      initialChars.get(index).getValue().pickNext();
    }
    return "";
  }
/*
  public static void main(String[] args){
    Table test = new Table("the theatre is their thing");

    System.out.println(test.getInitialChars(0));
    System.out.println(test.getNextChar(0,0));
    System.out.println(test.getFreqCount(0,0));
    test.addFreqElement("ab", "d");
    test.addFreqCount("ab", "c");
    System.out.println(test.getNextChar(0,0));
    System.out.println(test.getFreqCount(0,0));
    System.out.println(test.getNextChar(0,1));
    System.out.println(test.getFreqCount(0,1));
  }
*/
}
