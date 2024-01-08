package patterns.behavioral.observer;

class Neighbour implements Subscriber {
    private int ID;

    public Neighbour(int ID) {
        this.ID = ID;
    }

    @Override
    public void spreadNews(String gossip) {
        System.out.println("Neighbour " + ID + " finds that: " + gossip);
    }
}
