package javaWork;

public class InstructorManager extends UserManager {

	
	
	public void add(User user) {
		System.out.println(user.getFirstName() + "...Eðitmen eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + "...Eðitmen güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + "...Eðitmen silindi.");

    }
}
