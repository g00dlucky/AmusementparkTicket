package Amusement_Park_ticket;

import java.util.Scanner;

public class Calculator {
		Scanner scanner = new Scanner(System.in);

		
		//�̿��� 
		static final int adult_dayTime_price = 56000;
		static final int juv_dayTime_price = 47000;
		static final int child_dayTime_price = 44000;
		static final int senior_dayTime_price = 44000;
		static final int infant_dayTime_price = 0;

		static final int adult_nightTime_price = 46000;
		static final int juv_nightTime_price = 40000;
		static final int child_nightTime_price = 37000;
		static final int senior_nightTime_price = 37000;
		static final int infant_nightTime_price = 0;
		
		//������
		static final double able = 0.0;// float�̴� 0.0���� ǥ���س�����. 
		static final double disable = 0.4;
		static final double merit = 0.5;
		static final double multiChild = 0.2;
		static final double pregnant = 0.15;
		
		
		public static int calculate_dayTime_price(int age) {
			
		    if (age <= 2) {
		        return infant_dayTime_price;
		    } else if (age <= 12) {
		        return child_dayTime_price;
		    } else if (age <= 18) {
		        return juv_dayTime_price;
		    } else if (age <= 64) {
		        return adult_dayTime_price;
		    } else {
		        return senior_dayTime_price;
		    }
		}

		// �߰��ǿ� ���� ���� ��� �Լ�
		public static int calculate_nightTime_price(int age) {
			
		    if (age <= 2) {
		        return infant_nightTime_price;
		    } else if (age <= 12) {
		        return child_nightTime_price;
		    } else if (age <= 18) {
		        return juv_nightTime_price;
		    } else if (age <= 64) {
		        return adult_nightTime_price;
		    } else {
		        return senior_nightTime_price;
		    }
		}
		
			////����ڰ�
			static double calculate_Discount_Rate(int prefer) {	
			
			double discount_rate = 0;
			
			switch(prefer){
			
				case 1: 
					discount_rate = able ; // ���� 
					break;
				case 2: 
					discount_rate = disable; // ����� 
					break;
				case 3: 
					discount_rate = merit; // ����������  
					break;
				case 4: 
					discount_rate = multiChild; // ���ڳ� 
					break;
				case 5: 
					discount_rate = pregnant; // �ӻ�� 
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�");
					break;
				}	 
				return discount_rate;
			}	
		
		
		
	// Ƽ�ϰ��ݰ��
	public static int calc_ticket_price(int type, int age, int num, float discount_rate, int prefer) {
		int price = 0;
		
		if (type == 1)
			price = calculate_dayTime_price(age);// ���̰� ���Ǹ� ticket_type�� �����Ͽ� ����� ������ ����ϴ� �Լ�
		
		else if (type == 2)
			price = calculate_nightTime_price(age);
		
		price = (int) (price * (float) num * (1 - calculate_Discount_Rate(prefer)));
		//price_list[totalOrderCount] = price;
		return price;
	}



//	public static int cal_totalprice(int price, int quantity, float discount_rate, int person_type) {
//		int totalPrice = 0;
//		totalPrice = (int) (price * (float) quantity * (1 - calculate_Discount_Rate(person_type)));
//		
////		System.out.printf("����� �Ѿ��� %.0f ���Դϴ�.\n", totalPrice);
////		System.out.printf("�����մϴ�.\n");
//		
//		return totalPrice;
//	}
	
	

}

////// ��������
//public int select_order () {
//	int quantity = 0;
//		do {
//			System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
//			quantity = scanner.nextInt();
//		}
//		
//		while((quantity == 0)||(quantity > 10)); //������ 0�̳� 10���� ũ�� �ٽ� ���ư���. 
//		return quantity;
//		//quantity_list[totalOrderCount] = quantity;
//	}