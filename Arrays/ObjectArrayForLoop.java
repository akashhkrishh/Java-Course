class Student
{
	int rollno;
	String name;
	int marks;	
}

public class ObjectArrayForLoop{
	public static void main(String[] args) 
	{		
		Student students[]=new Student[3];
        Student s1=new Student();
		s1.rollno=1;
		s1.name="Aazim";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Antony";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Shijo";
		s3.marks=97;

		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(Student stud : students)
		{
			System.out.println(stud.rollno+" : "+stud.name+" : "+stud.marks);
		}
	}
}
