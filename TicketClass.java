package Amusement_Park_ticket;

public class TicketClass {
	
	//�̿��� 
		final int adult_dayTime_price = 56000;
		final int juv_dayTime_price = 47000;
		final int child_dayTime_price = 44000;
		final int senior_dayTime_price = 44000;
		final int infant_dayTime_price = 0;

		final int adult_nightTime_price = 46000;
		final int juv_nightTime_price = 40000;
		final int child_nightTime_price = 37000;
		final int senior_nightTime_price = 37000;
		final int infant_nightTime_price = 0;
		
		//������
		final double able = 0.0;// float�̴� 0.0���� ǥ���س�����. 
		final double disable = 0.4;
		final double merit = 0.5;
		final double multiChild = 0.2;
		final double pregnant = 0.15;
		
		
	//2_�ְ��ǿ� ���� ���� ��� �Լ�

	public int calculate_dayTime_price(int age) {
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
	public int calculate_nightTime_price(int age) {
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
		double calculate_Discount_Rate(int person_type) {	
		double discount_rate = 0;

		switch(person_type){
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
	 
}
