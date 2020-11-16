import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {
    private static final int END_POINT = 100;
    private int counter = 0;

    public int increment() {
        return counter++;
    }

    public boolean isValueLessThanEndPoint() {
        return counter < END_POINT;
    }
}
