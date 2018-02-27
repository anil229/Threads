package javaiw.threads;

public class SyncMain {
	public static void main(String[] args) {
		Resource resource=new Resource();
		SyncThread thread1=new SyncThread("Process 1", resource);
		SyncThread thread2=new SyncThread("Process 2", resource);
		SyncThread thread3=new SyncThread("Process 3", resource);
		//System.out.println("Start threads");
	}
}
