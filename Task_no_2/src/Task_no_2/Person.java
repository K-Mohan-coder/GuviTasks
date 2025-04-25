package Task_no_2;

public class Person {
    String name = "";
    int age;

//   public  Person(String name, int age) {
//        this.name = name;
//        this.age = 18;
//    }
    
    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void details() {
        System.out.println("Name: " + name + "\n Age: " + age);
    }
}
