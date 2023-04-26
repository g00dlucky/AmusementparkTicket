package Amusement_Park_ticket;

import java.time.LocalDateTime;
import java.util.Scanner;

public class InputClass {

	static Scanner scanner = new Scanner(System.in);
	
	public static int select_Ticket_Type() {
		int ticket_type = 0;

		int i = 0;

		int[] ticket_type_list = new int[10];

		do {

			System.out.println("������ �����ϼ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");

			ticket_type = scanner.nextInt();
			ticket_type_list[i] = ticket_type;
			i++;

		} while ((ticket_type <= 0) || (ticket_type > 2));
		return ticket_type;
	}
	
	public static int select_person_type() {

		int person_type = 0;
		do {
			System.out.println("�������� �����ϼ���.");
			System.out.println("1.����");
			System.out.println("2.�����");
			System.out.println("3.����������");
			System.out.println("4.���ڳ�");
			System.out.println("5.�ӻ��");
			person_type = scanner.nextInt();

		} while (person_type == 0 || person_type > 5); // 0�̰ų� 5�ʰ��� �ٽ� ���ư���.
		return person_type;
	}

	
	
	public static int cal_Age() {
		int age = 0;
		LocalDateTime now = LocalDateTime.now();
		
		while (true) {

			System.out.println("13�ڸ� ���ڸ� �Է��ϼ���: ");
			String input = scanner.nextLine();
			//inputArray.add(input);
			
					
			if (input.toString().length() != 13) { // �Է¹��� ���ڿ��� 13�ڸ��� �ƴ� ���
				System.out.println("13�ڸ� ���ڸ� �Է����ּ���.");
				continue; // ó������ �ǵ��ư���
			}
			
			long inputNumber = Long.parseLong(input); // ���ڿ��� long long �������� ��ȯ
			
			// ����ð� ���ϱ�
			int todayYear = now.getYear();
			int todayMonth = now.getMonthValue();
			int todayDay = now.getDayOfMonth();

			// �Է¹��� 13�ڸ� ���ڿ��� �����, �ڵ��ȣ ����
			int inputYear = (int) (inputNumber / 100000000000L);
			inputNumber -= inputYear * 100000000000L;
			int inputMonth = (int) (inputNumber / 1000000000L);
			inputNumber -= (inputMonth * 1000000000L);
			int inputDay = (int) (inputNumber / 10000000);
			inputNumber -= (inputDay * 10000000);
			int flag = (int) (inputNumber / 1000000);

			// �����з� �ڵ��ȣ�� 1�Ǵ� 2�� �� inputYear�� 1990���ϰ� �� �ܿ� 2000���ϱ�.
			switch (flag) {
			case 1:
			case 2:
				if (inputYear > 9)
					inputYear += 1900;
				break;// 00������ �ڵ��ȣ 1�Ǵ� 2�� �Է��ϴ� ���,
						// 1900��� ������ �ν��ϴ� ���� �����ϱ� ����
			default:
				if (inputYear >= 10 && inputYear <= 23)
					inputYear += 2000;
				break;// �����з� �ڵ��ȣ�� 3,4�� �� inputYear�� 10�̻��̾��
						// 2000�� �����ش�. 23�� ���� ������ �ٲ�����Ѵ�.
			}

			if (inputYear <= 9)
				inputYear += 2000; // 09������� ������ 2000�� �����ش�.

			// ����2 inputMonth�� inputDay�� ������ ���� �Ѵ��� Ȯ��
			if ((inputMonth > 12 || inputMonth <= 0) || (inputDay > 31)) {
				System.out.println("������� ��¥�� Ȯ���ϼ���.\n");
				continue;
			}

			switch (flag) {// ���������ڵ�
			case 1:
			case 2:
				if (inputYear >= 1900 && inputYear <= 1999) {
					System.out.println("��Ȯ�� �Է��Դϴ�");
					break;
				} else if (inputYear >= 2000)
					System.out.println("�߸��� �Է��Դϴ�. ���������ڵ尡 ������ �°� �ԷµǾ����� Ȯ���ϼ���");
				continue;
			case 3:
			case 4:
				if (inputYear >= 2000 && inputYear <= 2999) {
					System.out.println("��Ȯ�� �Է��Դϴ�");
					break;
				} else if (inputYear < 2000)
					System.out.println("�߸��� �Է��Դϴ�. ���������ڵ尡 ������ �°� �ԷµǾ����� Ȯ���ϼ���");
				continue;
			default:
				System.out.println("�߸��� �Է��Դϴ�. ���������ڵ尡 ������ �°� �ԷµǾ����� Ȯ���ϼ���");
				continue;
			}

			// ���� ����
			age = todayYear - inputYear;
			// age_list[totalOrderCount] = age;

			// ������ ���
			if (inputMonth > todayMonth)
				age--;// ������ ������ ����
			else if (inputMonth == todayMonth && inputDay > todayDay)
				age--;// ������ ������ ����

			return age;
			
		}
		
		
	}
	
	
	////��������
		public static int order_quantity () {
			int quantity = 0;
				do {
					System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
					quantity = scanner.nextInt();
				}
				
				while((quantity == 0)||(quantity > 10)); //������ 0�̳� 10���� ũ�� �ٽ� ���ư���. 
				return quantity;
				//quantity_list[totalOrderCount] = quantity;
			}
	
	
	
		public static void input() { // �� �Լ����� static���� �ٲ��ִ°�?
				
				int type; // ����
				int age; // ����
				int num; // Ƽ�� ����
				int prefer; // ������
				float discount_rate;
				
				type = select_Ticket_Type();
				prefer = select_person_type();
				age = cal_Age(); // 
				num = order_quantity ();
				discount_rate = (float) Calculator.calculate_Discount_Rate(prefer);
				
				TicketInformation t = new TicketInformation(type, age, num, prefer, discount_rate); // �̰� �� ���ذǰ�?
			}

//		public static void input() { // �� �Լ����� static���� �ٲ��ִ°�?
//			
//			int type; // ����
//			int age; // ����
//			int num; // Ƽ�� ����
//			int prefer; // ������
//	
//			type = select_person_type();
//	
//			age = cal_Age(); // 
//			
//			num = inputNum();
//	
//			prefer = inputPrefer();
//			
//			TicketInfo t = new TicketInfo(type, age, num, prefer);
//		}
	
//	public int input_age() {
//		int age = 0;
//		
//		while (true) {
//
//			//LocalDateTime now = LocalDateTime.now();
//
//			System.out.println("13�ڸ� ���ڸ� �Է��ϼ���: ");
//			String input = scanner.nextLine();
//			//inputArray.add(input);
//			
//					
//			if (input.toString().length() != 13) { // �Է¹��� ���ڿ��� 13�ڸ��� �ƴ� ���
//				System.out.println("13�ڸ� ���ڸ� �Է����ּ���.");
//				continue; // ó������ �ǵ��ư���
//			} else break;
//			
//			
//			
//			
//		}
//	}
	
	
	
	
	
}
