import java.util.ArrayList;

public class BusStop {
    private ArrayList<Passenger> queue;

    public BusStop(){
        this.queue = new ArrayList<>();
    }

    public int qLength(){
        return this.queue.size();
    }

    public void addPerson(Passenger person){
        queue.add(person);
    }


    public Passenger removePerson() {
        return queue.remove(0);
    }
}
