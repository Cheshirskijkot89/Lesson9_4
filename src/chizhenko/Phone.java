package chizhenko;

public class Phone {

	private int number;

	public Phone(int number) {
		super();
		this.number = number;
	}

	public Phone() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void register(Network net) {
	
		net.setNumber(number);
		
	}
	
	public void call(Network net, int NumberTo) {
		
		if (NumberTo == number) {
			System.out.println("its your number");
			return;
		}
		
		if (net.numberExist(NumberTo)) {
			System.out.println("calling from " + number + " to " + NumberTo);
		} else {
			System.out.println("number is not exist");
		}
		
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + "]";
	}

}
