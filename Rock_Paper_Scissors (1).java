import java.util.Scanner;

public class Rock_Paper_Scissors {
    
    public static void main(String []args) {
        
        Rock_Paper_Scissors newGame = new Rock_Paper_Scissors();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose Rock, Paper, or Scissors: ");
        String userInput = scanner.nextLine();
        
        String result = newGame.userChoice(userInput);
        
        System.out.print(result);
        
        scanner.close();
        
    }
    
    public String userChoice(String userInput) {
        if (userInput.equalsIgnoreCase("rock")) {
            return ("You chose rock");
        } else if (userInput.equalsIgnoreCase("scissors")) {
            return ("You chose scissors");
        } else if (userInput.equalsIgnoreCase("paper")) {
            return ("Your chose paper");
        } else {
            return ("Fuck off");
        }
    }
}