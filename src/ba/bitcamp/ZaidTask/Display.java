package ba.bitcamp.ZaidTask;

public class Display {

	private String manufacturerName;
	private int displayStrength;
	private boolean isOn;
	private int bateryConsumption;

	public Display(String manufacturerName, int bateryConsumption) {
		super();
		this.manufacturerName = manufacturerName;
		this.displayStrength = 100;
		this.isOn = isOn;
		this.bateryConsumption = bateryConsumption;
	}

	/**
	 * a method that turns the display on
	 */
	public void turnDisplayOn() {
		isOn = true;
	}

	/**
	 * a method that turns the display off
	 */
	public void turnDisplayOff() {
		isOn = false;
	}

	/**
	 * A method that increases the strength of display by 10 values
	 */
	public void increaseDisplayStrength(int increase) {
		if (isOn = true) {
			increase *= 10;
			displayStrength += increase;
		} else if (displayStrength > 100) {
			displayStrength = 100;
		} else {
			System.out.println("The display is turned off");
		}

	}

	/**
	 * A method that decreases the strength of the display by 10 values
	 * 
	 * @param decrease
	 */
	public void decreaseDisplayStrength(int decrease) {
		if (isOn = true) {
			decrease *= 10;
			displayStrength -= decrease;
		} else if (displayStrength <= 0) {
			isOn = false;
		} else {
			System.out.println("The display is already turned off");
		}
	}

	@Override
	public String toString() {
		if (isOn == true) {
			return "Display Manufacturer Name: " + manufacturerName + ";"
					+ " DisplayStrength: " + displayStrength;
		}
		return "Display ManufacturerName: " + manufacturerName + ";"
				+ "Display Strength: " + "The display is off";
	}

}
