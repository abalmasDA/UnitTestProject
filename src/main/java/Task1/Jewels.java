package Task1;

public class Jewels {
      public static long foundNumberOfJewelsInStones(String jewels, String stones) {
        return stones.chars()
                .filter(stone -> jewels.indexOf(stone) != -1)
                .count();
    }
}
