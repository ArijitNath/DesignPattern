package designpattern.behavioral.mediator;

public class Mediator {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Arijit");
		User user2 = new UserImpl(mediator, "Ritchie");
		User user3 = new UserImpl(mediator, "Ari");
		User user4 = new UserImpl(mediator, "Nath");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");

	}

}
