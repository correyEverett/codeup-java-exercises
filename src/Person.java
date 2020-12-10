public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello there %s\n",  getName());
    }

    //CONSTRUCTOR
    public Person(String name) {
        setName(name);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Correy");
        p1.sayHello();

    }

    Person person1 = new Person("John");
    Person person2 = new Person("John");
    System.out.println(person1.getName().equals(person2.getName()));
    System.out.println(person1 == person2);


}
