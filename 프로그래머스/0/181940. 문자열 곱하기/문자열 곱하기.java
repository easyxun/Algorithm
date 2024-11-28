class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 1; i<k+1; i++){
            answer += my_string;
        }
        return answer;
    }
}