class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int length = arr.length;
        double answer = sum/length;
        return answer;
    }
}