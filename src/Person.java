public class Person {
    private String name;
    Person(String personNames){
        name = personNames;
    }
    public static void main(String[] args) {
        Person person = new Person("KIKI");


        person.getName();
        person.sayHello();
        person.setName("KIWI");
        person.sayHello();



        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person2.name);
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

    //returns the person's name
    public String getName(){
        return name;
    }

    //changes the name property to the passed value
    public void setName(String name){
            this.name = name;
    }

    //prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello from " + name + "!");
    }
}
