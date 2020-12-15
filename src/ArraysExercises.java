import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
        Person[] newPerson = new Person[3];
        newPerson[0] = new Person("Correy");
        newPerson[1] = new Person("Jon");
        newPerson[2] = new Person("Doe");

        for (Person individual : newPerson) {
            System.out.println(individual.getName());
        }

//        public static Person[] addPerson(Person[] newPerson, Person person) {
//
//            return;
//        }


    }











}
