public class Time {
	private int hour; //Cant use private variables in the main class
	private int minute; //Public means other classes can use them 
	private int second;
	
	//Constructors 
	public time() {
		this(0,0,0);
	}
	
	public time(int h) {
			this(h,0,0);
	}
	
	public time(int h, int m) {
			this(h,m,0);
	}
	
	public void setTime(int h, int m, int s) {
		hour = ((h > 0 && h < 24) ? h : 0);
		minute = ((m > 0 && m < 60) ? m : 0);
		second = ((s > 0 && s < 60) ? s : 0);
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toNormal() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12:hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
	}
}