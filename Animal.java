public class Animal {
    
    public static void main(String[] args) {
        Human Jesse = new Human();
        Bird Oj = new Bird();
        Dog Chris = new Dog();
        
        Jesse.species();
        Oj.species();
        Chris.species();
    }
}

class Human extends Animal {
    
    void species() {
        System.out.println("Homo sapien");
    }
}

class Bird extends Animal {
    
    void species() {
        System.out.println("Aves");
    }
}

class Dog extends Animal {
    
    void species() {
        System.out.println("Canis lupus");
    }
}
