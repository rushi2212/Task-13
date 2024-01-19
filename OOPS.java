//Use OOP for creating class with constructor,  getters and setters and invoke that methods from other class.
public class OOPS {
    public static void main(String args[]) {
        XYZ obj = new XYZ();
        obj.setName("Rushikesh");
        System.out.println(obj.getName());
    }
}

class Student {
    String name;

    Student() {
        System.out.println("Base class constructor called.");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}

class XYZ extends Student {
    XYZ() {
        System.out.println("Derived class constructor called.");
    }
}