package singleton;

public class SingletonThread extends Thread {
	private int timer;
	
	public SingletonThread(int timer) {
		this.timer = timer;
	}
	
	public void run()
    {
        try
        {
            for(int i = 0 ; i < 10 ; i++)
            {
                Thread.sleep(timer);
                System.out.println("Thread : "+ Singleton.getInstance());
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
