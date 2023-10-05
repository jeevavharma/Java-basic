import java.util.Scanner;

public class OOPS {
//    Methods =~ function
//    if its outside a class it is a function. if it is inside a class it is called methods.
public static void main(String[] args) {
//    two methods: 1. function definition  2. function calling
//    add(10, 15); // function calling inside main function.
//    natPrint(10);

}

//    void - return type (function output datatype)
//    function defining that is function definition

//    void with parameters

//    public static void add(int a, int b) {
//        int c = a + b;
//        System.out.println(c);
//    }

//    void without parameters

//    public static void add() {
//        int a = 10;
//        int b = 15;
//        int c = a + b;
//        System.out.println(c);
//    }

//    non-void with parameter.

//    public static int add(int a, int b) {
//        int c = a + b;
//        return c; // in void place we have put int because we gonna return integer that is return c
//    this return value will go the main function where we called it add.
//        to print c;  sout with function called in the main fn.


//    non-void without parameter.

//    public static int add() {
//        int a = 10;
//        int b = 15;
//        int c = a + b;
//        return c;
//    }


//    A function calling itself - recursion.
//    1. base case  2. recursive case
// we are priniting 10-1 natural numbers. 1 will be end
//    public static void natPrint(int n) {
//    base case
//        in base case we have to give where it is going to end
//    if (n==1){
//        System.out.println(1);
//    }
//    recursive case
//    else {
//        System.out.println(n);
//        natPrint(n-1);
//    }

}

//    pillars of oops
//    1. Encapsulation   2. Abstraction    3. Polymorphism    4. Inheritance
//    classes & objects
//    class - inside a class methods & variables will be there.

class AppForm{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

//    public static void main(String[] args) {
//       syntax for creating an object
//        class name object name = new function call(constructor)
//        AppForm codeio = new AppForm();
//        codeio.name = "Code io";
//        codeio.rollno = 10;
//        codeio.display();
//    }
}

//can create a new class and store above

class Main{
    public static void main(String[] args) {
        AppForm codeio = new AppForm();
        codeio.name = "Code io";
        codeio.rollno = 10;
        codeio.display();

        AppForm viewer = new AppForm();
        viewer.name = "Jeevavharma";
        viewer.rollno = 1000;
        viewer.display();
    }
}



// Access modifiers
// public, private, protected, Default.

//constructors - it basically has the same name as class with ().
// 1. default constructor  2. parameterized constructor
// diff b/w  methods and constructor.
// method will have a return type has void but constructor don't.
// method will have different name but constructor name should be equal to class name.
// we can call method anytime but constructor can be called only when we create a object.
// method is an explicit call (we gonna call that) we can call more number of times.
// constructor is an implicit call (it is called automatically when obj created) called only one time.

class Sample{
    int rolno;
    int marks;


//    default constructor is just create a object doesn't pass any parameter.
       Sample(){


    }

}
class Constructor{
    public static void main(String[] args) {
        Sample obj = new Sample(); // sample() is the constructor and can be used for parameter.
        System.out.println(obj.rolno);
        System.out.println(obj.marks);
    }
}

// Encapsulation & Abstraction
// Encapsulation - related information and function  making them come under single name. e.g: class
// Abstraction - Data hidding (hidding the unnessacery details)

// Inheritance - we can reuse the code from parent class and we can call child name to show output beacuse
// dogs extends animal means: it inherit all th info from parent and copy to dog.
//class Animal{
//    int noLegs = 4;
//
//    public static void eat(){
//        System.out.println("i am eating");
//    }
//    public static void walk(){
//        System.out.println("i am walking");
//    }
//}
//class dog extends Animal{
//    boolean canBark = true;
//}
//
//class call {
//    public static void main(String[] args) {
//        dog obj = new dog();
//        System.out.println(obj.noLegs);
//        System.out.println(obj.canBark);
//        obj.eat();
//        obj.walk();
//    }
//}


// Polymorphism - poly = many  morphism = forms
// same name but different parameter.

//class Polymorphism {
//    public static void main(String[] args) {
//        Method obj = new Method();
//        obj.display();
//        obj.display(5);
//
//    }
//
//    class Method {
//        void display() {
//            System.out.println("I am void function");
//        }
//
//        void display(int a) {
//            System.out.println(a);
//        }
//    }
//}

//  types of inheritance.
// 1. Single inheritance - 1 parent 1 child
// 2. multilevel inheritance - 1 parent 1 parent 1 child e.g: grandfather -> father -> son
// 3. hierarchical inheritance - 1 parent but more child.
// 4. hybrid - 2 inheritance if we join
// 5. multiple inheritance - (it doesn't support in java directly) 2 parent 1 child e.g: father -> mother -> son


// Abstract classes - we cant create object inside abstract class and we cannot create a object if it is an abstract class
// if we want to use abstract class then we have to create another class and make it extends(inheritance).
// if we use abstract method then we should overwrite definetly.

/*


abstract class Computer{
    abstract void turnoff(); // abstract method if we want to call this then we have to overwrite.
    void TurnOn(){
        System.out.println("Turning on");
    }
}
class Hp extends Computer{
    void turnoff(){
        System.out.println("HP turning off");
    }
    void TurnOn(){
        System.out.println("Turning on");
    }
}
class Dell extends Computer{
    void TurnOn(){
        System.out.println("Turning on");
    }
    void turnoff(){
        System.out.println("Dell turning off");
    }
}
class Abstract {
    public static void main(String[] args) {
        Hp obj = new Hp();
        obj.turnoff();
        obj.TurnOn();

        Dell obj1 = new Dell();
        obj1.turnoff();
        obj1.TurnOn();
    }

}

 */

// Interfaces - to declare a method in interface it should be always abstract method.
// we can use multiple inheritance using interface only.
/*
interface Father{
    abstract void call();
    abstract void talk();

}

class Interface implements Father{  // we use implements while using interface.
    @Override
    public void call() {
        System.out.println("calling"); // we should give public because it clash with above interface
    }

    @Override
    public void talk() {
        System.out.println("talking");
    }

    public static void main(String[] args) {
        Interface ob = new Interface();
        ob.call();
        ob.talk();
    }
}

 */

// static keyword - without creating an object to access a member directly we use static keyword. (in method case)
// advantage : saves memory space.

// final & super & this keywords
// final - constant.
// super - if you use super it will executed parent details, it will not executed details in their respective one.
// this - denotes instance variable.

// Package = collection of classes


// Exception - abnormal termination
// Exception Handling
// when we don't use try and catch the code will execute error in a/b and shows error it will not execute below codes
// to avoid this we use try and catch in try we put which code will give error and in catch we should give alternative for that.
// using this will not affect below codes.
// catch is catching the error using object (ArithmeticException - this the type of error) (E- object)
// if we don;t the type of error then we can give just (Exception)

/*
class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;  // 5/0 will give you error
        int b = 0;
        try { // inside try we have to give which one will output error
            System.out.println(a/b);
        }
        catch (ArithmeticException E){
            System.out.println("b is 0");

        }
        catch (Exception E){      // u can give multiple catch element for try.
            System.out.println("b is 0");

        }
        finally {
            System.out.println("finally block"); // finally will execute even if u have error or don't have error.
        }
        System.out.println("hello");
    }
}

 */

// throw keyword is used to throw an exception by ourself (explicit).
/*
class ExceptionHandling {
    static void check(int age) {
        if (age<18) {
            throw new ArithmeticException("Age is invalid");
        }

    }

    public static void main(String[] args) {
        try{
            check(17);
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
    }
}

 */
// throws keyword should be given in function definition.
// Exception is a bulid in class in java where it has all the expections.
// throws sholud be used when using user defined
// throws we can give multiple exception.
/*
class UserDefined extends Exception {
    UserDefined(String str){
        super(str);
    }
}

class ExceptionHandling {
    static void check(int age) throws UserDefined,ArithmeticException {
        if (age<18) {
            throw new UserDefined("Age is invalid");
        }
        else {
            throw new ArithmeticException("Age is valid");
        }

    }

    public static void main(String[] args) {
        try{
            check(17);
        }
        catch (UserDefined E){
            System.out.println(E.getMessage());
        }
        catch (ArithmeticException E){
            System.out.println(E.getMessage());
        }
    }
}

 */

// Predefined classes.
// toString, toBinaryString, valueOf, parseInt
class DataTypes{
    public static void main(String[] args) {
        String s = Integer.toString(55);
        System.out.println(s);

        String x = Integer.toBinaryString(15); // here output is string
        System.out.println(x);

//        string to int we use valueOf
        int y = Integer.valueOf(x); // here output is integer.
        System.out.println(y);

//        parseInt also dos the same as valueOf. the difference is valueOf returns Integer class object.
//        Whereas parseInt returns int.


    }
}





