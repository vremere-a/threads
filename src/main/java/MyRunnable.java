import lombok.extern.log4j.Log4j;

@Log4j
public class MyRunnable implements Runnable {
    private final Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.isValueLessThanEndPoint()) {
            int i = counter.increment();
            log.info("Thread - 1: " + i);
        }
    }
}
