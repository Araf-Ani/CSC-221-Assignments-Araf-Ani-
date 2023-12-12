//Araf Ani
//Assignment #1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Task #1
        int age = 19;
        String name = "Araf";
        double bank = 89.73;  //Declaring 3 Variables
        System.out.println(age);
        System.out.println(name);
        System.out.println(bank); //Printing 3 Variables

        //Task #2
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = s.nextInt(); //Ask for user age.
        if (age >= 18) {
            System.out.println("You are an adult."); //If user is 18 or above, run this.
        } else {
            System.out.println("You are a minor."); //If user is below 18, run this.
        }

        //Task #3
        int number = 20;
        System.out.println("All even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) //This function will print all even numbers between 1 and 20.
        {
            if (i % 2 == 0) //This checks if the number is even.
            {
                System.out.print(i + " ");
            }
        }

        int N, i, sum = 0;

        N = 50;

        for (i = 0; i <= N; i++)  //This function will add all odd numbers between 1 and 50.
        {
            if ((i % 2) == 1) //This checks if the number is odd.
            {
                sum += i;
            }
        }

        System.out.println(" || Sum of all odd numbers between 0 to " + N + " = " + sum);

        //Task 4:
        int length, width, area; //This functions finds the area of a rectangle.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : "); //Length
        length =sc.nextInt();
        System.out.println("Enter the width of the rectangle : "); //Width
        width =sc.nextInt();
        area =length*width;
        System.out.println("Area of the rectangle is " +area); //Area

        //Task #5
        int num = 0;
        long factorial = 1;
        sc = new Scanner(System.in); //This functions finds the factorial of a given number.
        System.out.println("What number would you like the factorial of?");
        num =sc.nextInt();
        for(i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}