package Amusement_Park_ticket;

public class TicketInformation {
	
	private int age, num, price;
	private String input;
	String type;
	private String prefer;
	private float discount_rate;
	
	private String[] types = {"", "�ְ���","�߰���"};
	private String[] prefers = {"", "����", "�����", "����������", "���ڳ�", "�ӻ��"};
			
	public TicketInformation(int type, int age, int num, int prefer, float discount_rate) {
		// TODO �ڵ� ������ ������ ����
		this.type = types[type];
		this.age = age;
		this.num = num;
		this.prefer = prefers[prefer];
		this.discount_rate = discount_rate;
		price = Calculator.calc_ticket_price(type, age, num, discount_rate, prefer);
		
		TicketList.setList(this.type, this.age, this.num, this.prefer, price);
	}

}
