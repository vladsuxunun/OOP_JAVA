package TaskB;

public class LadaPriora implements Moveable {
	private static final String fullCarName="Lada Priora";
	private double engineVolume;
	private String transmission;
	private int cylinderAmount;
	
	public LadaPriora() {
		
	}
	
	public LadaPriora(double engineVolume, String transmission, int cylinderAmount) {
		this.engineVolume = engineVolume;
		this.transmission = transmission;
		this.cylinderAmount = cylinderAmount;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getCylinderAmount() {
		return cylinderAmount;
	}

	public void setCylinderAmount(int cylinderAmount) {
		this.cylinderAmount = cylinderAmount;
	}
	
	public void ignite() {
		System.out.println(fullCarName+" "+getEngineVolume()+" "+"litres "+"has been ignited!");
	}
	
	public void move() {
		System.out.println(fullCarName+" "+getEngineVolume()+" litres and "+getCylinderAmount()+" cylinders "+"with "+getTransmission()+" transmission "+"is moving!!!");
	}
}
