// this is a programe of grade calculator 
import java.util.Scanner;
public class gradecalculator {
        public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                       int english , math , hindi , computer , science;

                        System.out.println("Enter the marks you obtained in math"); //1
                        int m1 = sc.nextInt();
                        System.out.println("Enter the marks you obtained in science"); //2
                        int s2 = sc.nextInt();
                        System.out.println("Enter the marks you obtained in english"); //3
                        int e3 = sc.nextInt();
                        System.out.println("Enter the marks you obtained in computer"); //4
                        int c4 = sc.nextInt();
                        System.out.println("Enter the marks you obtained in hindi");  //5
                        int h5 = sc.nextInt();
                        int total = m1+s2+e3+c4+h5;
                        
                        int average =  total / 5;                                       // 5 is the total no. of subjects
                         System.out.println(average);
                         
                         if (average>=90) {
                            System.out.println("Grade A");   // obtained 90+ 
                         }
                        else if (average>=80 && average>90) {
                            System.out.println("Grade B");    // obtained 80+ 
                        }
                        else if (average>=70 && average>80) {
                            System.out.println("Grade C");    // obtained 70+ 
                        }
                        else if (average>=60 && average>80) {
                            System.out.println("Grade D");     // obtained 60+ 
                        }
                        else if (average>=40 && average>60) {
                            System.out.println("Grade E");    // obtained 40+ 
                        }
                        else if (average>=30 && average>40) {
                            System.out.println("Grade F");    // Fail
                        }
                    }



}