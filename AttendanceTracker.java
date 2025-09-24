import java.util.*;

public class AttendanceTracker {

    public static Map<String, Integer> computeAttendance(List<List<String>> dailyAttendance) {
        Map<String, Integer> attendanceCount = new HashMap<>();

        for (List<String> day : dailyAttendance) {
            for (String student : day) {
                attendanceCount.put(student, attendanceCount.getOrDefault(student, 0) + 1);
            }
        }

        return attendanceCount;
    }

    // Example usage
    public static void main(String[] args) {
        List<String> day1 = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> day2 = Arrays.asList("Alice", "Bob");
        List<String> day3 = Arrays.asList("Bob", "Charlie", "David");

        List<List<String>> attendance = Arrays.asList(day1, day2, day3);

        Map<String, Integer> result = computeAttendance(attendance);
        System.out.println(result);
    }
}

