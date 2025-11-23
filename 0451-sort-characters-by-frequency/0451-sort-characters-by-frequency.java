class Solution {
    public String frequencySort(String s) {

        // Step 1: count frequency
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Step 2: build max heap
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> freq[b] - freq[a]   // max-heap based on frequency
        );

        // Step 3: add all characters with freq > 0
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                pq.add((char) i);
            }
        }

        // Step 4: build result
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();       // highest freq char
            int count = freq[ch];

            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
