import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class AVPhoneBook {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean active= true;
        System.out.println("Welcome to the Phone Book program.");
        System.out.println("Press 'a' to add a contact");
        System.out.println("Press 'd' to delete a contact");
        System.out.println("Press 'm' to modify an existing contact");
        System.out.println("Press 'f' to find a specific contact");
        System.out.println("Press 's' to save current phone book to file");
        System.out.println("Press 'i' to import an existing calendar");
        System.out.println("Press 't' to exit the program");


        while (active == true) {
            System.out.println("Enter a command:\n(a)dd, (d)elete, (f)ind, (m)odify, (p)rint, (s)ave, (i)mport, or (t)erminate");
            String command = scan.nextLine().toLowerCase();
            switch (command) {
                case "a": Manager.add();
                break;
                case "d": Manager.delete();
                break;
                case "m": Manager.modify();
                break;
                case "f": Manager.search();
                break;
                case "i": Manager.upload();
                break;
                case "p": Manager.print();
                break;
                case "s": Manager.save();
                break;
                case "t": active = false;
                    System.out.println("Goodbye!");
                break;
                default: System.out.println("Invalid input");
            }
        }
    }
}