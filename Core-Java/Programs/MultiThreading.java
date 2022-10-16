package first;

public class MultiThreading extends Thread{ 
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread());
			System.out.println(i);
		}
	}

}
