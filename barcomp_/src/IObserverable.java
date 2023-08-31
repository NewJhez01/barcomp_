public interface IObserverable {
    void subscribe(final Observer observer);
    void unsubscribe(final Observer observer);
    void changeState(final int change);
}
