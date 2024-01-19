public class InterFace {
    public static void main(String[] args) {
        Mango obj1 = new Mango();
        obj1.FruitName();
        obj1.TreeHeight();
        Apple obj2 = new Apple();
        obj2.FruitName();
    }
}

interface Fruits {
    void FruitName();
}

interface Tree {
    void TreeHeight();
}

class Mango implements Fruits, Tree {
    public void FruitName() {
        System.out.println("Mango Fruit.");
    }

    public void TreeHeight() {
        System.out.println("Tree height is 20feet.");
    }
}

class Apple implements Fruits {
    public void FruitName() {
        System.out.println("Apple Fruit.");
    }
}