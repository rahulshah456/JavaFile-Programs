class ThreadPriorityDemo extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run() in ThreadPriorityDemo class"); 
    } 
  
    public static void main(String[]args) 
    { 
	ThreadPriorityDemo t1 = new ThreadPriorityDemo(); 
        ThreadPriorityDemo t2 = new ThreadPriorityDemo(); 
        ThreadPriorityDemo t3 = new ThreadPriorityDemo(); 
  
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority()); 
        System.out.println("t3 thread priority : " +t3.getPriority()); 
  
        t1.setPriority(MIN_PRIORITY); 
        t2.setPriority(5); 
        t3.setPriority(MAX_PRIORITY); 
 
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority()); 
        System.out.println("t3 thread priority : " + t3.getPriority()); 
  
        System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 
  
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority()); 
    } 
}
