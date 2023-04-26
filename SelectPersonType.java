package Amusement_Park_ticket;
import java.util.Scanner;
public class SelectPersonType {

	public int select_person_type() {
	int person_type;
	Scanner scanner = new Scanner(System.in);
	
	do{
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1.없음");
		System.out.println("2.장애인");
		System.out.println("3.국가유공자");
		System.out.println("4.다자녀");
		System.out.println("5.임산부");
		person_type = scanner.nextInt();
		
	 } while(person_type == 0||person_type > 5); //0이거나 5초과면 다시 돌아간다.
	 scanner.close();
	 return person_type;
	 
	}
	
	
	
}
