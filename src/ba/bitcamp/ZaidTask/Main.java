package ba.bitcamp.ZaidTask;

public class Main {

	public static void main(String[] args) {
		
		CellphoneSpeaker cs = new CellphoneSpeaker("BeatsAudio", 100, 10);
		/**
		 * testing methods
		 */
		System.out.println(cs);
		cs.enableSpeakers();
		System.out.println(cs);
		cs.increaseVolume(4);
		System.out.println(cs);
		cs.lowerVolume(2);
		System.out.println(cs);
		cs.lowerVolume(2);
		System.out.println(cs);
		
		CellphoneBatery cb = new CellphoneBatery("htc", 2);
		/**
		 * Testing methods
		 */
		System.out.println(cb);
		cb.chargeBatery(20);
		System.out.println(cb);
		cb.bateryConsumption(30);
		System.out.println(cb);
		System.out.println();
		
		CellphoneAntenna ca = new CellphoneAntenna("htc", 4);
		System.out.println();
		System.out.println(ca);
		ca.setSignalStrength(3);
		System.out.println(ca);
		System.out.println(ca.isSignalGood(4, "CAL38761328902"));
		System.out.println(ca.isSignalGood(3, "CAM38761318902"));
		System.out.println(ca.isSignalGood(3, "SMS3876131990"));
		System.out.println(ca.isSignalGood(3, "CAL38161319903"));
		System.out.println(ca.isSignalGood(2, "CAL38761321456"));
		System.out.println();
		
		
		Display d = new Display("htc", 100);
		System.out.println();
		System.out.println(d);
		d.turnDisplayOff();
		System.out.println(d);
		d.turnDisplayOn();
		System.out.println(d);
		d.decreaseDisplayStrength(4);
		System.out.println(d);
		d.increaseDisplayStrength(2);
		System.out.println(d);
		

	}

}
