package client;

import org.apache.commons.lang3.time.StopWatch;

public abstract class AbstractClient implements haveStopWatch {

	String startStation;
	String arrivalStation;
	String name;
	int ticketingTime;
	
	int arrivalTime;
	StopWatch stopWatch;
	
	long realEnqueueTime =0;
	long realTicketingTime =0;
	long waitTime = 0;
    long realTicketTingTime = 0;
	
	public String getStartStation() {
		return startStation;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}
	
	public String getName() {
		return name;
	}
	
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	@Override
	public void timerStart() {
		stopWatch.start();
	}

	public long getRealEnqueueTime() {
		return realEnqueueTime;
	}
	
	public void RecordRealEnqueueTime() {
		stopWatch.split();
		this.realEnqueueTime = stopWatch.getSplitTime();
	}
	public long getWaitTime() {
		return waitTime;
	}
	public void RecordWaitTime() {
		stopWatch.split();
		this.waitTime = stopWatch.getSplitTime() - this.realEnqueueTime;
	}

	public long getRealTicketingTime() {
		return realTicketingTime;
	}

	public void RecordRealTicketingTime() {
		stopWatch.split();
		this.realTicketTingTime = stopWatch.getSplitTime() - this.waitTime;
	}
	
	public int getTicketingTime() {
		return ticketingTime;
	}

	public void print() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "AbstractClient [startStation=" + startStation
				+ ", arrivalStation=" + arrivalStation + ", name=" + name
				+ ", ticketingTime=" + ticketingTime + ", arrivalTime="
				+ arrivalTime + ", realEnqueueTime=" + realEnqueueTime
				+ ", realTicketingTime=" + realTicketingTime + ", waitTime="
				+ waitTime + "]";
	}

	
	
	
	
}
