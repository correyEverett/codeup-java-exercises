public class ControlFlowExercises {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

            if(divisibleBy3 && divisibleBy5) {
            System.out.println("FizzBuzz");
            } else if (divisibleBy5) {
                System.out.println("Buzz");
            } else if (divisibleBy3) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}































//WHILE LOOP
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("The current value of i is:" + i);
//            i++;
//        }
