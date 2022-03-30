package Basics;

import java.util.Scanner;       //Basic input-output
import javax.swing.JOptionPane; //Windows and dialogboxes

public class Basics {

    public static void main(String[] args) {
	    //This is comment
        /*
        This is multiline comment
        */


        System.out.println("This is how You print to standard console output.");
        String string_variable="Now would you kindly write something?";
        System.out.println(string_variable);

        Scanner scanner = new Scanner(System.in);
        string_variable=scanner.nextLine();                  //Get line of text and store it as variable
        System.out.print("You can concatenate objects by adding them"+string_variable);

        int integer = 10;
        double real = 8.9;
        System.out.print("This works with numbers too!: Integer + real = "+integer+real+". Oops!\n" +
                         "Remember to put them in parenthesis or they will be treated as text! Integer + real = "+(integer+real)+ ". Ahh, much better :)");

        JOptionPane.showMessageDialog(null,"This is the message");

    }
}
