package xyz.chronoziel.chronochat;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jxmpp.stringprep.XmppStringprepException;

import xyz.chronoziel.chronochat.user.User;

public class SmackHandler {

	private AbstractXMPPConnection connection;
	private User user;

	public SmackHandler(final User user) {
		this.user = user;
		this.connection = this.initConnection(user);

		this.connectAndLogin();
	}

	public AbstractXMPPConnection getConnection() {
		return this.connection;
	}

	private void connectAndLogin() {
		try {
			this.connection.connect().login();
		} catch (Exception e) {
			throw new Error(e);
		}
	}

	public void disconnect() {
		this.connection.disconnect();
	}

	private AbstractXMPPConnection initConnection(final User user)  {

		final String username = user.getUsername();
		final String password = user.getPassword();
		final String host = user.getHost();

		try {
			return new XMPPTCPConnection(username, password, host);
		} catch (XmppStringprepException e) {
			e.printStackTrace();
			throw new Error(e);
		}
	}

	public class message {

		

	}

}
