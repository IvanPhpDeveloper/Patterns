package Pattern.Observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
