package scheduler;

public enum Days {
 MONDAY(),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY(),SUNDAY();
 
 private final LinkedList<Event> events= new LinkedList<Event>(); 
 public LinkedList<Event> getEvents() {
	 return this.events;
 }
 public void addEvents(Event event) {
	  this.events.add(event);
 }
 public void removeEvents(Event event) {
	 if(this.events.size()!= 0) {
	 Node<Event> head = this.events.getHead();
	 int position = 0;
	 boolean foundValue = false;
	 while(position<this.events.size() && !foundValue) {
		 if(head.getValue().compare(event)) { 
			 foundValue = true;
			 break;
		 }
		 else {
			 head=head.getNext();
			 position++;
		 }
	 }
	 this.events.remove(position);
	 System.out.println("Event Removed From Schedule.");
	 }
	 else {
		 System.out.println("No Events Found Scheduled For This Day.");
	 }
}
}
