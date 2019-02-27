package chizhenko;

import java.util.ArrayList;

public class Network {

	private ArrayList<Integer> numbers = new ArrayList<>();
	private String name;

	public Network(String name) {
		super();
		this.name = name;
	}

	public Network() {
		super();
	}

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumber(Integer nubmer) {
		numbers.add(nubmer);
	}
	
	public boolean numberExist(Integer nubmer) {
		return numbers.contains(nubmer);
	}

	@Override
	public String toString() {
		return "Network [name=" + name + "]";
	}
	
	

}
