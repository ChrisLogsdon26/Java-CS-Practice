class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void favorite_hobby() {
        System.out.print("Hunt, Pray, Kill");
    }
    
}

class Dog extends Animal {
    
    Dog(String name) {
        super(name);
        System.out.println(name);
    }
    
    @Override 
    void favorite_hobby() {
        System.out.println("run, walk, get petted");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog chris = new Dog("Topher");
        chris.favorite_hobby();
    }
}
