package Amusement_Park_ticket;

public class OutputClass {

	public static void printResult() {

		for (int i = 0; i < TicketList.getCnt(); i++) {

			System.out.println((i + 1) + "��° �ŷ� - ");
			System.out.println("���� :" + TicketList.getType(i));
			System.out.println("����: " + TicketList.getAge(i));
			System.out.println("�������: " + TicketList.getNum(i));
			System.out.println("������: " + TicketList.getPrefer(i));
			System.out.println("����: " + TicketList.getPrice(i));

		}
	}

}
