package observer.subject;
import observer.iface.*;
public abstract class Observable {
	public abstract void addObserver(Wetherobserver weatherObserver);
	public abstract void removeObserver(Wetherobserver weatherObserver);
	public abstract void doNotify(); // update









}
