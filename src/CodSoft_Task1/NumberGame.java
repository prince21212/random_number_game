package CodSoft_Task1;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome in World of Random NUmber Game ! What is Your Name :");
        String name = scan.nextLine();

        System.out.println("Enter the number of rounds you want to play");
        int round = scan.nextInt();
        /* For counting the lead number of win */
        int k = 0;
        int i = 1;
        int matchwin = 0;
        int matchlose = 0;
        while(i <= round) {
            System.out.println("Well ," + name + ", I am guessing a number between 1 to 100");
            System.out.println("this is your round :" + i);
            int myNumber = GetRandomNumber(1, 101);
            int chance = 4;
            while (chance >= 0) {
                if (chance == 0) {
                    System.out.println("Sorry ! You Loose Your All Chance ... Please Try in Next Round");
                    break;
                }
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Take a Guess ...");
                int guess = scan2.nextInt();

                if (guess == myNumber)
                {
                    System.out.println("Wow ! Your Guess is Correct . You won this Round");
                    matchwin++;
                    break;
                }
                else if (guess < myNumber) {
                    System.out.println("Your Guess is too low ");
                }
                else if (guess > myNumber) {
                    System.out.println("Your Guess too High ");
                }
                --chance;

            }
            i++;
        }
        if((matchwin == matchlose) != false)
        {
            System.out.println("Oops ! Match is Tie "+name+"");
        }
        else if(matchwin > matchlose)
        {
            System.out.println("Congratulations ! "+ name +" You Won The Game");
            //   System.out.println("You are leading with ,"+ matchwin +",points");


        }
        else
        {
            System.out.println("Oh no ! ,"+name+", You Loose The Game");

        }

    }
    public static int GetRandomNumber(int min , int max)
    {
        Random random  = new Random();
        return random.ints(min , max).findFirst().getAsInt();
    }
}
