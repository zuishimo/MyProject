package Multithreading;

public class ThreadDaemon {

	public static void main(String[] args) {
		Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                 
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("ÒÑ¾­ÍæÁËLOL %d Ãë%n", seconds++);
                    if(seconds>20)
                    	break;
                }              
            }
        };
        t1.setDaemon(true);
        t1.start();
		
	}
}
