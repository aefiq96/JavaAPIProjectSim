package ie.gmit.sw;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Launcher {
	
	public void Launch(String f1, String f2, int shingleSize, int k, int poolSize) throws InterruptedException {
		BlockingQueue<Shingle> q = new LinkedBlockingQueue<Shingle>();	
		
		Thread t1 = new Thread(new FileParser(f1, k, shingleSize, q, 1), "T1");
		Thread t2 = new Thread(new FileParser(f2, k, shingleSize, q, 2), "T2");
		Thread t3 = new Thread(new Consumer(q, k, poolSize), "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
}
