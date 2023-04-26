package Amusement_Park_ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AgeCalculator {

	Scanner scanner = new Scanner(System.in);
	ArrayList<String> inputArray = new ArrayList<>();
	long inputNumber;
	int inputYear, inputMonth, inputDay;
	int age;
	int flag;

	// int i = 0;
	// String[] input = new String[14];

	public int get_Age() {

		////////// 주민등록번호 입력 /////////
		while (true) {

			LocalDateTime now = LocalDateTime.now();

			System.out.println("13자리 숫자를 입력하세요: ");
			String input = scanner.nextLine();
			inputArray.add(input);
			
			if (inputArray.size() != 13) { // 입력받은 문자열이 13자리가 아닌 경우
				System.out.println("13자리 숫자를 입력해주세요.");
				continue; // 처음으로 되돌아가기
			}
			
			inputNumber = Long.parseLong(input); // 문자열을 long long 형식으로 변환
			return 1;
		}
		
	}

}
