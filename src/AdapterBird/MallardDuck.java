package AdapterBird;

public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("quack quack");
	}
	
	@Override
	public void fly() {
		System.out.println("flying flying");
	}
}
