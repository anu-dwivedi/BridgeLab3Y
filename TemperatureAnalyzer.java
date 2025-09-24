
public class TemperatureAnalyzer {

    // Method to analyze temperature data
    public static void analyzeTemperature(float[][] temps) {
        if (temps == null || temps.length != 7 || temps[0].length != 24) {
            System.out.println("Invalid temperature data.");
            return;
        }

        float[] dailyAverages = new float[7];
        int hottestDay = 0;
        int coldestDay = 0;

        for (int day = 0; day < 7; day++) {
            float sum = 0;
            for (int hour = 0; hour < 24; hour++) {
                sum += temps[day][hour];
            }
            dailyAverages[day] = sum / 24;

            if (dailyAverages[day] > dailyAverages[hottestDay]) {
                hottestDay = day;
            }
            if (dailyAverages[day] < dailyAverages[coldestDay]) {
                coldestDay = day;
            }
        }

        // Display results
        System.out.println("Average temperatures per day:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Day %d: %.2f°C%n", i + 1, dailyAverages[i]);
        }

        System.out.println("Hottest Day: Day " + (hottestDay + 1));
        System.out.println("Coldest Day: Day " + (coldestDay + 1));
    }

    // Example usage
    public static void main(String[] args) {
        float[][] weekTemps = new float[7][24];

        // Simulated data for demonstration
        for (int day = 0; day < 7; day++) {
            for (int hour = 0; hour < 24; hour++) {
                weekTemps[day][hour] = 20 + (float)(Math.random() * 10); // 20°C to 30°C
            }
        }

        analyzeTemperature(weekTemps);
    }
}

