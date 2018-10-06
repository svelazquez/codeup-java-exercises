package contacts;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import util.Input;



public class ContactsApplication {
    public static final Path FILEPATH = Paths.get("src/contacts","contacts.txt");

    public static void viewContacts(){
        try{

            List<String> contactList = Files.readAllLines(FILEPATH);

            for (int i = 0; i < contactList.size(); i += 1) {
                System.out.println((i + 1) + ": " + contactList.get(i));
            }



        } catch (IOException e){
            System.out.println("die view contacts");
        }

    }

    public static void addContact(String contact){
        try{
            Files.write(
                    FILEPATH,
                    Arrays.asList(contact),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e ){
            System.out.println("die add contact");
        }
    }

    public static void searchContact(String name){
        try {
            List<String> contactList = Files.readAllLines(FILEPATH);

            for (String contact : contactList) {
                if (contact.contains(name)) {
                    System.out.println(contact);
                }
            }

        } catch (IOException e ){
            System.out.println("die search contact");
        }
    }

    public static void deleteContact(String name){
        try{
            List<String> contactList = Files.readAllLines(FILEPATH);
            List<String> tempList = new ArrayList<>();

            for (String contact : contactList) {
                if (!contact.contains(name)) {
                    tempList.add(contact);
                }
            }
            Files.write(FILEPATH, tempList);

        } catch (IOException e){
            System.out.println("die delete contact");
        }
    }

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
                    System.out.println("Enter contact in format: Name 800-444-4444");
                    String contact = input.getString();
                    addContact(contact);
                    break;
                case 3: //search contact;
                    System.out.println("Enter name to search");
                    contact = input.getString();
                    searchContact(contact);
                    break;
                case 4: //delete contact;
                    System.out.println("Enter name to delete");
                    contact = input.getString();
                    deleteContact(contact);
                    break;
                case 5: //exit program;
                    answer = false;
                    break;
            }
            answer = input.yesNo();
        } while (answer);
        System.out.println("Alright, goodbye");
    }

}
