package Amusement_Park_ticket;

public class OutputClass {

	public static void printResult() {

		for (int i = 0; i < TicketList.getCnt(); i++) {

			System.out.println((i + 1) + "번째 거래 - ");
			System.out.println("권종 :" + TicketList.getType(i));
			System.out.println("나이: " + TicketList.getAge(i));
			System.out.println("구매장수: " + TicketList.getNum(i));
			System.out.println("우대사항: " + TicketList.getPrefer(i));
			System.out.println("가격: " + TicketList.getPrice(i));

		}
	}

}
