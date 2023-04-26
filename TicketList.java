package Amusement_Park_ticket;

import java.util.*;

public class TicketList {
	
	private static HashMap<Integer, String> types = new HashMap<>();
	private static HashMap<Integer, Integer> ages = new HashMap<>();
	private static HashMap<Integer,Integer> nums = new HashMap<>();
	private static HashMap<Integer,String> prefers = new HashMap<>();
	private static HashMap<Integer,Integer> prices = new HashMap<>();
	
	private static Integer cnt = 0;
	
	public static void setList(String type, int age, int num, String prefer, int price) {
		// TODO 자동 생성된 메

		types.put(cnt, type);
		ages.put(cnt, age);
		nums.put(cnt, num);
		prefers.put(cnt, prefer);
		prices.put(cnt, price);
		
		cnt++;
	}
	
	
	public static Integer getCnt() {
		return cnt;
	}
	
	public static String getType(int num) {
		return types.get(num);
	}
	
	public static int getAge(int num) {
		return ages.get(num);
	}
	
	public static int getNum(int num) {
		return nums.get(num);
	}
	
	public static String getPrefer(int num) {
		return prefers.get(num);
	}
	
	public static int getPrice(int num) {
		return prices.get(num);
	}
}
