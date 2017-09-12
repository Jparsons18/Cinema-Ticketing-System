public class ChildTicket extends Ticket{
	private int price = 4;
	private String type = "Child";

	public ChildTicket(){
		setPrice(price);
		setType(type);
	}
	
	public ChildTicket(String inputDay){
		setDay(inputDay);
		if(getDay().equals("Wednesday")){
			setPrice(price-2);
		}
		else{
			setPrice(price);
		}
		setType(type);
	}
}