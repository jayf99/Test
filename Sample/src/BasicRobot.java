
public class BasicRobot {
	
	private String name;
	
	/**
	 * 	Default Constructor
	 * test
	 */
	public BasicRobot () {
		
	}
	
	
	public BasicRobot (String name) {
		this.name = name;
	}

	/**
	 * Get the name
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 	Set the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
