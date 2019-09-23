//I am the sole author of the work in this repository.

import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class Table{
  private Vector<Association<String, FrequencyList>> initialChars;

  public Table(String input, int k){
    initialChars = new Vector<Association<String, FrequencyList>>();
    for(int i = 0; i < input.length()-k; i++){
      addTableElem(input.substring(i,i+k));
    }
  }

  public void addTableElem(String letters){
    int index = initialChars.indexOf(new Association<String, FrequencyList>(letters, null));
    Association<String, FrequencyList> newAs;
    if(index == -1){
      newAs = new Association<String, FrequencyList>(letters, new FrequencyList());
      initialChars.add(newAs);
    }
    else{
      newAs = initialChars.get(index);
    }
    newAs.getValue().addNewElem(letters.substring(letters.length()-1,letters.length()));
  }

  public String pickNext(String letters){
    int index = initialChars.indexOf(new Association<String, FrequencyList>(letters, null));
    if(index == -1){
      System.out.println("Error");
    }
    else{
      return initialChars.get(index).getValue().pickNext();
    }
    return "";
  }
}
