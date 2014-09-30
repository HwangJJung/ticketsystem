import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Client {
	
	ArrayList<Client> quackers = new ArrayList<Client>();


	public void add(Client quacker) {
		quackers.add(quacker);
	}
	
	
	@Override
	public void quack() {
		Iterator<Client> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Client quacker = (Client)iterator.next();
			quacker.quack();
			
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		
		Iterator<Client> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Client quacker = (Client)iterator.next();
			quacker.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {	}

}
