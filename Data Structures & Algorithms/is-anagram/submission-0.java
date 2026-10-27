class Solution {
    public boolean isAnagram(String s, String t) {
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String x1 = new String(s1);
        String x2 = new String(t1);
        if(x1.equals(x2)) return true;
        else return false;
    }
}
