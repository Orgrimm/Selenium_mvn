import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
	
	LocalTime time1 = LocalTime.of(6, 15);
	
	LocalTime time2 = LocalTime.of(6, 15, 30);
	
	LocalTime time3 = LocalTime.of(6, 15, 30, 500);
	
	System.out.println(time1);
	System.out.println(time2);
	System.out.println(time3);
		

	}

}
