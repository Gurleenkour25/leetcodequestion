import java.util.*;

public class Solution {

    static class Event {
        long y;
        long x1, x2;
        int type; // +1 = add, -1 = remove

        Event(long y, long x1, long x2, int type) {
            this.y = y;
            this.x1 = x1;
            this.x2 = x2;
            this.type = type;
        }
    }

    public double separateSquares(int[][] squares) {
        List<Event> events = new ArrayList<>();

        // Step 1: Create events
        for (int[] sq : squares) {
            long x = sq[0];
            long y = sq[1];
            long l = sq[2];

            events.add(new Event(y, x, x + l, +1));
            events.add(new Event(y + l, x, x + l, -1));
        }

        // Step 2: Sort events by Y
        events.sort(Comparator.comparingLong(e -> e.y));

        // Active X intervals
        TreeMap<Long, Integer> active = new TreeMap<>();

        long prevY = events.get(0).y;
        double totalArea = 0.0;

        // To store bands
        List<double[]> bands = new ArrayList<>();

        int i = 0;
        while (i < events.size()) {
            long currY = events.get(i).y;
            long deltaY = currY - prevY;

            if (deltaY > 0) {
                long coveredX = getCoveredLength(active);
                if (coveredX > 0) {
                    double area = coveredX * (double) deltaY;
                    bands.add(new double[]{prevY, currY, coveredX});
                    totalArea += area;
                }
            }

            // Process all events at currY
            while (i < events.size() && events.get(i).y == currY) {
                Event e = events.get(i);
                active.put(e.x1, active.getOrDefault(e.x1, 0) + e.type);
                active.put(e.x2, active.getOrDefault(e.x2, 0) - e.type);

                if (active.get(e.x1) == 0) active.remove(e.x1);
                if (active.get(e.x2) == 0) active.remove(e.x2);
                i++;
            }

            prevY = currY;
        }

        // Step 3: Find minimum Y where area = totalArea / 2
        double target = totalArea / 2.0;
        double accumulated = 0.0;

        for (double[] band : bands) {
            double y0 = band[0];
            double y1 = band[1];
            double coveredX = band[2];

            double bandArea = coveredX * (y1 - y0);
            if (accumulated + bandArea >= target) {
                double remaining = target - accumulated;
                return y0 + remaining / coveredX;
            }
            accumulated += bandArea;
        }

        return 0.0;
    }

    // Compute union length of X-intervals
    private long getCoveredLength(TreeMap<Long, Integer> map) {
        long length = 0;
        int count = 0;
        Long prev = null;

        for (Map.Entry<Long, Integer> e : map.entrySet()) {
            long x = e.getKey();
            if (count > 0 && prev != null) {
                length += x - prev;
            }
            count += e.getValue();
            prev = x;
        }
        return length;
    }
}
