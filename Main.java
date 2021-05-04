package javaWork;

public class Main {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ezgi");
		student1.setLastName("Do�an");
		student1.setEmail("ezgidgn@gamil.com");
		student1.setPassword("123456");
		
        
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("G�khan");
		student2.setLastName("Do�an");
		student2.setEmail("gokhandgn@gamil.com");
		student2.setPassword("98765");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setInstructorId(34);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Deemiro�");
		instructor1.setEmail("......@gamil.com");
		instructor1.setPassword("987");
		
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setInstructorId(30);
		instructor2.setFirstName("Murat");
		instructor2.setLastName("Co�kun");
		instructor2.setEmail("......@gamil.com");
		instructor2.setPassword("456");
		
		User[] users = {student1, student2, instructor1, instructor2};
		System.out.println("---------Kullan�c�lar--------");
		
		for(User user : users) {
			
			System.out.println("kullan�c� ad�:"+user.getFirstName()+" "+ user.getLastName());
		}
		
		Instructor[] instructors = {instructor1,instructor2};
		System.out.println("--------E�itmenler---------");
		
		for(Instructor instructor : instructors) {
			System.out.println("E�itmen ad� ve soyad� :"+instructor.getFirstName()+" "+ instructor.getLastName());
		}
		
		Student[] students = {student1,student2};
		
		for (Student student : students) {
			System.out.println("��renci ad� ve soyad� :" + student.getFirstName() + "///" + "ilerleme Durumu :" + student.getPercent());
		}
		
		
		
        System.out.println("------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		
        
		System.out.println("------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);		
		userManager.add(instructor1);
		
		
        System.out.println("------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
 
	}

}
