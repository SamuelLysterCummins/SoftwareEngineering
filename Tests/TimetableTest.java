package Tests;

import Classes.Timetable;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class TimetableTest {
    private Timetable timetable;

    @Before
    public void setUp() {
        timetable = new Timetable();
        timetable.addSchedule("student@mail.wit", "Monday", Arrays.asList("CS101 at 10:00 AM", "Math302 at 2:00 PM"));
        timetable.addSchedule("student@mail.wit", "Wednesday", Arrays.asList("ENG204 at 1:00 PM"));
    }

    @Test
    public void testGetScheduleValidDay() {
        List<String> expected = Arrays.asList("CS101 at 10:00 AM", "Math302 at 2:00 PM");
        assertEquals(expected, timetable.getSchedule("student@mail.wit", "Monday"));
    }

    @Test
    public void testGetScheduleInvalidDay() {
        assertTrue(timetable.getSchedule("student@mail.wit", "Friday").isEmpty());
    }

    @Test
    public void testGetScheduleInvalidStudent() {
        assertTrue(timetable.getSchedule("unknown@mail.wit", "Monday").isEmpty());
    }
}
