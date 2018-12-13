package AdapterDrawingEditor;

public class TextShapeWithView {
	public static void main(String[] args) {
		BoldTextView btv = new BoldTextView();
		
		TextShape ts = new TextShape(btv);
		
		ts.boundingBox();
		ts.createManipulator();
	}
}
