public class Main {
    public static void main(String[] args) {
        Subject subjectInstance = new Subject();
        SpecificValueObserver specificValueObserverInstance = new SpecificValueObserver(subjectInstance);
        ValueLoweredObserver valueLoweredObserverInstance = new ValueLoweredObserver(subjectInstance);
        ByTenChangedObserver byTenChangedObserver = new ByTenChangedObserver(subjectInstance);
        subjectInstance.subscribe(byTenChangedObserver);
        subjectInstance.subscribe(specificValueObserverInstance);
        subjectInstance.changeState(200);
        subjectInstance.subscribe(valueLoweredObserverInstance);
    }

}