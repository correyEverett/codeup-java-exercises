import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Talk to Bob");
        String talkingToBob = scan.nextLine();
        boolean userContinue = true;

        String question = "Sure";
        String exclamation = "Whoa, chill out!";
        String none = "Fine, Be that way!";
        String other = "Whatever";

        do {
            if (talkingToBob.endsWith("?")) {
                System.out.println(question);
            } else if (talkingToBob.endsWith("!")) {
                System.out.println(exclamation);
            } else if (talkingToBob.endsWith("")) {
                System.out.println(none);
                scan.nextLine();
            } else {
                System.out.println(other);
            }
            System.out.println("Do you want to keep talking to bob?");
            String userResponse = scan.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                userContinue = false;
            }
        }while(userContinue);


    }
}
