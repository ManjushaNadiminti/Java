abstract class A {
    abstract void display();
}

abstract class B extends A {
    void display() {
        System.out.println("I am the implementation of the abstract method.");
    }
    
    abstract void show();  
}

class C extends B {
    void show() {
        System.out.println("I am also an implementation of an abstract method.");
    }
    
    public static void main(String[] args) { 
        C obj = new C();
        obj.display(); 
        obj.show(); 
    }
}
OUTPUT:
        I am the implementation of the abstract method.
        I am also an implementation of an abstract method.
