import java.util.ArrayList;

public class Bus {
    private ArrayList<Passenger> person;
    private String destination;
    private int capacity;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.person = new ArrayList<>();
    }

    public int passengerCount() {
        return this.person.size();
    }

    public void addPassenger(Passenger person) {
        if (this.passengerCount() < this.capacity){
            this.person.add(person);
            System.out.println("Person Found Seat");
        }else {
            System.out.println("Bus Full!");
        }
    }

    public void getOFF() {
        if(this.passengerCount() > 0){
            this.person.remove(0);
            System.out.println("GET OFF!");
        }else{
            System.out.println("Nobody Here!");
        }
    }

    public void clearOff(){
        this.person.clear();
        System.out.println("Bus Voided");
    }

    public String getDestination() {
        return this.destination;
    }

    public void pickUp(BusStop stop) {
        Passenger person = stop.removePerson();
        this.addPassenger(person);
    }
}
