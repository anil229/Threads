package javaiw.threads;

public class ComnonMain {
	public static void main(String[] args) {
		Resource resource=new Resource();
		SetterThread thread1=new SetterThread( resource);
		GetterThread thread2=new GetterThread(resource);
	}
}
