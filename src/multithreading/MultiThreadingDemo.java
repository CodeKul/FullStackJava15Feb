package multithreading;

public class MultiThreadingDemo extends Thread {


    public static void main(String[] args) {

        MultiThreadingDemo obj = new MultiThreadingDemo();
        obj.start();
    }

    @Override
    public void run() {
        System.out.println("In run method");
    }
}
