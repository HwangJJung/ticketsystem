package exception;

public class SameStationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 12L;
	public SameStationException() {
		super();
	}
	
	public SameStationException(String message) {
		super(message);
	}
}
