import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;


public class FizzBuzz {
    public static void main(String[] args) {

    	Thread th1 = new Thread( new Producer() );
    	// Thread th2 = new Thread( new Producer() );
    	Thread th3 = new Thread( new Producer() );
    
    	Thread th4 = new Thread( new Consumer() );
    	Thread th5 = new Thread( new Consumer() );
    	Thread th6 = new Thread( new Consumer() );

        th1.start();
        // th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
	
    public static AtomicInteger counter = new AtomicInteger(0);
    public static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    public static volatile boolean isStop = false; 
	
    public static class Producer implements Runnable{

        @Override
        public void run() {
	    while ( true ) {
	        Integer counterValue = counter.incrementAndGet();
		if (counterValue <= 10) {
		    queue.add(counterValue);
		} else {
		    isStop = true;
		    break;
		}
	    }
        }	
    }
	
    public static class Consumer implements Runnable{

        @Override
        public void run() {
            while ( true ) {
                Integer counterValue = queue.poll();
	        if ( counterValue == null ){
                    if(isStop){
                        break;
	            }

                    continue;
                }

                fizzBuzz(counterValue);
            }
        }
		
	
        private void fizzBuzz(Integer value){
            if( value % 15 == 0 ){
                System.out.println("FizzBuzz:" + value);
            } else if( value % 3 == 0 ){
                System.out.println("Fizz:" + value);
            } else if( value % 5 == 0 ){				
                System.out.println("Buzz:" + value );
            }else {
                System.out.println(value);
	    }
        }	
    }
	
}