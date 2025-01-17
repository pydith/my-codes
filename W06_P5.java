class W06_P5 extends Thread{  
    public void run(){  
      System.out.print("Thread is running.");  
    }  
   public static void main(String args[]){  
      W06_P5 t=new W06_P5();  
      System.out.println("Name of thread 't':"+ t.getName());
       // Set a new name for the thread
       t.setName("Nptel");
       
       System.out.println("New name of thread 't':"+ t.getName());  
       t.start();
      }  
   }