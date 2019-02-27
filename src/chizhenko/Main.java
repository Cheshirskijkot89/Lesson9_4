package chizhenko;

public class Main {

	public static void main(String[] args) {

		Network life = new Network("lifecell");
		
		Phone ph1 = new Phone(1234567);
		ph1.register(life);
		
		Phone ph2 = new Phone(9876543);
		ph2.register(life);
		
		ph1.call(life, 9876543);
		ph1.call(life, 1234567);
		ph1.call(life, 1111111);
		

	}

}
