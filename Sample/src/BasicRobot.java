
public class BasicRobot {
	
	private String name;
	
	/**
	 * 	Default Constructor
	 */
	public BasicRobot () {
		
	}
	
	/**
	 * Constructor with name
	 * @param name
	 */
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
