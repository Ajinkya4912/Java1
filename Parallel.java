class Demo extends Thread
{
	public void run()
	{
		for(int i = 1; i < 10; i++)
		{
			try
			{
				Thread.sleep(100);
				System.out.println("Inside - "+Thread.currentThread().getName() +":"+i);
			}
			catch(Exception obj)
			{}
		}	
	}   
}

class Parallel
{
	public static void main(String str[]) throws Exception
	{
		System.out.println("Thred name is :"+Thread.currentThread().getName());

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		obj1.setName("First");
		obj2.setName("Second");
		
		obj1.start();
		obj2.start();
		obj1.join();
		obj2.join();
	
		System.out.println("End of main");
	}
}

