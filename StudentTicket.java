public class StudentTicket extends Ticket{
	private int price = 6;
	private String type = "Student";
	
	public StudentTicket(){
		setPrice(price);
		setType(type);
	}
	
	public StudentTicket(String inputDay){
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