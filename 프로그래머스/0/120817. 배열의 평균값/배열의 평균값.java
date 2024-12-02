class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int t =0;
        for (int i =0; i < numbers.length; i ++){
            t += numbers[i];
        }
        answer = (double) t /numbers.length;
            
        return answer;
    }
}