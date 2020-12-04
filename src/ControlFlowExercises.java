import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to?");
            int userNumber = scan.nextInt();
            System.out.println();
            System.out.println("Here is your table.");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userNumber; i++) {
                System.out.format("%-7d", i);
                System.out.print("|");
                System.out.format(" %-8d", i * i);
                System.out.print("|");
                System.out.format(" %-9d", i * i * i);
                System.out.println();
            }
            System.out.println("Would you like to enter another number?");
            String userResponse = scan.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        }while(userContinues);

    }

}































//WHILE LOOP
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("The current value of i is:" + i);
//            i++;
//        }
