import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class FrequencyList{
  private Vector<Association<String, Integer>> thirdChar;

  public FrequencyList(String letter){
    thirdChar = new Vector<Association<String, Integer>>();
    thirdChar.add(new Association<String, Integer>(letter, new Integer(1)));
  }

  public String getLetter(int index){
    return (thirdChar.get(index)).getKey();
  }

  public int getCount(int index){
    return (thirdChar.get(index)).getValue();
  }

  public void addCount(String let){
    for(int i = 0; i < thirdChar.size(); i++){
      if(((thirdChar.get(i)).getKey()).equals(let) == true){
        (thirdChar.get(i)).setValue((thirdChar.get(i)).getValue()+1);
      }
    }
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
