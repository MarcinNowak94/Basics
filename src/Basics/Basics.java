package Basics;

//Import tell Java Virtual Machine where to look for definition - substitute / for . and You have directory
//Define scope as narrow as You can in order to avoid Class name collisions
import java.util.Scanner;       //Basic input-output
import javax.swing.JOptionPane; //Windows and dialog-boxes

//Work with IntelliJ offline: https://www.jetbrains.com/help/idea/working-offline.html

/**
 * @author Marcin Nowak
 */

/**
 * //Javadoc comments
 * Notes
 * Lecture1
 * Class should be named same as project, starting with capital letter, members should be small letters.
 * There can be multiple classes in project but only one with public access due to historical reasons.
 * Code will be executed from main.
 *
 * Main always is void type because Java Virtual Machine does not use returned value.
 *
 * Change names only via refactor - because there are a lot of places in which name appears, refactoring ensures that
 * name will be changed in every place it ought to.
 *
 * Debugger vs Run console:
 * Debug runs different than run, this is important because those are two separate virtual machines - one is JDK specific
 * the other is for system usage. Thus adding libraries to one JVM can lead to project not working outside debugging.
 * !!!! Note to self: How to keep JVMs in sync? This had to be solved somehow already (or is it rookie mistake only?)
 *
 * You can install other JVMs, via Java Platform Manager Option, also there is a
* */

public class Basics {
    /**
     * Basic data types, their usage, stream manipulation and displaying messages.
     */
    static void Types_and_display(){
        //Hover over class name to see documentation
        int integer = 10;
        double real = 8.9;                                  //default type for real number
        System.out.println("This is how You print to standard console output.");
        //default character literal type
        String string_variable="Now would you kindly write something?";
        System.out.println(string_variable);

        //available in java.util.Scanner scanner class is used as input
        Scanner scanner = new Scanner(System.in);
        string_variable=scanner.nextLine();                  //Get line of text and store it as variable

        System.out.println("You've written: "+string_variable+
                "\nNow let's try something new." +
                "\nInput an integer number please:");
        integer = scanner.nextInt();
        System.out.println("Thanks! Now a real number please (separated by ,):");   //is separator based on system environmental variable?
        real=scanner.nextDouble();
        System.out.println("\nNow, printing numbers is not easy, see i'll try to add 10 to "+integer+" simply by + sign: "+integer+10+
                "\nAs You can see it's a trainwreck of a mistake, because Java treats them as text."+
                "\nInstead try conainting them within parenteses (), that way they will not be converted, just like this: "+(integer+10));

        //Somehow this did not generate error in given example in NetBeans, it gave Infinity as result
        //System.out.println("Java is a bit weird, dividing real by 0 is not an error, see: "+(integer/0));
        double result=0;
        //As per https://www.w3schools.com/java/java_try_catch.asp
        try {
            result=real/0;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println(real+"/"+0+"="+result+" (had to handle exception though)");
        }
    }
    static void Windows(){
        //*********************************************************
        //After the break
        //*********************************************************

        //Swing is one of graphic Java libraries, offers dialog-boxes
        //some types of windows are defined as text constants which you can use to control behavior (see WARNING_MESSAGE)
        JOptionPane.showMessageDialog(null,
                "<html>This message will be displayed in HTML.<br><i><b>Told ya!</i></b></br><html>",
                "Warning",
                JOptionPane.WARNING_MESSAGE);

        String text_from_popup;
        text_from_popup=JOptionPane.showInputDialog(
                null,
                "This real number (separated by .) will be converted to text:"
                );
        //You have to convert numbers from input using target type class methods
        double real=Double.parseDouble(text_from_popup);
        JOptionPane.showMessageDialog(null,
                "Since we converted text to double using target class method" +
                        "\nit is now a real number, look:"+real+"*2="+(real*2)
        );

    }

    public static void main(String[] args) {
        //Types_and_display();
        Windows();
    }
}
