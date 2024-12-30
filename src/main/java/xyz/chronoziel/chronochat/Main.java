package xyz.chronoziel.chronochat;

import xyz.chronoziel.chronochat.user.User;

public class Main {

	public Main() throws Exception {

		SmackHandler connectionHandler = new SmackHandler(User.getTestUser());


//		Message message = connection.getStanzaFactory()
//				.buildMessageStanza()
//				.to("hydrogen@h2.gay")
//				.setBody("piss")
//				.build();
//
//		connection.sendStanza(message);

		connectionHandler.disconnect();

	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
