package station;

import process.Station;
import client.AbstractClient;

public class SeoulStation extends Station{
	
	public SeoulStation() {
		this.name = "서울역";
	}
	
	public void add(AbstractClient abstractClient) {
		stationQueue.add(abstractClient);
		System.out.println(" 현재 클래스는 SeoulStation 으로 고객이 서울역에 들어왔습니다.");
	}
	

}
