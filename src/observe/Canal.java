package observe;

import java.util.ArrayList;
import java.util.List;

class Canal {
    private List<Observer> Observer = new ArrayList<>();

    public void addNewObserve(Observer observe) {
        Observer.add(observe);
    }

    public void notificarObserve(String msg) {
        for (Observer observe : Observer){
            observe.update(msg);
        }
    }
}
