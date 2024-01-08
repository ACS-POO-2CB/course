package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class GrannyDownstrairs {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber likesToGossip) {
        subscribers.add(likesToGossip);
    }

    public void spreadTheNews(String gossip) {
        System.out.println("Granny broadcasts");
        for (Subscriber subscriber : subscribers) {
            subscriber.spreadNews(gossip);
        }
    }
}
