package designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> allUsers;
	
	public ChatMediatorImpl() {
		allUsers = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) {
		allUsers.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User users : allUsers) {
			if( users != user)
				users.receive(message);
		}
	}
}
