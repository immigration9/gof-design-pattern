package TCPConnection;

public class TCPEstablished extends TCPState {
	private static TCPState instance;
	
	private TCPEstablished() {}
	
	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPEstablished();
		}
		return instance;
	}

	@Override
	public void open(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPEstablished - You cannot open another connection");
	}

	@Override
	public void close(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPEstablished - Closing connection");
		changeState(connection, TCPListen.getInstance());
	}

	@Override
	public void send(TCPConnection connection) {
		// TODO Auto-generated method stub
		System.out.println("TCPEstablished - Successfully sent a message to another client");;
	}
	
	

}
