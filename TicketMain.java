import java.util.Scanner;

public class TicketMain{

	public static void main(String []args) {
		Scanner reader = new Scanner(System.in);
		Ticket ticket = new Ticket();
		Ticket newTicket = new Ticket();
		Order order = new Order();
		String day;

		boolean validDay=false;
		System.out.println("Which day are you purchasing tickets for? (E.g. \"Monday\")");
		String inputDay;
		do{//checks input day is valid
			inputDay = reader.nextLine();
			if(inputDay.equals("Monday")||inputDay.equals("Tuesday")||inputDay.equals("Wednesday")||inputDay.equals("Thursday")||inputDay.equals("Friday")||inputDay.equals("Saturday")||inputDay.equals("Sunday")){
				validDay=true;
			}
			else{
			System.out.println("Please enter a valid day.");
			}
		}while(validDay==false);
		day = inputDay;
		
		System.out.println("How many tickets would you like to buy? (Maximum of 10.)");
		int numTickets = 0;
		boolean ticketsValid=false;
		boolean isInt=false;
		//check requested number of tickets is valid
		do{
				
				isInt=reader.hasNextInt();
				String number = reader.nextLine();
				if(isInt==true){
				numTickets = Integer.valueOf(number);
				}
				else{
				System.out.println("Please enter a number.");
				}
				if(numTickets<11&&numTickets>=0){
					ticketsValid=true;
				}
				else{
				System.out.println("You are only allowed a maximum of 10 tickets. Please enter a valid number");
				}
		}while(ticketsValid==false||isInt==false);
		
		
		
		for(int currentTicketTotal=0;currentTicketTotal<numTickets;){
			boolean isValid=false;
			System.out.println("What type of ticket would you like?");
			do{//checks requested ticket type is valid
				String inputType= reader.nextLine();
				if(inputType.equals("Standard")){
					newTicket = new StandardTicket(day);
					isValid=true;
				}
				else if(inputType.equals("OAP")){
					newTicket = new OAPTicket(day);
					isValid=true;
				}
				else if(inputType.equals("Student")){
					newTicket = new StudentTicket(day);
					isValid=true;
				}
				else if(inputType.equals("Child")){
					newTicket = new ChildTicket(day);
					isValid=true;
				}
				else{
				System.out.println("Please enter a valid ticket type");
				}
			}while(isValid==false);
			System.out.println("How many "+newTicket.getType()+" tickets would you like?");
			
			boolean maxTickets=false;
			boolean isInteger;
			int ticketsLeft=numTickets-currentTicketTotal;
			int x=0;
			do{//makes sure customer doesn't purchase too many tickets
			
				isInteger=reader.hasNextInt();
				String number = reader.nextLine();
				if(isInteger==true){
					x = Integer.valueOf(number);
					if(x>ticketsLeft||x<0){
						System.out.println("You have "+ticketsLeft+" tickets left. Please enter a valid number");
					}
					if(x<=ticketsLeft&&x>=0){
					break;
					}
				}
				else{
				System.out.println("Please enter a number.");
				}
				
			}while(maxTickets==false||isInteger==false);
			
			for(int j=0;j<x;j++){
				order.addTicket(newTicket);
			}
			currentTicketTotal=currentTicketTotal+x;
		}
		order.printOrder();
	}
}