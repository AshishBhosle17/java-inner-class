package anonymous;

// Interface A with a method
interface A {
    void show();
}

// Normal class B with a method (not abstract)
class B {
    void display() {
        System.out.println("In case of Normal class");
    }
}

// Abstract class C with an abstract method
abstract class C {
    abstract void print();
}

// Class Imp containing anonymous inner classes
class Imp {
    // Anonymous inner class for interface A
    A a = new A() {
        public void show() {
            System.out.println("In case of Interface class");
        }
    };

    // Anonymous inner class for normal class B
    B b = new B() {
        @Override
        void display() {
            System.out.println("In case of Normal class (Overridden)");
        }
    };

    // Anonymous inner class for abstract class C
    C c = new C() {
        @Override
        void print() {
            System.out.println("In case of Abstract class");
        }
    };
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Imp
        Imp imp = new Imp();

        // Call methods from the anonymous inner classes
        imp.a.show();   // Output: In case of Interface class
        imp.b.display(); // Output: In case of Normal class (Overridden)
        imp.c.print();   // Output: In case of Abstract class
    }
}
