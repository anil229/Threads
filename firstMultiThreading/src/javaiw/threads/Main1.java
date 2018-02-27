package javaiw.threads;

public class Main1 {
	public static void main(String[] args) {
		MyThread m1=new MyThread("XX",4);
		MyThread m2=new MyThread("YY",6);
		MyThread m3=new MyThread("ZZ",8);
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i;
				for(i=1500;i>=1;i--){
					System.out.println("Inner i="+i);
					/*try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				}
			}
		});
		t1.setPriority(2);
		try{
			m1.t1.join();
			m2.t1.join();
			m3.t1.join();
		}catch(InterruptedException e){}
		t1.start();
		int i;
		for(i=1500;i>=1;i--){
			System.out.println("Main i="+i);
			/*try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}

}
