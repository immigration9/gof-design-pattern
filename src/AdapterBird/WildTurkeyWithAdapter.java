package AdapterBird;

public class WildTurkeyWithAdapter {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("1. WildTurkey says");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("2. TurkeyAdapter(Duck) says");
		testDuck(turkeyAdapter);
		
		System.out.println("3. Mallard Duck says");
		testDuck(duck);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
