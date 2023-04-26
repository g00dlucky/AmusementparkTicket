package Amusement_Park_ticket;

import java.util.Scanner;

public class Calculator {
		Scanner scanner = new Scanner(System.in);

		
		//이용요금 
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
		
		//할인율
		static final double able = 0.0;// float이니 0.0으로 표기해놔야함. 
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

		// 야간권에 대한 가격 계산 함수
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
		
			////우대자격
			static double calculate_Discount_Rate(int prefer) {	
			
			double discount_rate = 0;
			
			switch(prefer){
			
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
		
		
		
	// 티켓가격계산
	public static int calc_ticket_price(int type, int age, int num, float discount_rate, int prefer) {
		int price = 0;
		
		if (type == 1)
			price = calculate_dayTime_price(age);// 나이가 계산되면 ticket_type을 구분하여 입장권 가격을 계산하는 함수
		
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
////		System.out.printf("입장료 총액은 %.0f 원입니다.\n", totalPrice);
////		System.out.printf("감사합니다.\n");
//		
//		return totalPrice;
//	}
	
	

}

////// 수량선택
//public int select_order () {
//	int quantity = 0;
//		do {
//			System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
//			quantity = scanner.nextInt();
//		}
//		
//		while((quantity == 0)||(quantity > 10)); //수량이 0이나 10보다 크면 다시 돌아간다. 
//		return quantity;
//		//quantity_list[totalOrderCount] = quantity;
//	}