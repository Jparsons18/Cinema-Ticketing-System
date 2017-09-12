import java.util.*;
public class Order extends Ticket{
	List<Ticket> order=new ArrayList<Ticket>();
	int totalCost=0;

	public void addTicket(Ticket ticket){
		order.add(ticket);
		totalCost=totalCost+ticket.getPrice();
	}
	
	public void printOrder(){
		System.out.println("\nTickets to be purchased for "+order.get(0).getDay()+" are:");
		for(int i=0;i<order.size();i++){
			System.out.println(order.get(i).getType()+ " - \u00A3"+order.get(i).getPrice());
		}
		System.out.println("total cost: \u00A3"+totalCost);
	}
}