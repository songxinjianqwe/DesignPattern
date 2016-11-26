package observer.sample1;

public class WakeUpEvent {
	private long time;
	private String loc;
	private Observable o;
	public WakeUpEvent(long time, String loc, Observable o) {
		super();
		this.time = time;
		this.loc = loc;
		this.o = o;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Observable getO() {
		return o;
	}
	public void setO(Observable o) {
		this.o = o;
	}
	
}
