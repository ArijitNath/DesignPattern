package designpattern.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Arijit", "Nath")
							.setAge("27")
							.setPhone("12345")
							.setAddress("Bangalore")
						.build();
		
		System.out.println(user);
	}
}
