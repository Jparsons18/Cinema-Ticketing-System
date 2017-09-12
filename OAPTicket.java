public class OAPTicket extends Ticket{
	private int price = 6;
	private String type = "OAP";
	
	public OAPTicket(){
		setPrice(price);
		setType(type);
	}
	
	public OAPTicket(String inputDay){
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