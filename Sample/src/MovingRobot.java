
import java.util.ArrayList;
import java.util.List;

public class MovingRobot extends BasicRobot implements Shooter {
	
	private int numWheels;
	//private List motors = new ArrayList();
	private List<Motor> motors = new ArrayList<Motor>();
	
	public static double speed = 10;
	
	public MovingRobot () {
		super();
	}
	
	public MovingRobot (String name) {
		super(name);
	}
	
	public void shoot() {
		System.out.println("Shoot!");
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public void setName(String name) {
		name = "Moving " + name;
		super.setName(name);
	}

	public List<Motor> getMotors() {
		return motors;
	}

	public void setMotors(List<Motor> motors) {
		this.motors = motors;
	}
	
	public void addMotor(Motor motor) {
		motors.add(motor);
	}
	
	public void clearMotors() {
		motors.clear();
	}
	
}
