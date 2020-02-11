package designpattern.creational.builder;

public class User {
	private final String firstName;
	private final String lastName;
	private final String age;
	private final String phone;
	private final String address;
	
	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.age = userBuilder.age;
		this.phone = userBuilder.phone;
		this.address = userBuilder.address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserBuilder {
		private String firstName;
		private String lastName;
		private String age;
		private String phone;
		private String address;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder setAge(String age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}		
	}
}
