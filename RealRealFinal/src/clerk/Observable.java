package clerk;

import client.AbstractClient;

public class Observable implements StateObservable{

	Observer observer = new BoxChecker();
	TicketBox ticketBox;
	
	public Observable(TicketBox ticketBox) {
		this.ticketBox = ticketBox;
	}
	
	
	@Override
	public void notifyObservers() {
		observer.update(ticketBox);
	}

	@Override
	public void isCameCustomer(AbstractClient client) {
		System.out.println("오지마");
	}
}