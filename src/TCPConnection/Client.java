package TCPConnection;

public class Client {
	public static void main(String[] args) {
		TCPConnection connection = new TCPConnection();
		
		connection.send();
		
		connection.open();
		connection.send();
		
		connection.close();
		connection.send();
		
		connection.close();
		connection.close();
		
		connection.send();
		
	}
}
