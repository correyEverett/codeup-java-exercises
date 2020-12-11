import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];
        people[0] = new Person("Correy");
        people[1] = new Person("Jon");
        people[2] = new Person("Doe");

        for (Person individual : people) {
            System.out.println(individual.getName());
        }

    }









}
