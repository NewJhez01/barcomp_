import java.util.ArrayList;
import java.util.List;

public class Subject implements IObserverable{
    private final List<Observer> observers;
    private int state = 0;

    public Subject() {
        observers = new ArrayList<>();
    }





    public int getState() {
        return state;
    }

    @Override
    public void subscribe(final Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(final Observer observer) {
        if (!observers.contains(observer)) {
        observers.remove(observer);
    }

    }

    @Override
    public void changeState(final int change) {
        state += change;
        observers.forEach(Observer::update);
    }
}
