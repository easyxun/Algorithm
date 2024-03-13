import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        int width = 0;
        int height = 0;

        for (int[] card : sizes) {
            width = Math.max(width, card[0]);
            height = Math.max(height, card[1]);
        }

        return width * height;
    }
}