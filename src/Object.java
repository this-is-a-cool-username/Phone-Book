import java.util.InputMismatchException;
import java.util.Scanner;
public class Object {
    private static String entry;
    public static void setEntry() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        String cs = ", ";
        System.out.println("Last name?");
        String lastName = scan.nextLine();
        System.out.println("First name?");
        String firstName = scan.nextLine();
        System.out.println("Address?");
        String address = scan.nextLine();
        System.out.println("City name?");
        String city = scan.nextLine();
        System.out.println("Phone number?");
        Integer phoneNum = scan.nextInt();
        System.out.println("ZIP code?");
        int zip = scan.nextInt();
        entry = "\n" + lastName + cs + firstName + cs + address + cs + city + cs + zip + cs + phoneNum + cs + "Entry num: ";
    }
    public static String getEntry() {
        return entry;
    }
    public static void changeEntry() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select an entry number to modify:");
        int input = scan.nextInt();
        System.out.println("Select an element to modify.\n(l)ast name, (f)irst name, (a)ddress, (c)ity, (z)ip code, or (p)hone number:");
        String command = scan.nextLine();
        switch (command) {
            case "l": ;
            case "f": ;
            case "a": ;
            case "c": ;
            case "z": ;
            case "p": ;
            default : System.out.println("Invalid input");
        }
    }
}