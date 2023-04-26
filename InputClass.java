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

			System.out.println("권종을 선택하세요.");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");

			ticket_type = scanner.nextInt();
			ticket_type_list[i] = ticket_type;
			i++;

		} while ((ticket_type <= 0) || (ticket_type > 2));
		return ticket_type;
	}
	
	public static int select_person_type() {

		int person_type = 0;
		do {
			System.out.println("우대사항을 선택하세요.");
			System.out.println("1.없음");
			System.out.println("2.장애인");
			System.out.println("3.국가유공자");
			System.out.println("4.다자녀");
			System.out.println("5.임산부");
			person_type = scanner.nextInt();

		} while (person_type == 0 || person_type > 5); // 0이거나 5초과면 다시 돌아간다.
		return person_type;
	}

	
	
	public static int cal_Age() {
		int age = 0;
		LocalDateTime now = LocalDateTime.now();
		
		while (true) {

			System.out.println("13자리 숫자를 입력하세요: ");
			String input = scanner.nextLine();
			//inputArray.add(input);
			
					
			if (input.toString().length() != 13) { // 입력받은 문자열이 13자리가 아닌 경우
				System.out.println("13자리 숫자를 입력해주세요.");
				continue; // 처음으로 되돌아가기
			}
			
			long inputNumber = Long.parseLong(input); // 문자열을 long long 형식으로 변환
			
			// 현재시간 구하기
			int todayYear = now.getYear();
			int todayMonth = now.getMonthValue();
			int todayDay = now.getDayOfMonth();

			// 입력받은 13자리 숫자에서 년월일, 코드번호 추출
			int inputYear = (int) (inputNumber / 100000000000L);
			inputNumber -= inputYear * 100000000000L;
			int inputMonth = (int) (inputNumber / 1000000000L);
			inputNumber -= (inputMonth * 1000000000L);
			int inputDay = (int) (inputNumber / 10000000);
			inputNumber -= (inputDay * 10000000);
			int flag = (int) (inputNumber / 1000000);

			// 성별분류 코드번호가 1또는 2일 때 inputYear에 1990더하고 그 외엔 2000더하기.
			switch (flag) {
			case 1:
			case 2:
				if (inputYear > 9)
					inputYear += 1900;
				break;// 00년대생이 코드번호 1또는 2를 입력하는 경우,
						// 1900년대 생으로 인식하는 것을 방지하기 위해
			default:
				if (inputYear >= 10 && inputYear <= 23)
					inputYear += 2000;
				break;// 성별분류 코드번호가 3,4일 때 inputYear가 10이상이어야
						// 2000을 더해준다. 23은 올해 연도로 바꿔줘야한다.
			}

			if (inputYear <= 9)
				inputYear += 2000; // 09년생보다 작으면 2000을 더해준다.

			// 조건2 inputMonth와 inputDay가 정해진 수를 넘는지 확인
			if ((inputMonth > 12 || inputMonth <= 0) || (inputDay > 31)) {
				System.out.println("생년월일 날짜를 확인하세요.\n");
				continue;
			}

			switch (flag) {// 성별구분코드
			case 1:
			case 2:
				if (inputYear >= 1900 && inputYear <= 1999) {
					System.out.println("정확한 입력입니다");
					break;
				} else if (inputYear >= 2000)
					System.out.println("잘못된 입력입니다. 성별구분코드가 연도에 맞게 입력되었는지 확인하세요");
				continue;
			case 3:
			case 4:
				if (inputYear >= 2000 && inputYear <= 2999) {
					System.out.println("정확한 입력입니다");
					break;
				} else if (inputYear < 2000)
					System.out.println("잘못된 입력입니다. 성별구분코드가 연도에 맞게 입력되었는지 확인하세요");
				continue;
			default:
				System.out.println("잘못된 입력입니다. 성별구분코드가 연도에 맞게 입력되었는지 확인하세요");
				continue;
			}

			// 나이 추출
			age = todayYear - inputYear;
			// age_list[totalOrderCount] = age;

			// 만나이 계산
			if (inputMonth > todayMonth)
				age--;// 생일이 지나지 않음
			else if (inputMonth == todayMonth && inputDay > todayDay)
				age--;// 생일이 지나지 않음

			return age;
			
		}
		
		
	}
	
	
	////수량선택
		public static int order_quantity () {
			int quantity = 0;
				do {
					System.out.println("몇개를 주문하시겠습니까? (최대 10개)");
					quantity = scanner.nextInt();
				}
				
				while((quantity == 0)||(quantity > 10)); //수량이 0이나 10보다 크면 다시 돌아간다. 
				return quantity;
				//quantity_list[totalOrderCount] = quantity;
			}
	
	
	
		public static void input() { // 왜 함수들을 static으로 바꿔주는가?
				
				int type; // 권종
				int age; // 나이
				int num; // 티켓 개수
				int prefer; // 우대사항
				float discount_rate;
				
				type = select_Ticket_Type();
				prefer = select_person_type();
				age = cal_Age(); // 
				num = order_quantity ();
				discount_rate = (float) Calculator.calculate_Discount_Rate(prefer);
				
				TicketInformation t = new TicketInformation(type, age, num, prefer, discount_rate); // 이건 왜 해준건가?
			}

//		public static void input() { // 왜 함수들을 static으로 바꿔주는가?
//			
//			int type; // 권종
//			int age; // 나이
//			int num; // 티켓 개수
//			int prefer; // 우대사항
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
//			System.out.println("13자리 숫자를 입력하세요: ");
//			String input = scanner.nextLine();
//			//inputArray.add(input);
//			
//					
//			if (input.toString().length() != 13) { // 입력받은 문자열이 13자리가 아닌 경우
//				System.out.println("13자리 숫자를 입력해주세요.");
//				continue; // 처음으로 되돌아가기
//			} else break;
//			
//			
//			
//			
//		}
//	}
	
	
	
	
	
}
