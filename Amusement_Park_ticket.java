package Amusement_Park_ticket;
import java.util.Scanner;

public class Amusement_Park_ticket {
	long inputNumber;
	int inputYear, inputMonth, inputDay;
	int age;
	int flag;
	int price;
	float totalprice;
	int quantity; 
	float discount_rate; //int�� �س��Ҿ���. 
	int forwardOrExit; 
	int index; 
	
	int[] ticket_type_list = new int[10];
	int[] age_list = new int[10];
	int[] quantity_list = new int [10]; 
	int[] discount_rate_list = new int [10];
	int[] price_list = new int [10];
	int totalOrderCount = 0;// �迭 ����, �ֹ����� �ʱ�ȭ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GlobalVariable gv = new GlobalVariable();
		SelectTicketType stp =  new SelectTicketType();
		SelectPersonType spt = new SelectPersonType();
		//AgeCalculator ac = new AgeCalculator();
		
		stp.select_Ticket_Type();
		spt.select_person_type();
		//ac.get_Age();
		
		
		
		
		
		
		
		
		
	}

}
