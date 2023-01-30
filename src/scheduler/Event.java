package scheduler;

public class Event {
	protected int hour;
	protected String description;

	Event(int hour, String description) {
		this.hour = hour;
		this.description = description;
	}

	public int getHour() {
		return hour;
	}

	public String getDescription() {
		return description;
	}

	public boolean compare(Event event) {
		if (event.getHour() == this.hour) {
			return true;
		}
		return false;
	}

	public boolean greaterThan(Event event) {
		if (this.hour > event.getHour()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.description + " At " + String.valueOf(this.hour) + " O' Clock";
	}
}
