package com.nt.itc;

public class Factory {
	
	private int items;
	private boolean itemsFactory;
	
	public synchronized void produce(int items) {
		this.items=this.items+items;
		this.itemsFactory=true;
		System.out.println("Items Produce : "+items);
	}
	public synchronized void consume(int items) {
		this.items=this.items-items;
		this.itemsFactory=false;
		System.out.println("Items Consumed : "+items);
	}
}
