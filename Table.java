import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class Table{
  private Vector<Association<String, FrequencyList>> initialChars;

  public Table(String letters, String nextLet){
    initialChars = new Vector<Association<String, FrequencyList>>();
    initialChars.add(new Association<String, FrequencyList>(letters, new FrequencyList(nextLet)));
  }

  public String getInitialChars(int index){
    return (initialChars.get(index)).getKey();
  }

  public String getNextChar(int index, int ind){
    return ((initialChars.get(index)).getValue()).getLetter(ind);
  }

  public int getFreqCount(int index, int ind){
    return ((initialChars.get(index)).getValue()).getCount(ind);
  }

  public void addFreqElement(String firstLets, String nextLet){
    for(int i = 0; i < initialChars.size(); i++){
      if(((initialChars.get(i)).getKey()).equals(firstLets)){
        (initialChars.get(i)).setValue(new FrequencyList(nextLet));
      }
    }
  }

  public static void main(String[] args){
    Table test = new Table("ab", "c");
    System.out.println(test.getInitialChars(0));
    System.out.println(test.getNextChar(0,0));
    System.out.println(test.getFreqCount(0,0));
    test.addFreqElement("ab", "d");
    System.out.println(test.getNextChar(0,1));
    System.out.println(test.getFreqCount(0,1));
  }
}
