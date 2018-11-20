import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop stop;
    Passenger person;

    @Before
    public void before(){
        stop = new BusStop();
        person = new Passenger();
    }

    @Test
    public void qStartsEmpty(){
        assertEquals(0, stop.qLength());
    }

    @Test
    public void addPersonToQ(){
        stop.addPerson(person);
        assertEquals(1, stop.qLength());
    }

    @Test
    public void removePersonFromQ(){
        stop.addPerson(person);
        stop.removePerson();
        assertEquals(0, stop.qLength());
    }
}
