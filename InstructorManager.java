package javaWork;

public class InstructorManager extends UserManager {

	
	
	public void add(User user) {
		System.out.println(user.getFirstName() + "...E�itmen eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + "...E�itmen g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + "...E�itmen silindi.");

    }
}
