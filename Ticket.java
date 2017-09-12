public class Ticket{
	String day;
	String ticketType;
	int price;
	
	public Ticket(){
	
	}
	
	public Ticket(String inputDay){
		day = inputDay;
	}
	
	public Ticket(String inputDay, String ticketReq){
		day = inputDay;
		ticketType=ticketReq;
	}

	public void setDay(String inputDay){
		day=inputDay;
		if(inputDay.equals("Wednesday")){
		setPrice(price-2);
		}
	}
	
	public String getDay(){
		return day;
	}
	
	public void setPrice(int newPrice){
		price=newPrice;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setType(String newType){
		ticketType=newType;
	}
	
	public String getType(){
		return ticketType;
	}	
	


}