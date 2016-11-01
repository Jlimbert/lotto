import java.util.Scanner;
import java.util.Random;
public class lotterydraw
{
   public static void main(String[] args)
   {       
       Scanner input = new Scanner (System.in);
       System.out.println("enter a number between 1-49");
       int number1 = input.nextInt();
       System.out.println("enter a number between 1-49");
       int number2 = input.nextInt();
       System.out.println("enter a number between 1-49");
       int number3 = input.nextInt();
       System.out.println("enter a number between 1-49");
       int number4 = input.nextInt();
       System.out.println("enter a number between 1-49");
       int number5 = input.nextInt();
       System.out.println("enter a number between 1-49");
       int number6 = input.nextInt();
       
       System.out.println("the random numbers are: ");
       int Matches = 0;
       Random randomGenerator = new Random();
    for (int idx = 1; idx <= 7; ++idx){
      int randomInt = randomGenerator.nextInt(49);
      if (randomInt == number1){
      System.out.println("Number " + randomInt + "   - MATCH");
    } else if (randomInt == number2){
        System.out.println("Number " + randomInt + "   - MATCH");
        } else if (randomInt == number3){
        System.out.println("Number " + randomInt + "   - MATCH");
        } else if (randomInt == number4){
        System.out.println("Number " + randomInt + "   - MATCH");
        } else if (randomInt == number5){
        System.out.println("Number " + randomInt + "   - MATCH");
        } else if (randomInt == number6){
        System.out.println("Number " + randomInt + "   - MATCH");
    }else 
        Matches = Matches + 1;
    System.out.println("Number " + randomInt+ "   - NO MATCH");
    }
    
   if (Matches == 6) {
       System.out.println("Unlucky - no prize");
} else if (Matches == 5) {
    System.out.println("£10 prize!");
    } else if (Matches == 4) {
    System.out.println("£100 prize!");
    } else if (Matches == 3) {
    System.out.println("£1000 prize!");
    } else if (Matches == 2) {
    System.out.println("£10000 prize!");
    } else if (Matches == 1) {
    System.out.println("£100000 prize!");
    } else if (Matches == 0) {
    System.out.println("JACKPOT!!!! £1000000 prize!");
}
}
}
