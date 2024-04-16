package Tests;

import Classes.CampusMap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CampusMapTest {
    private CampusMap campusMap;

    @Before
    public void setUp() {
        campusMap = new CampusMap();
        campusMap.addLocation("CS101", "Building B, Room 104");
        campusMap.addLocation("ENG204", "Building A, Room 101");
    }

    @Test
    public void testGetLectureHallLocationValid() {
        assertEquals("Building B, Room 104", campusMap.getLectureHallLocation("CS101"));
    }

    @Test
    public void testGetLectureHallLocationInvalid() {
        assertEquals("Location not found", campusMap.getLectureHallLocation("BIO101"));
    }

    @Test
    public void testMultipleLocationQueries() {
        assertEquals("Building B, Room 104", campusMap.getLectureHallLocation("CS101"));
        assertEquals("Building A, Room 101", campusMap.getLectureHallLocation("ENG204"));
        assertEquals("Location not found", campusMap.getLectureHallLocation("MATH300"));
        assertEquals("Location not found", campusMap.getLectureHallLocation("PHYS101"));
    }
}
