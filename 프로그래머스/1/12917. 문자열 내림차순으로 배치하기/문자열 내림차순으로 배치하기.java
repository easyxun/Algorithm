class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long p = 0;
        for (int i = 1; i <= count; i++) {
            p += (price * i);
        }
        if (p < money) {
            return 0;
        } else {
            answer = p - money;
            return answer;
        }
    }
}
