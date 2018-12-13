package AdapterDrawingEditor;

public class TextShape implements Shape{
	TextView textView;
	
	public TextShape(TextView textView) {
		this.textView = textView;
	}
	
	@Override
	public void boundingBox() {
		System.out.println("Called boundingBox");
		textView.getExtent(10, 10);
	}
	@Override
	public void createManipulator() {
		System.out.println("Created Manipulator");	
		textView.getOrigin(5, 5);
	}
}
