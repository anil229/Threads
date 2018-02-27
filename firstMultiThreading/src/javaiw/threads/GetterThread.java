package javaiw.threads;

public class GetterThread implements Runnable {
	Thread t1;
	Resource resource;
	GetterThread(Resource r1){
		resource=r1;
		t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		while(true){
			resource.getValue();
		}
	}
}
