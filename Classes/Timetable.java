package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Timetable {
    private Map<String, Map<String, List<String>>> studentSchedules;

    public Timetable() {
        studentSchedules = new HashMap<>();
    }

    public void addSchedule(String studentEmail, String day, List<String> classes) {
        if (!studentSchedules.containsKey(studentEmail)) {
            studentSchedules.put(studentEmail, new HashMap<>());
        }
        studentSchedules.get(studentEmail).put(day, classes);
    }

    public List<String> getSchedule(String studentEmail, String day) {
        return studentSchedules.getOrDefault(studentEmail, new HashMap<>()).getOrDefault(day, new ArrayList<>());
    }
}

