import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class FrequencyList{
  private Vector<Association<String, Integer>> thirdChar;
  private int freqListSum;

  private static Random rand = new Random();

  //Creates new FrequencyList Vector
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
    int num = rand.nextInt(freqListSum)+1;
    int tally = 0;
    for(int i = 0; i < thirdChar.size(); i++){
      tally = tally + (thirdChar.get(i)).getValue();
      if(num < tally){
        return (thirdChar.get(i)).getKey();
      }
    }
    return "";
  }

/*
  public static void main(String[] args){
    FrequencyList test = new FrequencyList("a");
    System.out.println(test.getLetter(0));
    System.out.println(test.getCount(0));
    test.addCount("a");
    System.out.println(test.getCount(0));
  }
*/
}
