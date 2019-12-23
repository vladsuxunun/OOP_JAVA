package isis1;

public class Temperature {
	private double temperature = 0;
	private char scale;

	public Temperature(char scale) {
		this.temperature = 0;
		this.scale = scale;
	}

	public Temperature(double temperature) {
		this.temperature = temperature;
		this.scale = 'C';
	}

	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	public Temperature() {
		this.temperature = 0;
		this.scale = 'C';
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void setScale(char scale) {
		this.scale = scale;
	}

	public void setTempAndScale(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	public double getTemperature() {
		return temperature;
	}

	public char getScale() {
		return scale;
	}

	public double toC() {
		double temperatureC;
		temperatureC = 5 * (getTemperature() - 32) / 9;
		return temperatureC;
	}

	public double toF() {
		double temperatureF;
		temperatureF = 9 * (getTemperature() / 5) + 32;
		return temperatureF;
	}

	public String toString() {
		return getTemperature() + "°" + getScale();
	}
}
