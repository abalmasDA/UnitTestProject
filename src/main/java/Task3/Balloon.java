package Task3;

public class Balloon {

    public static int foundMaxNumberOfInstances(String text) {
        int[] count = new int[26];
        for (char ch : text.toCharArray()) {
            count[ch - 'a']++;
        }
        int minCount = Integer.MAX_VALUE;
        minCount = Math.min(minCount, count['b' - 'a']);
        minCount = Math.min(minCount, count['a' - 'a']);
        minCount = Math.min(minCount, count['l' - 'a'] / 2);
        minCount = Math.min(minCount, count['o' - 'a'] / 2);
        minCount = Math.min(minCount, count['n' - 'a']);

        return minCount;
    }
}

