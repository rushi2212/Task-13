public class SuperKeyword {
    public static void main(String[] args) {
        Dog obj = new Dog();
        System.out.println(obj.name);
    }
}

class Animal {
    String name;

    public void speak() {
        System.out.println("sound");
    }
}

class Dog extends Animal {
    Dog() {
        super.name = "dog";
        super.speak();
    }
}