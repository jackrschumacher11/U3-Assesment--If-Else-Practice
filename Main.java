
/**
Jack Schumacher
AP CS A
Orange (5)
Chapter 3 - Boolean Expressions
Programming A

*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Import Scanner and create a new scanner object
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Life Simulator");
    // Print title and offer first options
    System.out.println("You wake up. What do you do?");
    System.out.println(" 1. Take a shower \n 2.Go to work \n 3. Go for a walk");
    // Have user input a number between 1&3 in order to create a valid output
    int wakeupChoice = input.nextInt();
    if (wakeupChoice == 1) {
      System.out.println("You take a shower. Now you are ready for the day. You then go to work");
    } else if (wakeupChoice == 2) {
      System.out.println("You go to work. Since you did not shower, you smell.");
    } else if (wakeupChoice == 3) {
      System.out.println("You go for a walk and burn 1,000 calories. After your walk, you take a shower and go to work.");
    } else {
      System.out.println("Input Error. Input a number between 1-3");
      // Error Prep -> Tells user to input number between 1-3 in order to have a valid output
    }
    
    System.out.println("You need to eat breakfast before you go to work. What do you want to eat?");
    System.out.println(" 1. Oatmeal \n 2. Bagel with Bacon \n 3. Avoccado Toast");
    int breakfastChoice = input.nextInt();
    // Option #2 - Have the user input a number between 1&3 to generate a valid input
    if (breakfastChoice == 1){
      System.out.println("You eat oatmeal. It tastes good.");
    }
    else if (breakfastChoice == 2){
      System.out.println("You eat a bagel with bacon. It tastes great.");
    }
    else if (breakfastChoice ==3){
      System.out.println("You eat avaccado toast. It tastes great and gives you plenty of energy for your busy day at work.");
    }
    else{
      System.out.println("Input Error. Please input a number between 1&3.");
    }

    System.out.println("You are at work. What would you like to do?");
    System.out.println(" 1. Go to a meeting \n 2. Work on a presentation \n 3.Chat with a co-worker");
    // Option #3 - Have the user input a number between 1&3 to generate a valid output
    int workChoice = input.nextInt();
    if (workChoice == 1) {
      System.out.println("You go to a meeting but it is really boring, so you fall asleep. You have a pleasant sleep and wake up ");
    }
    else if (workChoice == 2){
      System.out.println("You work on a presentation and are successful in completing it.");
    }
    else if (workChoice == 3){
      System.out.println("You make some small talk with your co-worker Susan. Then you go back to work.");
    }
    else{
      // In case the user does not enter a number between 1&3, the program will ask them to input a number between 1&3.
      System.out.println("Input Error. Input a number between 1-3");
    }
    System.out.println("It is time to eat lunch. What do you wish to eat?");
    System.out.println(" 1. Eat A snack from the vending machine \n 2. Eat a sandwhich from the work cafe \n 3.Eat a snack in your desk.");
    int lunchChoice = input.nextInt();
    if (lunchChoice ==1){
      System.out.println("You eat a snack from the vending machine. It does not provide you with much more energy for the rest of the day.");
    }
    else if (lunchChoice ==2){
      System.out.println("You eat a sandwhich from the work cafe. Your energy is repenlished for the rest of the day.");
    }
    else if (lunchChoice == 3){
      System.out.println("You eat a healthy snack in your desk. This gives you plenty of energy for the rest of the day.");
    }
    else{
      System.out.println("Input Error. Input a number between 1-3");
      // In case the user enters a number less than or greater than 0 to 3 the program will ask them to re-enter.
    }
    
    System.out.println("After lunch, you go back to work. What do you want to do?");
    System.out.println(" 1. Talk to your boss about a new product that you are launching. \n 2. Talk to a coworker about a new porject you want to work on. \n 3. Take a nap at your desk.");
    int workChoice2 = input.nextInt();
    if (workChoice2 == 1){
      System.out.println("You talk to your boss about a new project that you want to work on. She gives you control over it.");
    }
    else if (workChoice2 ==2){
      System.out.println("You tlak to a co worker about a project that you are intrested in. She expresses her support of your project.");
    }
    else if (workChoice == 3){
      System.out.println("You take a nap at your desk. Your boss catches you napping and fires you.");
    }
    else{
      System.out.println("Input Error. Input a number between 1-3");
      // Error message to prompt user to re-enter a number between 1-3 when the program is rerun.
    }
    System.out.println("The workday is over, and so you have to drive home. What do you do?");
    System.out.println(" 1. Take the freeway home \n 2.Take the back roads in order to get home \n 3.Take a helicopter.");
    int driveHomeChoice = input.nextInt();
    if (driveHomeChoice == 1){
      System.out.println("You take the freeway home, but there is a lot of traffic so you are 5 hours late getting home.");
    }
    else if (driveHomeChoice == 2){
      
    }
      
  
  }
}