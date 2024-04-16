import java.util.HashMap;
import java.util.Map;

public class CampusMap {

    private Map<String, String> lectureHallLocations;

    public CampusMap() {
        lectureHallLocations = new HashMap<>();

    }

    public void addLocation(String hallName, String location) {
        lectureHallLocations.put(hallName, location);
    }

    public String getLectureHallLocation(String hallName) {
        return lectureHallLocations.getOrDefault(hallName, "Location not found");
    }
}
