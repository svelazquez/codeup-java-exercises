package contacts;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import util.Input;


public class ContactsApplication {
    public static final Path FILEPATH = Paths.get("contacts.txt");

    public static void main(String[] args) {

        Boolean answer;
        do{
            Input input = new Input();
            System.out.println("1. View contacts.\n"
                    + "2. Add a new contact.\n"
                    + "3. Search a contact by name.\n"
                    + "4. Delete an existing contact.\n"
                    + "5. Exit.\n"
                    + "Enter an option (1, 2, 3, 4 or 5):");
            int choice = input.getInt();
            switch(choice){
                case 1: //view contacts;
                    viewContacts();
                    System.out.println("\n");
                    break;
                case 2: // add a contact;
                    break;
                case 3: //search contact;
                    break;
                case 4: //delete contact;
                    break;
                default: //exit program;
                    break;
            }
            answer = input.yesNo();
        } while (answer);



    }

    public static void viewContacts(){
        try{

            List<String> contactList = Files.readAllLines(FILEPATH);

            for (int i = 0; i < contactList.size(); i += 1) {
                System.out.println((i + 1) + ": " + contactList.get(i));
            }



        } catch (IOException e){
            System.out.println("die");
        }

    }

}
