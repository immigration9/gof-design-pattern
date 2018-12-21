package TCPConnection;

public class TCPClosed extends TCPState {
	private static TCPState instance;
	
	private TCPClosed() {}
	
	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPClosed();
		}
		return instance;
	}

	@Override
	public void send(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPClosed - You cannot send when the connection is closed");
	}

	@Override
	public void open(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPClosed - Opening Connection");
		changeState(connection, TCPListen.getInstance());
	}
	
	
	
	
}
