import lombok.extern.log4j.Log4j;

@Log4j
public class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.isValueLessThanEndPoint()) {
            int i = counter.increment();
            log.info("Thread - 0: " + i);
        }
    }
}
