package command;

import java.util.LinkedList;
import java.util.Queue;

import Factory.SeoulStation;
import Factory.Station;
import Factory.Ticket;


public class TIKKKECCTTTEST {
	public static void main(String[] args) {
		
		Station seoulstation = new SeoulStation();
		Object i = null;
		seoulstation.orderTicket(i);
		TicketBox ticketbox = new TicketBox();
		Ticket ticket = new Ticket(null);
		TicketReleaseCommand ticketRelease = new TicketReleaseCommand(ticket);
		
		ticketbox.setCommand(ticketRelease);
		ticketbox.HaveClient();
		
		Queue<Command> CommandQueue = new LinkedList<Command>();
		
		CommandQueue.add(ticketRelease);
		CommandQueue.add(ticketRelease);
		CommandQueue.add(ticketRelease);
		CommandQueue.add(ticketRelease);
		CommandQueue.add(ticketRelease);
		
		
		
		
		
	}

}
