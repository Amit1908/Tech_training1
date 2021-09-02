package com.techment.day14.multithreading;


class Message extends Thread
{
	public void run()
	{
		System.out.println("This is my task");
	}
}
public class CreatingThreadsByExtendsThread {

	public static void main(String[] args) {
		
		Message msg = new Message();
		msg.start();

	}

}
