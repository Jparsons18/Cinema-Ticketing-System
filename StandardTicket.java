public class StandardTicket extends Ticket{
	private int price = 8;
	private String type = "Standard";
	
	public StandardTicket(){
		setPrice(price);
		setType(type);
	}
	
	public StandardTicket(String inputDay){
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