package designpattern.behavioral.mediator;

public abstract class User {
	private ChatMediator chatMediator;
	private String name;
	
	public User(ChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
