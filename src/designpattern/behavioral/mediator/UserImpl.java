package designpattern.behavioral.mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.getName() + " Sending message " + message);		
		this.getChatMediator().sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.getName() + " Receiving message " + message);		
	}
	
}
