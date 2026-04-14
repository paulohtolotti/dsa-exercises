import java.util.Map;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Votacao {
    public static void main(String[] args) {
        List<String> input = List.of("Alex Blue,15", "Maria Green,22","Bob Brown,21","Alex Blue,30", "Maria Green,40");

        Instant start = Instant.now();
        List<String> output = consolidate(input);
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Duration: " + duration + "ms");
    }

    public static List<String> consolidate(List<String> csvData) {

        Map<String, Integer> candidates = new HashMap<>();

        for(String fullData : csvData) {
            Integer newCount;
            //0 -> name; 1 -> count

            String[] data = fullData.split(",");
            String key = data[0];
            Integer voteCount = Integer.parseInt(data[1]);

            if(candidates.containsKey(key)) {
                newCount = voteCount + candidates.get(key);
                candidates.replace(data[0], newCount);
            } else {
                candidates.put(key, voteCount);
            }
        }

        List<String> consolidatedCounting = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(String k : candidates.keySet()) {
            sb.append(k);
            sb.append(",");
            sb.append(candidates.get(k));

            consolidatedCounting.add(sb.toString());
            sb.setLength(0);
        }

        return consolidatedCounting;
    }
    
}