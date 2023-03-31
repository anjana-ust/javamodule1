package subjectimpl;

import java.util.Iterator;
import java.util.List;

import observer.consumers.TvChannels;
import observer.iface.Wetherobserver;
import observer.subject.Observable;


public abstract class WhetherStation extends Observable {
	private List<Wetherobserver> weatherObservers;
	private int temparature;
	

	public void addObserver(TvChannels observer1) {
		weatherObservers.add(observer1);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Wetherobserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
		
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void doNotify() {
		// TODO Auto-generated method stub
		Iterator<Wetherobserver> iterator=weatherObservers.iterator();
		while(iterator.hasNext()) {
			Wetherobserver weatherObserver=iterator.next();
			weatherObserver.doUpdate(temparature);
		
	}
	

}

}
