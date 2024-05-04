package java;

class A {
    void displayA() {
        System.out.println("Inside Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Inside Class B");
    }
}

class C extends B {
    void displayC() {
        System.out.println("Inside Class C");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        C objC = new C();
        objC.displayA(); // Accessing method of class A through class C object
        objC.displayB(); // Accessing method of class B through class C object
        objC.displayC(); // Accessing method of class C through class C object
    }
}

