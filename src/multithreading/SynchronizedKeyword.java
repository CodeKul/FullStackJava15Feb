package multithreading;

public class SynchronizedKeyword {

    int num;

    public synchronized void set() {
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedKeyword sync = new SynchronizedKeyword();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.set();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.set();
                }
            }
        });

        thread.start();
        thread1.start();


        thread.join();
        thread1.join();
        System.out.println(sync.num);
    }


}
