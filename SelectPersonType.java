package Amusement_Park_ticket;
import java.util.Scanner;
public class SelectPersonType {

	public int select_person_type() {
	int person_type;
	Scanner scanner = new Scanner(System.in);
	
	do{
		System.out.println("�������� �����ϼ���.");
		System.out.println("1.����");
		System.out.println("2.�����");
		System.out.println("3.����������");
		System.out.println("4.���ڳ�");
		System.out.println("5.�ӻ��");
		person_type = scanner.nextInt();
		
	 } while(person_type == 0||person_type > 5); //0�̰ų� 5�ʰ��� �ٽ� ���ư���.
	 scanner.close();
	 return person_type;
	 
	}
	
	
	
}
