//$ No documentation :( this makes it hard to figure out what is happening in this class

//I am the sole author of the work in this repository.

import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class FrequencyList{
  private Vector<Association<String, Integer>> thirdChar;
  private int freqListSum;

  private static Random rand = new Random();

  public FrequencyList(){
    thirdChar = new Vector<Association<String, Integer>>();
    freqListSum = 0;
  }

  public void addNewElem(String let){
    int index = thirdChar.indexOf(new Association<String, Integer>(let, null));
    if(index == -1){
      thirdChar.add(new Association<String, Integer>(let, 1));
    }
    else{
      thirdChar.get(index).setValue(thirdChar.get(index).getValue()+1);
    }
    freqListSum++;
  }

  public String pickNext(){
	  //$(-1) there is a bug here--the first character can never be chosen
    int num = rand.nextInt(freqListSum)+1;
    int tally = 0;
    for(int i = 0; i < thirdChar.size(); i++){
      tally = tally + (thirdChar.get(i)).getValue();
      if(num < tally){
        return (thirdChar.get(i)).getKey();
      }
    }
    //$ this should produce some error message, as you do not ever want to get here
    //$(but you actually do!)
    //$In some ways this is a second bug
    return "";
  }
}
