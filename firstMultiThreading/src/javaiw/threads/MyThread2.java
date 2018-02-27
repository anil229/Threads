package javaiw.threads;

public class MyThread2 extends Thread {
	String name;
	public MyThread2(String name) {
		this.name=name;
		start();
	}

	@Override
	public void run() {
		int i;
		for(i=1;i<=3000;i++){
			System.out.println(name+" i="+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
