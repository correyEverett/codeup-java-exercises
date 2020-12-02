public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Hello, Jupiter!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Spring and Autumn are the best seasons!";
        System.out.println(myString);

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

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);


    }

}

