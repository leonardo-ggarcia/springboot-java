package com.leonardogarcia.course.entities.enun;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Constructor for to force the statement argument
	private OrderStatus(int code) {		
		this.code = code;
	}
	
	//method to get the code of OrderStatus
	public int getOrderStatusCode() {	
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus osValue : OrderStatus.values()) {
			if(osValue.getOrderStatusCode() == code) {
				return osValue;
			}				
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
		
	}

}
