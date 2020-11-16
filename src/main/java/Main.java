public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread extendedThread = new MyThread(counter);
        Thread runnableThread = new Thread(new MyRunnable(counter));

        extendedThread.start();
        runnableThread.start();
    }
}
