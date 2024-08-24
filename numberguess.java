import java.util.Scanner;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();
        int min_no = 1 , max_no = 100 , max_attempt = 3 , score = 0;
        System.out.println("Number guess :");
        while (true) {
            int generated_no = rndm.nextInt(100) ,  attempt = 0 , guess_no;
       //      int attempt = 0;
           // int guess_no;
            while (attempt < max_attempt) {
                System.out.println("enter the number u guess :");
                guess_no = sc.nextInt();
                attempt++;

                if (guess_no < generated_no) {
                    System.out.println("Oh Shit! Take a bigger number ");
                } 
                else if (guess_no > generated_no) {
                    System.out.println("Again u r wrong take smaller ");
                } 
                else 
                {
                    System.out.println( "Great! guessed right number " + generated_no + " in " + attempt + " attempt");
                    score++;
                    break;
                }

                if (attempt == max_attempt) {
                    System.out.println("Sorry , limit Reached , The correct no. is : " + generated_no);
                }

            }
            System.out.println("Your score is : " + score + " in number of attempts :" + attempt);
        }
       
    
       }
}
