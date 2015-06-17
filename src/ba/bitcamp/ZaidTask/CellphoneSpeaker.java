package ba.bitcamp.ZaidTask;

public class CellphoneSpeaker {

	private String manufacturerName;
	private int price;
	private boolean isOn;
	private int currentVolume;
	private int bateryUsage;

	/**
	 * The constructor initializes the name of the manufacturer, the price of
	 * the speakers and the usage of the batery. The speakers are turned off and
	 * the volume is 0.
	 * 
	 * @param manufactorName
	 *            the name of the manufacturer of the spekaers
	 * @param price
	 *            the price of the speakers
	 * @param bateryUsage
	 *            the usage of the batery
	 */
	public CellphoneSpeaker(String manufactorName, int price, int bateryUsage) {
		super();
		this.manufacturerName = manufactorName;
		this.price = price;
		this.isOn = false;
		this.currentVolume = 0;
		this.bateryUsage = bateryUsage;
	}

	/**
	 * 
	 * @return the name of the manufacturer
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * 
	 * @return the price of the speakers
	 */
	public int getSpeakersPrice() {
		return price;
	}

	/**
	 * 
	 * @return the usage of batery
	 */
	public int getBateryUsage() {
		return bateryUsage;
	}

	/**
	 * 
	 * @return if the speakers are on or of.
	 */
	public boolean areSpeakersOn() {
		return isOn = false;
	}

	/**
	 * 
	 * @return the current volume of the speaker
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}

	/**
	 * this method turns the speaker on
	 */
	public void enableSpeakers() {
		isOn = true;

	}

	/**
	 * this method turns the speaker off
	 */
	public void disableSpeaker() {
		isOn = false;
	}

	/**
	 * A method that lowers the volume. 10 values each time. Throws exception if
	 * the volume gets lower than 0 or higher than 100
	 */
	public void lowerVolume(int lower) {
		lower *= 10;
		currentVolume -= lower;
		if (currentVolume < 0) {
			throw new IllegalArgumentException("Volume can't be lower than 0!");
		} else if (currentVolume == 0) {
			isOn = false;
		}
	}

	/**
	 * This method increases the volume. 10 values each time called. Throws
	 * exception if the volume gets higher than 100
	 */
	public void increaseVolume(int increase) {
		increase *= 10;
		currentVolume += increase;
		if (currentVolume > 100) {
			throw new IllegalArgumentException(
					"Volume can't be higher than 100!");
		}
	}

	/**
	 * toString method that returns the name of the manufacturer and volume of
	 * the speaker if the speaker is on, if the speaker is off returns only the
	 * manufacturer name
	 */
	@Override
	public String toString() {
		if (isOn == true) {
			return "CellphoneSpeaker ManufacturerName: " + manufacturerName
					+ ";" + " Volume: " + currentVolume;
		}

		return "CellphoneSpeaker ManufacuturerName: " + manufacturerName + ";"
				+ " The speaker is off";

	}

}
