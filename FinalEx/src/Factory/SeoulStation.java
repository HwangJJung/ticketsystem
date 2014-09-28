package Factory;

public class SeoulStation extends Station{

	@Override
	protected Ticket createTicket(Object Passenger) {
		// TODO Auto-generated method stub
		Ticket ticket = null;
		TicketComponentFactory componentFactory = 
				new SeoulTicketComponentFactory();
		
		ticket = new Ticket(componentFactory);
		ticket.setName("Seoul Ticket");
		
		return ticket;
		
	}

}