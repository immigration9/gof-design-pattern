package TCPConnection;

public abstract class TCPState {
	public void changeState(TCPConnection connection, TCPState state) {
		connection.changeState(state);
	}
	
	public void open(TCPConnection connection) {}
	public void close(TCPConnection connection) {}
	public void send(TCPConnection connection) {}
	
}
