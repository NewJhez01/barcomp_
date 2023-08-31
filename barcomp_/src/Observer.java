public abstract class Observer implements IObserver{

    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public abstract void update();
}
