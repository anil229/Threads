package javaiw.threads;

public class SetterThread implements Runnable {

	Thread t1;
	Resource resource;
	SetterThread(Resource r1){
		resource=r1;
		t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		int i=1;
		while(true){
			resource.setValue(i);
			i++;
		}
	}
}

