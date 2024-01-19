public class Hybrid {
    public static void main(String[] args) {
        Shark obj = new Shark();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Base Class.");
    }
}

class Mammals extends Animal {
    Mammals() {
        System.out.println("Mammals class Derived from Animal class.");
    }
}

class Fish extends Animal {
    Fish() {
        System.out.println("Fish class Derived from Animal class.");
    }
}

class Shark extends Fish {
    Shark() {
        System.out.println("Shark class Derived from Fish class.");
    }
}