package ba.bitcamp.ZaidTask;

public class CellphoneAntenna {

	private String manufacturerName;
	private int currentSignal;
	private int bateryConsumption;

	public CellphoneAntenna(String manufacturerName, int bateryConsumption) {
		super();
		this.manufacturerName = manufacturerName;
		this.currentSignal = 4;
		this.bateryConsumption = bateryConsumption;

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
	 * @return the strength of the signal
	 */
	public int getSignalStrength() {
		return currentSignal;
	}

	/**
	 * a method that sets the strength of the signal
	 * 
	 * @param strength
	 *            new strength
	 */
	public void setSignalStrength(int strength) {
		currentSignal = strength;
		if (currentSignal < 0 || currentSignal > 4) {
			throw new IllegalArgumentException("Signal range is from 0 to 4");
		}

	}

	/**
	 * A method that tells us if we can make a call or send an SMS. If the
	 * signal strength is higher than the current signal the method returns
	 * false; If the first 3 letters of the transmission are not "CAL" or "SMS"
	 * the method returns false; if the 3 initial numbers are not "387" the
	 * method returns false; if the number is longer than 11 digits the method
	 * returns false; else return true;
	 * 
	 * @param signalStrength
	 *            the strength of the signal
	 * @param transsmision
	 *            a call or an SMS we want to transmit
	 * @return
	 */
	public boolean isSignalGood(int signalStrength, String transmission) {
		if (signalStrength > currentSignal) {
			return false;

		}
		if (!(transmission.substring(0, 3).equals("SMS"))
				&& !(transmission.substring(0, 3).equals("CAL"))) {
			return false;
		}
		if (!(transmission.substring(3, 6).equals("387"))) {
			return false;
		}
		if (transmission.length() < 14) {
			return false;
		} else {

		}
		return true;

	}

	@Override
	public String toString() {
		return "CellphoneAntenna   ManufacturerName: " + manufacturerName
				+ "; " + " CurrentSignal:" + currentSignal;
	}

}
