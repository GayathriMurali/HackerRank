import java.util.concurrent.*;
public class ProducerConsumer {
	public static class producer implements Runnable
	{
		BlockingQueue<Integer> q;
		int next=0;
		public producer(BlockingQueue<Integer> queue)
		{
		   this.q=queue;
		}
		public void run()
		{
			while(true)
			{
				
				q.add(next);
				next++;

			}
		}
		
		
	}
	public static class consumer implements Runnable
	{
		BlockingQueue<Integer> q;
		int next;
		public consumer(BlockingQueue<Integer> queue)
		{
			this.q=queue;
		}
		public void run()
		{
			while(true)
			{
				synchronized (q) {
					if(q.isEmpty())
					{
						try {
							q.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	                    next=q.remove();
	                    System.out.println(next);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
        Thread producer1 = new Thread(new producer(queue));
        Thread producer2 = new Thread(new producer(queue));
        Thread consumer1 = new Thread(new consumer(queue));
        Thread consumer2 = new Thread(new consumer(queue));
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
	}

}
