package multithreading;



class HiiHello {

    public static void main(String[] args) throws InterruptedException {
        Hii hii = new Hii();
        Hello hello = new Hello();

        hii.start();
        hello.start();

        hii.join();
        hello.join();
        System.out.println("Bye");
    }
}
public class Hii extends Thread {

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
}

class Hello extends Thread {

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
}
