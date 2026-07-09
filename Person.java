import java.util.Scanner;

public class Person {
    
    public static void main (String[] args) {
        
        Person person = new Person();
        
        int age = person.getAge();
        String name = person.getName();
        
        String greeting = person.greeting(age, name);
        
        System.out.print(greeting);
    }
    
    public String getName() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            return name;
        }
        
    public int getAge() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            return age;
        }
        
    public String greeting(int age, String name) {
        
        if (age >= 24) {
            return "Welcome to adulthood " + name;
            
        } else if (age >= 12) {
            return "Welcome to teenagehood/youngadulthood " + name;
            
        } else {
            return "Welcome to childhood " + name;
        }
    }
}