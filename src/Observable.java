import java.util.ArrayList;

public interface Observable {

    public ArrayList<Observer> observerArrayList = new ArrayList<>();
    public void addSubscriber(Observer o);
    public void removeSubscriber(Observer o);
    public void sendUpdate();
    
}
