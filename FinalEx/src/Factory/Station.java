package Factory;

public abstract class Station {
	
	public Ticket orderTicket(Object Passenger) {
		Ticket ticket;
		
		ticket = createTicket(Passenger);
		
		ticket.release();
		
		return ticket;
	}
	
	protected abstract Ticket createTicket(Object Passenger);
	
}