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

		////////// �ֹε�Ϲ�ȣ �Է� /////////
		while (true) {

			LocalDateTime now = LocalDateTime.now();

			System.out.println("13�ڸ� ���ڸ� �Է��ϼ���: ");
			String input = scanner.nextLine();
			inputArray.add(input);
			
			if (inputArray.size() != 13) { // �Է¹��� ���ڿ��� 13�ڸ��� �ƴ� ���
				System.out.println("13�ڸ� ���ڸ� �Է����ּ���.");
				continue; // ó������ �ǵ��ư���
			}
			
			inputNumber = Long.parseLong(input); // ���ڿ��� long long �������� ��ȯ
			return 1;
		}
		
	}

}
