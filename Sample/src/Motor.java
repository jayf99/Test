//This is the Motor part of the code! 
public class Motor {
	
	private double maxSpeed;
	private double maxVoltage;

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getMaxVoltage() {
		return maxVoltage;
	}

	public void setMaxVoltage(double maxVoltage) {
		this.maxVoltage = maxVoltage;
	}
	
	public String toString() {
		String ret = "Max Speed: " + maxSpeed + "\n";
		ret = ret + "Max Voltage: " + maxVoltage + "\n";
		return ret;
	}

}
