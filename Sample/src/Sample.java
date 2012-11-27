import java.util.List;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Speed: " + MovingRobot.speed);
		MovingRobot mr = new MovingRobot();
		mr.setName("Jay");
		System.out.println("Name: " + mr.getName());
		Shooter shooter = new MovingRobot();
		shooter.shoot();
		Motor m = new Motor();
		m.setMaxSpeed(6);
		m.setMaxVoltage(12);
		mr.addMotor(m);
		Motor m2 = new Motor();
		m2.setMaxSpeed(7);
		m2.setMaxVoltage(12);
		mr.addMotor(m2);
		//List motors = mr.getMotors();
		//for (int i = 0; i < motors.size(); i++) {
		//	System.out.println("Motor: " + (Motor) motors.get(i));
		//}
		List<Motor> motors = mr.getMotors();
		for (Motor nextMotor : motors) {
			System.out.println("Motor: " + nextMotor);
		}
		
	}

}
