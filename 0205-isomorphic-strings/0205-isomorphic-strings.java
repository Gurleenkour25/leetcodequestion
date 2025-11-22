class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] st = new int[256];
        int[] ts = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int c1 = s.charAt(i);
            int c2 = t.charAt(i);

            if (st[c1] == 0 && ts[c2] == 0) {
                st[c1] = c2;
                ts[c2] = c1;
            } else if (st[c1] != c2 || ts[c2] != c1) {
                return false;
            }
        }

        return true;
    }
}
