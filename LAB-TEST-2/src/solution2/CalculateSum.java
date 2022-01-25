package solution2;

import java.util.Random;

class Sum implements Runnable{
	private int sum;
	public Sum(int num) {
		this.sum = num;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		int number = random.nextInt(10)+1;
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+" produces number: "+number);
			this.sum += number;
		}
	}
	
}

public class CalculateSum {
	public static void main(String[] args) {
		int sum=0;
		Sum job = new Sum(sum);
		Thread thread1 = new Thread(job, "t1");
		Thread thread2 = new Thread(job, "t2");
		Thread thread3 = new Thread(job, "t3");
		Thread thread4 = new Thread(job, "t4");
		Thread thread5 = new Thread(job, "t5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			System.out.println("Sum of the 5 numbers is :" + job.getSum());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}