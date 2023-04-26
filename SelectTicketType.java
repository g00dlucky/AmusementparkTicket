package Amusement_Park_ticket;

import java.util.Scanner;

public class SelectTicketType {
	
	
	    public static int select_Ticket_Type() {
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	//int select_ticket_type; 
	    	int ticket_type;
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
	    	 
	    	 scanner.close();
	    	 return ticket_type;
	 	    
	    
	}

}