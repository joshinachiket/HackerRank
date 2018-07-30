public class Birthday {
	
	public int year;
	public int month;
	public int day;
	
	public int hr;
	public int min;
	public int sec;
	
	Birthday (String date) {
		
		String [] dates = date.split("-");
		year = Integer.parseInt(dates[0]);
		month = Integer.parseInt(dates[1]);
		day = Integer.parseInt(dates[2].substring(0,2));
		
		String time = dates[2].substring(3,dates[2].length()-1);
		
		String [] times = time.split(":");
		
		hr = Integer.parseInt(times[0]);
		min = Integer.parseInt(times[1]);
		sec = Integer.parseInt(times[2]);
		
		System.out.println("year: " + year + " month: " + month + " day: " + day);
		System.out.println("hour: " + hr + " minute: " + min + " day: " + sec);
		
	}
	
}
