import java.util.ArrayList;
import java.util.Iterator;

// 많은 수정바람.
public class Flock implements Releaseable {
	
	ArrayList<Releaseable> clients = new ArrayList<Releaseable>();


	public void add(Releaseable client) {
		clients.add(client);
	}
	
	
	@Override
	public void release() {
		Iterator<Releaseable> iterator = clients.iterator();
		while (iterator.hasNext()) {
			Releaseable client = (Releaseable)iterator.next();
			client.release();
			
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		
		Iterator<Releaseable> iterator = clients.iterator();
		while (iterator.hasNext()) {
			Releaseable quacker = (Releaseable)iterator.next();
			quacker.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {	}

}