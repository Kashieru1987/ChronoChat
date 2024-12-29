package xyz.chronoziel.chronochat;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

import xyz.chronoziel.chronochat.user.User;

public class Main {

	public Main() throws Exception {

		final User user = new ConnectionHandler().getTestUser();

		AbstractXMPPConnection connection = new XMPPTCPConnection(user.getUsername(), user.getPassword(), user.getHost());
		connection.connect().login();

		Message message = connection.getStanzaFactory()
				.buildMessageStanza()
				.to("hydrogen@h2.gay")
				.setBody("piss")
				.build();

		connection.sendStanza(message);

		connection.disconnect();

	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
