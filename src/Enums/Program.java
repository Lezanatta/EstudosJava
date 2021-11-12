package Enums;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.SHIPPED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		//IMPRIMIR EM FORMATO DE STRING
		System.out.println(os1);
		System.out.println(os2);
	}

}
