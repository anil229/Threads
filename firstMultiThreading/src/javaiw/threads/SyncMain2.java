package javaiw.threads;

public class SyncMain2 {
	public static void main(String[] args) {
		Resource resource=new Resource();
		SyncThread2 thread1=new SyncThread2("Process 1", resource);
		SyncThread2 thread2=new SyncThread2("Process 2", resource);
		SyncThread2 thread3=new SyncThread2("Process 3", resource);
		//System.out.println("Start threads");
	}

}
