package TCPConnection;

public class TCPConnection {
	private TCPState state;
	
	public TCPConnection() {
		this.state = TCPClosed.getInstance();
	}

	public void changeState(TCPState state) {
		// TODO Auto-generated method stub
		System.out.println("TCP Connection - State changed to: " 
						+ state.getClass().getSimpleName());
		this.state = state;
	}
	
	public void send() {
		System.out.println("TCP Connection - Sending");
		state.send(this);
	}

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("TCP Connection - Opening");
		state.open(this);
	}
	
	public void close() {
		System.out.println("TCP Connection - Closing");
		state.close(this);
	}
}
