public class Person {

    private String name;

    //Getter get the property
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    // prints a message using the person's name
    public void sayHello() {
        System.out.println("Hello! " + getName());
    }
    // Setter set the value of the object
    public Person(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        Person Ju = new Person("Ju");
        Ju.sayHello();

        Person person= new Person ("Ray");

        //Another person added the the list
        Person person1 = person;
        person1.sayHello();

        System.out.println(person);
        System.out.println(person1);

    }
}

