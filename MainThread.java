class MyThread extends Thread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println(i+" My Thread");
		System.out.println("My Thread Completed");
	}
}
class MainThread
{
	public static void main(String S[])
	{
		System.out.println("Main Started");
		MyThread my  = new MyThread();
		Thread th = new Thread(my);
		th.start();
		System.out.println(th.isAlive());
		MyThread th2 = new MyThread();
		try
		{
			th.join();
			System.out.println(th2.isAlive());	
		}
		catch(InterruptedException ie)
		{
		}
		th2.start();
		for(int i=0;i<10;i++)
		System.out.println(i+" Main Thread");

		System.out.println("Main Completed");
	}
}
