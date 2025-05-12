package Task_no_2;

public class Person {
    private String name;
    private Integer age;

   public  Person(String name) {
       this.name = name;
       this.age = 18;
   }
    
    public  Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // public Person(){

    // }

    public void details() {
        System.out.println("Name: " + name + "\n Age: " + age);
    }
}
