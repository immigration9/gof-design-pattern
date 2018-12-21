package TCPConnection;

public class TCPListen extends TCPState {
	private static TCPState instance;
	
	private TCPListen() {}
	
	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPListen();
		}
		return instance;
	}

	@Override
	public void open(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPListen - You cannot open another connection");
	}

	@Override
	public void send(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPListen - Sending signal...");
		changeState(connection, TCPEstablished.getInstance());
	}

	@Override
	public void close(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPListen - Closing Connection");
		changeState(connection, TCPClosed.getInstance());
	}

}
