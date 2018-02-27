package javaiw.threads;

public class SyncThread implements Runnable{
	String work;
	Thread t1;
	Resource resource;
	SyncThread(String w, Resource r1){
		work=w;
		resource=r1;
		t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		synchronized (resource){
			resource.show(work);
		}
	}

}
