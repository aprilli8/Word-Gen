import structure5.*;
import java.util.Scanner;
import java.util.Random;

public class WordGen{
  private static Table dataStorage;

  private static Random rand = new Random();
  private static Scanner scan = new Scanner(System.in);

  public WordGen(String input){
    dataStorage = new Table(input);
  }

  public static void main(String[] args){
    /*System.out.print("Enter text: ");
    StringBuffer textBuffer = new StringBuffer();
    while (scan.hasNextLine()){
      String line = scan.nextLine();
      textBuffer.append(line);
      textBuffer.append("\n");
    }
    String text = textBuffer.toString();
    */
    String text = "the theatre is their thing";

    WordGen wordData = new WordGen(text);
    for(int i = 0; i < 500; i++){
      System.out.print(dataStorage.pickNext(text.substring(0,2)));
    }
  }
}
