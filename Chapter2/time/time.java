class time{
	public static void main(String[] args){
		int hour = 18;
		int minute = 25;
		int second = 30;
		int passSecond = (hour * 3200) + (minute*60);
		int remainingSecond = 86400 - passSecond;
		int remainDayPerc = (hour * 100)/24;
		System.out.println("Number of seconds since midnight is " + passSecond);
		System.out.println("Number of seconds remaining in day is " + remainingSecond);
		System.out.println("Percentage of day passed is " + remainDayPerc + "%");
		
	
	
	
	
	}
}