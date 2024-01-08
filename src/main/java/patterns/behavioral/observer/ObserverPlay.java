package patterns.behavioral.observer;

// nimic de deasupra liniei astea nu stie de ce impl de barfitor exista in sistem
// tipic parte dintr-o libarie.
// ---------------- o linie:-------------
public class ObserverPlay {

   public static void main(String[] args) {
      GrannyDownstrairs g = new GrannyDownstrairs();
      g.addSubscriber(new Neighbour(1));
      g.addSubscriber(new Neighbour(2));
      g.spreadTheNews("Suspicios activity opposite the door - maybe a stalker?");
   }
}