import java.util.Scanner;
public class GuessGame {
  public static void main(String[] args ){

    int secretNum;
    int guess;
    boolean correct = false;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give me secret number: ");
    secretNum = keyboard.nextInt();

    while (!correct) {

      System.out.println("Guess: ");
      guess = keyboard.nextInt();

      if(guess == secretNum){
        correct = true;
        System.out.println("You are right!");
      }
      else if (guess < secretNum) {
        System.out.println("Too High");
      }
      else if (guess > secretNum) {
        System.out.println("Too Low");
      }



    }
    
  }
}