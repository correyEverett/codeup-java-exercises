import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

//        System.out.println("Hello, World!");
//        System.out.println("Hello, Jupiter!");
//
//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "Spring and Autumn are the best seasons!";
//        System.out.println(myString);

//        myString = 'A'; compiler error: incompatible types: char cannot be converted to java.lang.String

//        myString = 3.14159; compiler error: incompatible types: double cannot be converted to java.lang.String

//        long myNumber;
//        System.out.println(myNumber); compiler error: variable myNumber might not have been initialized

//        myNumber = 3.14; compiler error: incompatible types: possible lossy conversion from double to long

//        myNumber = 123L;

//        myNumber = 123;

//        float myNumber = 3.14; compiler error: incompatible types: possible lossy conversion from double to float
//            POSSIBLE FIXES BELOW:
//            double myNumber = 3.14;
//            float myNumber = Float.parseFloat("3.14");

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "What happens with a variable named 'class'?";
//        not a statement
//        ';' expected
//        <identifier> expected
//        reached end of file while parsing

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner userInput = new Scanner(System.in);
////        PROMPT USER TO ENTER A INTEGER
//        System.out.println("Enter a whole number");
////        STORE THE VALUE ENTERED BY USER IN A INT VARIABLE
//        int wholeNumber = userInput.nextInt();
////        DISPLAY USER INPUT
//        System.out.println(wholeNumber);

//        System.out.println("Enter three words of your choosing");
//        String word1 = userInput.next();
//        String word2 = userInput.next();
//        String word3 = userInput.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Enter a sentence");
//        String usersSentence = userInput.nextLine();
//
//        System.out.println(usersSentence);

        System.out.println("Please provide the length and width of the codeup classroom.");
        String userInputLength = userInput.nextLine();
        String userInputWidth = userInput.nextLine();

        int length = Integer.parseInt(userInputLength);
        int width = Integer.parseInt(userInputWidth);
        int area = length * width;
        int perimeter = (length + width) * 2;

        System.out.printf("The area of the codeup room is %d%n", area);
        System.out.printf("The perimeter of the codeup room is %d%n", perimeter);




    }

}

