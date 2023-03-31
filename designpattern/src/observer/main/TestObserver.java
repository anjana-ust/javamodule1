package observer.main;

import observer.consumers.Newspapper;
import observer.consumers.TvChannels;
import subjectimpl.WhetherStation;

public class TestObserver {
	public static void main(String[] args) {
		
	
	TvChannels observer1 = new TvChannels(); // subscriber
	Newspapper observer2 = new Newspapper(); // subscriber
	TvChannels observer3 = new TvChannels();

	WhetherStation weatherStation = new WhetherStation(33);
	weatherStation.addObserver(observer1);
	weatherStation.addObserver(observer2);
	weatherStation.addObserver(observer3);

	weatherStation.setTemparature(30);

	// weatherStation.removeObserver(observer1);
}
}