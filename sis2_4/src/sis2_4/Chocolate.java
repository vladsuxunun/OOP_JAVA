package sis2_4;


public class Chocolate implements Comparable<Chocolate> {
	private double weight;
	private String name;
	
	public Chocolate(String name, double weight) {
		this.weight = weight;
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Name: " + name + "\n"
				+ "Weight: " + weight;
	}

	@Override
	public int compareTo(Chocolate c) {
		if(c.getWeight() > getWeight()) {
			return 1;
		} else if(c.getWeight() < getWeight()){
			return -1;
		} else {
			return 0;
		}
	}
}