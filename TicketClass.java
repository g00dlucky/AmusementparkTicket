package Amusement_Park_ticket;

public class TicketClass {
	
	//이용요금 
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
		
		//할인율
		final double able = 0.0;// float이니 0.0으로 표기해놔야함. 
		final double disable = 0.4;
		final double merit = 0.5;
		final double multiChild = 0.2;
		final double pregnant = 0.15;
		
		
	//2_주간권에 대한 가격 계산 함수

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

	// 야간권에 대한 가격 계산 함수
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
	
		////우대자격
		double calculate_Discount_Rate(int person_type) {	
		double discount_rate = 0;

		switch(person_type){
			case 1: 
				discount_rate = able ; // 없음 
				break;
			case 2: 
				discount_rate = disable; // 장애인 
				break;
			case 3: 
				discount_rate = merit; // 국가유공자  
				break;
			case 4: 
				discount_rate = multiChild; // 다자녀 
				break;
			case 5: 
				discount_rate = pregnant; // 임산부 
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}	 
			return discount_rate;
		}	
	 
}
