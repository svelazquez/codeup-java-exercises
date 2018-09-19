import java.util.*;
public class Bob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bob approaches you. \nHe says nothing, " +
                "but stands silently and appears to be waiting for you to say something");
        String input = s.nextLine().trim();

        if(input.endsWith("?")){
            System.out.println("Bob sighs and says \"Sure..\". You wonder if " +
                    "you've done something wrong");
        } else if(input.equals("")){
            System.out.println("Bob pouts and yells out \"Fine. Be that way!\".\n" +
                    "Bob is too tsundere for you. You back away slowly.");
        }else if (inputUppercase(input)){
            System.out.println("Bob flinches and squeaks out \"Whoa, chill out!\".\n" +
                    "You weren't even that mad...");
        }  else {
            System.out.println("Bob rolls his eyes. \"Whatever\", he says.\n Out of view," +
                    " your hand clenches into a fist");
        }
    }

    public static boolean inputUppercase(String s){
        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
