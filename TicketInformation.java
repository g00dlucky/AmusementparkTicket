package Amusement_Park_ticket;

public class TicketInformation {
	
	private int age, num, price;
	private String input;
	String type;
	private String prefer;
	private float discount_rate;
	
	private String[] types = {"", "주간권","야간권"};
	private String[] prefers = {"", "없음", "장애인", "국가유공자", "다자녀", "임산부"};
			
	public TicketInformation(int type, int age, int num, int prefer, float discount_rate) {
		// TODO 자동 생성된 생성자 스텁
		this.type = types[type];
		this.age = age;
		this.num = num;
		this.prefer = prefers[prefer];
		this.discount_rate = discount_rate;
		price = Calculator.calc_ticket_price(type, age, num, discount_rate, prefer);
		
		TicketList.setList(this.type, this.age, this.num, this.prefer, price);
	}

}
