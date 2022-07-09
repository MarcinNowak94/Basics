package Basics;

public class ExampleClass {
    /**
    *Brak specyfikatora oznacza że dostęp jest pakietowy - z całego pakietu (public)
    *Hermetyzacja: Refactor>Encapsulate fields
     *gettery i settery pozwalają kontrolować format danych oraz ujednolicić interfejs
    */
    String name;
    public int age;
    public double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*Default constructor*/
    public ExampleClass() {
        /*I would prefer to use setters*/
        name="John";
        age=16;
        height=169;
    }
    /*Overloaded constructor with name clash*/
    /*In Java You cannot set default values, using only initialisation list*/
    public ExampleClass(String name,int age,double height){
        /*I would prefer to use setters*/
        this.name=name;
        this.age=age;
        this.height=height;
    };

    public void SystemPrint(){
        System.out.println("Name: "+this.name+";\tAge: "+this.age+";\tHeight: "+this.height+";");
    }
    /*every class inherits from Object class, thus has ToString and other members*/
    public String ToString(){
        return("My name is "+this.name+" I am "+this.age+" and "+this.height+"cm tall");
    };
    public double Weight(){
        return height-110+0.1*age;
    }
}

/**
 * Inheretance, in Java class can only inherit from one class
 *
 */
class InheretanceExample extends ExampleClass{
    /*Child class inherits all members but not constructors*/
    public InheretanceExample() {
        /*I would prefer to use setters*/
        name="John";
        age=16;
        height=169;
    }
    public InheretanceExample(String name,int age,double height){
        /*I would prefer to use setters*/
        this.name=name;
        this.age=age;
        this.height=height;
    };

    /*TODO: comment, pre 0:45*/
    @Override
    public double Weight() {
        return super.Weight();
    }
}
/*abstract class*/
abstract class AbstractExample {
    String strong;
}

///**
// * Class containing only abstract members is called Interface
// * Interface cannot have atributes
// * */
//class InterfaceExample implements InheretanceExample, ExampleClass {

//}