import java.util.Scanner;

public class Number_Checker {
    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number!: ");
    
    int number = input.nextInt();
    
    String result = numberInput(number);
    System.out.print(result);
    }

    public static String numberInput(int number) {
        if (number % 2 == 0) {
            return "Even Number!";
        } else {
            return "Odd Number...";
        }
    }
}