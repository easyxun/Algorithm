class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        String[] array = s.split("");

        for (int i = 0; i < array.length; i++) {
            String word = array[i];

            if (index % 2 == 1) {
                answer += word.toLowerCase();
            } else {
                answer += word.toUpperCase();
            }

            if (!word.contains(" ")) {
                index = index + 1;
            } else {
                index = 0;
            }
        }

        return answer;
    }
}
