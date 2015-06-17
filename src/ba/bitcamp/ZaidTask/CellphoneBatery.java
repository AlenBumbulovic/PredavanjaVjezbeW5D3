package ba.bitcamp.ZaidTask;

public class CellphoneBatery {

	private String manufacturerName;
	private int bateryPercent;
	private int chargingSpeed;

	public CellphoneBatery(String manufacturerName, int chargingSpeed) {
		super();
		this.manufacturerName = manufacturerName;
		this.bateryPercent = 50;
		this.chargingSpeed = chargingSpeed;
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
	 * @return the percent of batery
	 */
	public int getBateryPercent() {
		return bateryPercent;
	}

	/**
	 * A method that charge batery (percent per minutes)
	 * 
	 * @param minutes
	 *            time that cellphone is charging throws exception if the
	 *            currentBatery goes over 100
	 */
	public void chargeBatery(int minutes) {
		bateryPercent += (minutes * chargingSpeed);
		if (bateryPercent > 100) {
			bateryPercent = 100;
			throw new IllegalArgumentException("The batery is fully charged");
		}
	}

	/**
	 * a method that consumes the batery
	 * 
	 * @param consume
	 *            the value that tells us how much batery was consumed
	 */
	public void bateryConsumption(int consume) {
		bateryPercent -= consume;
		if (bateryPercent < 0) {
			throw new IllegalArgumentException("The cellphone turned off");
		}
	}

	@Override
	public String toString() {
		return "CellphoneBatery  ManufacturerName: " + manufacturerName + ";"
				+ " BateryPercent:  " + bateryPercent + " %";
	}

}
