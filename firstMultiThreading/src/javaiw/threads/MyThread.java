package javaiw.threads;

public class MyThread implements Runnable {
	Thread t1;
	String name;
	public MyThread(String name, int p) {
		this.name=name;
		t1=new Thread(this);
		t1.setPriority(p);
		t1.start();
	}

	@Override
	public void run() {
		int i;
		for(i=1;i<=1500;i++){
			System.out.println(name+" i="+i);
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
