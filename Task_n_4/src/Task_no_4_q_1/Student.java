package Task_no_4_q_1;


public class Student{
	
	int rollno;
	String name;
	int age;
	String course;

	public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException {
//		super();
		
		if(!name.matches("[a-zA-Z\\s]+")) {
			throw new NameNotValidException("Invalid Name : "+name+"\nName Can Only Contains Alphabets");
		}
		
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Invalid Age : "+age+"\nAge is not between 15 and 21");
        }
        
        
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
		
	}

}
