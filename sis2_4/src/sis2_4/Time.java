package sis2_4;



public class Time implements Comparable<Time>{
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	int hour;
	int minute;
	int second;
	
	public Time(int hour, int minute, int second) {
		if(hour > 24 || minute > 60 || second > 60) {
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
		} else {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		}
	}
	
	public void add(Time t2) {
		this.hour += t2.hour - 12;
		this.minute += t2.minute;
		this.second += t2.second;
	}
	
	public String toUniversal() {
		String timeStamp = this.hour + ":" + this.minute + ":" + this.second;
		
		return timeStamp;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toStandard() {
		
		String hourAP;
		
		if(this.hour >= 12) {
			this.hour -= 12;
			hourAP = this.hour + ":" + this.minute + ":" + this.second + " PM";
		}else {
			hourAP = this.hour + ":" + this.minute + ":" + this.second + " AM";
		}
		
		return hourAP;
	}

	@Override
	public int compareTo(Time t) {
		if(t.getHour() > getHour()) {
			return 1;
		} else if(t.getHour() < getHour()){
			return -1;
		} else {
			return 0;
		}
	}
	
}
