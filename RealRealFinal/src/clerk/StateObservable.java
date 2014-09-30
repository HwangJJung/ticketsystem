package clerk;

import client.AbstractClient;

public interface StateObservable {

	public void notifyObservers();
	public void isCameCustomer(AbstractClient client);
	
}
