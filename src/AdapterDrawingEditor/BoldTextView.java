package AdapterDrawingEditor;

public class BoldTextView implements TextView{	
	@Override
	public void getExtent(int width, int height) {
		System.out.println("Current extent: " + String.valueOf(width) + String.valueOf(height));
		
	}
	@Override
	public void getOrigin(int x, int y) {
		System.out.println("Current origin: " + String.valueOf(x) + String.valueOf(y));
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
