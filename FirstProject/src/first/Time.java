package first;

import java.time.LocalTime;
import java.time.ZoneId;

public class Time {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now(ZoneId.of ("Europe/Paris"));
		
		System.out.println(time);
		//for(String a:ZoneId.getAvailableZoneIds()) {
			//System.out.println(a);
		}
		// TODO Auto-generated method stub

	}

//}
