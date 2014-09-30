package client;
import java.util.Comparator;


public class ClientComparator implements Comparator<Object> {
	
	// 고객을 시간 순으로 정렬하기 위해 구현했으나, Collection을 쓸 수가 없었습니다. 
	// 정의되지 않다는데, 좀 더 찾아보아야겠습니다. 

	public int compare(Client c1, Client c2) {
		
		if (c1.getArrivalTime() > c2.getArrivalTime()){
			return 1;
		}
		else if (c1.getArrivalTime() < c2.getArrivalTime()) {
			return 0;
		}
		else {
			return -1;
		}
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
