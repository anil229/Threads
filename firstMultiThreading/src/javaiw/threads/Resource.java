package javaiw.threads;

public class Resource {

	int value;
	boolean b=true;
	public void show(String p1){
		System.out.println("Start "+p1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("stop "+p1);
	}
	synchronized public int getValue() {
		while(b){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		b=true;
		notify();
		System.out.println("Got "+value);
		return value;
	}
	synchronized public void setValue(int value) {
		while(!b){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		b=false;
		notify();
		System.out.println("Put "+value);
		this.value = value;
	}
}
