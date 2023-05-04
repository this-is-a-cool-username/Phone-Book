import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
    public static LinkedList<String> phonebook= new LinkedList<String>();
    public static int entryCount;
    public static int entryNum;
    public static void add(){
        System.out.println("add");
        Object.setEntry();
        entryCount++;
        entryNum++; //adds a number next to the contact information.
        if(entryNum < 2) {
            phonebook.add("Contact " + entryNum + ": " + Object.getEntry());
        }else {
            phonebook.add("\n" + "Contact " + entryNum + ": " + Object.getEntry());
        }
    }
    public static void delete(){
        print();
        Scanner scan = new Scanner(System.in);
        System.out.println("Select an entry number to delete");
        int entryNum = scan.nextInt();
        phonebook.remove(entryNum-1);
        entryCount--;
    }
    public static void modify(){
        System.out.println(phonebook);
        Object.changeEntry();
    }
    public static void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("To flip to a page in the phone book, type 'f', 'm' or 'l'");
        System.out.println("(f)irst, (m)iddle, or (l)ast");
        System.out.println("To find a specific contact press 's'");
        String where=scan.nextLine().toLowerCase();
        switch (where) {
            case "f": System.out.println(phonebook.getFirst());
            break;
            case "m": System.out.println(phonebook.get(entryCount/2));
            break;
            case "l": System.out.println(phonebook.getLast());
            break;
            case "s":
                System.out.println("please type the name, last name, number, etc. of the contact you wish to view: ");
                Scanner input = new Scanner(System.in);
                String search = input.next();
                for (String element : phonebook) {
                    if (element.contains(search)) {
                        System.out.println(element);
                    }
                }

            default: System.out.println("Invalid");
        }
    }

    public static void upload() throws IOException{
        Scanner input = new Scanner(System.in);
        String line;
        LinkedList<String> newPhoneBook = new LinkedList<String>();

        System.out.println("Enter the name of the Phone Book file you wish to import");
        System.out.println("*file must end in .txt extension*");
        String fileName = input.next();
        try {
            if (fileName.endsWith(".txt") && !fileName.isEmpty()) {
                BufferedReader bf = new BufferedReader(new FileReader(fileName));
                line = bf.readLine();
                while (line != null) {
                    newPhoneBook.add(line);
                    line = bf.readLine();
                }
                bf.close();
                System.out.println(newPhoneBook);
                phonebook = newPhoneBook;
            } else {
                System.out.println("please enter a file with a .txt extension");
            }
        }catch (Exception e){
            System.out.println("Please enter an existing file");
        }
    }

    public static void save() throws FileNotFoundException {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please type the name of the file you want to save");
       System.out.println("Make sure the name of the file ends in '.txt'");
       String newFile = scan.next();
        LinkedList<String> savedEdition = new LinkedList<String>(phonebook);

     if(newFile.endsWith(".txt")) {
         PrintStream fileWriter = new PrintStream(newFile);

         while(!savedEdition.isEmpty()){
            String addContent = savedEdition.pop();
            fileWriter.print(addContent);

         }
     } else{
         System.out.println("Please enter as a .txt file type");
     }

    }
    public static void print() {
        System.out.println(phonebook+"\n");
    }
    public static LinkedList<String> getPhonebook(){
        return phonebook;
    }
}
