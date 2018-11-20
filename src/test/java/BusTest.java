import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Passenger person;
    BusStop stop;

    @Before
    public void before(){
        bus = new Bus("Granton", 5);
        person = new Passenger();
        stop = new BusStop();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Ignore
    public void addPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void tooManyPeople(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
        bus.clearOff();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void fellOutWindow(){
        bus.addPassenger(person);
        bus.getOFF();
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void nobodyToRemove(){
        bus.getOFF();
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void finalDestination(){
        assertEquals("Granton", bus.getDestination());
    }

    @Test
    public void canCollect(){
        stop.addPerson(person);
        bus.pickUp(stop);
        assertEquals(0, stop.qLength());
        assertEquals(1, bus.passengerCount());
    }
}
