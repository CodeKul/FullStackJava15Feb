package multithreading;

public class HiiHelloDemo {
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 5; i++) {
                   System.out.println("Hii");

                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });

       Thread t2 =  new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 5; i++) {
                   System.out.println("Hello");

                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });

       t1.start();
       t2.start();
    }
}
