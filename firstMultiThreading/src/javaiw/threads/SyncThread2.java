package javaiw.threads;

public class SyncThread2 implements Runnable {
	String work;
	Thread t1;
	Resource resource;
	SyncThread2(String w, Resource r1){
		work=w;
		resource=r1;
		t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		resource.show(work);
	}
}
