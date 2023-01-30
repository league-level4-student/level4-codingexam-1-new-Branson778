package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event. *DONE*
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.*DONE*
 *   
 * - Each day's events should be sorted by chronological order. SORTING METHOD *DONE*
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.*DONE*
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.*CURRENT*
 */
public class Scheduler {
    protected static Scanner scan = new Scanner(System.in);
    Days[] week = Days.values();
    public static void main(String[] args) {
   recursiveAction();
    }
    protected static void recursiveAction() {
    	System.out.println("What Would You Like To Do? \n1. Add Event \n2. Remove Event \n3. View Events \nEnter The Number Of The Desired Option");
    	int select = scan.nextInt();
    	switch(select) {
    	case 0:
    		System.out.println("ERROR");
    		recursiveAction();
    		break;
    		//ADDITION
    	case 1:
    		System.out.println("What Time Would You Like To Add The Event?\nEnter A Number 1-24");
    		int hour = scan.nextInt();
    		if(hour>0 && hour<25) {
    		}
    		else {
    			System.out.println("Error Entering Time\nPlease Try Adding Event Again");
    			recursiveAction();
    			break;
    		}
    		System.out.println("How Would You Describe The Event?");
    		String description = scan.next();
    		System.out.println("What Day Would The Event Be On?\nEnter A Number 1-7");
    		int day = scan.nextInt();
    		if(day>0 && day<8) {	
    			switch(day) {
    			case 0:
    				System.out.println("ErrOR");
    				break;
    			case 1:
    				try {
    					Node<Event> head = Days.MONDAY.getEvents().getHead();
    					for (int i = 0; i < Days.MONDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.MONDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.MONDAY);
    				recursiveAction();
    				break;
    			case 2:
    				try {
    					Node<Event> head = Days.TUESDAY.getEvents().getHead();
    					for (int i = 0; i < Days.TUESDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.TUESDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.TUESDAY);
    				recursiveAction();
    				break;
    			case 3:
    				try {
    					Node<Event> head = Days.WEDNESDAY.getEvents().getHead();
    					for (int i = 0; i < Days.WEDNESDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.WEDNESDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.WEDNESDAY);
    				recursiveAction();
    				break;
    			case 4:
    				try {
    					Node<Event> head = Days.THURSDAY.getEvents().getHead();
    					for (int i = 0; i < Days.THURSDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.THURSDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.THURSDAY);
    				recursiveAction();
    				break;
    			case 5:
    				try {
    					Node<Event> head = Days.FRIDAY.getEvents().getHead();
    					for (int i = 0; i < Days.FRIDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.FRIDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.FRIDAY);
    				recursiveAction();
    				break;
    			case 6:
    				try {
    					Node<Event> head = Days.SATURDAY.getEvents().getHead();
    					for (int i = 0; i < Days.SATURDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.SATURDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.SATURDAY);
    				recursiveAction();
    				break;
    			case 7:
    				try {
    					Node<Event> head = Days.SUNDAY.getEvents().getHead();
    					for (int i = 0; i < Days.SUNDAY.getEvents().size(); i++) {
							if(head.getValue().compare(new Event(hour,""))) {
								throw(new SchedulingConflictException());
							}
						}
    				Days.SUNDAY.addEvents(new Event(hour,description));
    				} catch(SchedulingConflictException e) {
    					System.out.println("Event Already At This Time\nTry Adding An Event At Another Time");
    				}
    				sorting(Days.SUNDAY);
    				recursiveAction();
    				break;
    			}
    		}
    		else {
    			System.out.println("Error Entering Day\nPlease Try Adding Event Again");
    			recursiveAction();
    			break;
    		}
    		recursiveAction();
    		break;
    		//------------------------------------------------------------------------------------------------------------------------
    		//REMOVAL
    	case 2:
    		System.out.println("What Time Is The Event At?\nEnter A Number 1-24");
    		int hourr = scan.nextInt();
    		if(hourr>0 && hourr<25) {
    		}
    		else {
    			System.out.println("Error Entering Time\nPlease Try Removing Event Again");
    			recursiveAction();
    			break;
    		}
    		System.out.println("What Day Is The Event On?\nEnter A Number 1-7");
    		int dayr = scan.nextInt();
    		Days dayenum2;
    		if(dayr>0 && dayr<8) {
    			dayenum2=Days.MONDAY; //TO INITIALIZE TO STOP ERRORS
    			switch(dayr) {
    			case 0:
    				System.out.println("ErrOR");
    				break;
    			case 1:
    				dayenum2 = Days.MONDAY;
    				break;
    			case 2:
    				dayenum2 = Days.TUESDAY;
    				break;
    			case 3:
    				dayenum2 = Days.WEDNESDAY;
    				break;
    			case 4:
    				dayenum2 = Days.THURSDAY;
    				break;
    			case 5:
    				dayenum2 = Days.FRIDAY;
    				break;
    			case 6:
    				dayenum2 = Days.SATURDAY;
    				break;
    			case 7:
    				dayenum2 = Days.SUNDAY;
    				break;
    			}
    			Node<Event> head = dayenum2.getEvents().getHead();
        		for (int i = 0; i < dayenum2.getEvents().size(); i++) {
    				if(head.getValue().compare(new Event(hourr,""))) {
    					dayenum2.getEvents().remove(i);
    				}
    			}
    		}
    		else {
    			System.out.println("Error Entering Day\nPlease Try Removing Event Again");
    			recursiveAction();
    			break;
    		}
recursiveAction();
    		break;
    		//------------------------------------------------------------------------------------------------------------------------
    		//PRINT(BROKEN)
    	case 3:
    		System.out.println("What Day Would You Like To View?\nEnter A Number 1-7");
    		int dayv = scan.nextInt();
    		if(dayv>0 && dayv<8) {	
    			switch(dayv) {
    			case 0:
    				System.out.println("ErrOR");
    				recursiveAction();
    				break;
    			case 1:
    				Days.MONDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 2:
    				Days.TUESDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 3:
    				Days.WEDNESDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 4:
    				Days.THURSDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 5:
    				Days.FRIDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 6:
    				Days.SATURDAY.getEvents().print();
    				recursiveAction();
    				break;
    			case 7:
    				Days.SUNDAY.getEvents().print();
    				recursiveAction();
    				break;
    			}
    		}
    		else {
    			System.out.println("Error Entering Day\nPlease Try Viewing Event Again");
    			recursiveAction();
    			break;
    		}
    		break;
    	default:
    		break;
    	}
    }
    protected static void sorting(Days day) {
    	Node<Event> head = day.getEvents().getHead();
    	if(day.getEvents().size()>1) {
    	for (int i = 0; i < day.getEvents().size(); i++) {
    		try {
    		if(head.getValue().greaterThan(head.getNext().getValue())) {
				Event temp = head.getNext().getValue();
				head.getNext().setValue(head.getValue()); 
				head.setValue(temp);
			}
			head = head.getNext();
    		}
    		catch(NullPointerException e) {
    			break;
    		}
		}
    	}
    }
}
