package Di;

public interface IWorker {
	public void work();

}
class Worker implements IWorker{
	public void work() {
		
	}
}
class SuperWorker implements IWorker{
	public void work() {
		
	}
}
class manager{
	IWorker worker;
	public void setWorker(IWorker w) {
		worker = w;
	}
	public void manage() {
		worker.work();
	}
	
}