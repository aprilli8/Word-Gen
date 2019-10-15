//I am the sole author of the work in this repository.


import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class WordGen{
  private static Table dataStorage;

  private static Random rand = new Random();
  private static Scanner scan = new Scanner(System.in);

  public WordGen(String input, int k){
    dataStorage = new Table(input, k);
  }

  public static void main(String[] args){
    int kLevel = Integer.parseInt(args[0]);

    //$ would be much nicer if could read in a file
    //System.out.print("Enter text: ");
    StringBuffer textBuffer = new StringBuffer();
    while (scan.hasNextLine()){
      String line = scan.nextLine();
      textBuffer.append(line);
      textBuffer.append("\n");
    }
    String text = textBuffer.toString();

    WordGen wordData = new WordGen(text, kLevel);
    for(int i = 0; i < 500; i++){
      System.out.print(dataStorage.pickNext(text.substring(0,kLevel)));
    }
  }
}
