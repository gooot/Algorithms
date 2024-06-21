class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] strArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0;i<strArray.length;i++){
            numbers = numbers.replaceAll(strArray[i],String.valueOf(i));
        }
        
        answer=Long.parseLong(numbers);
        
        
        
        
        
        
        return answer;
    }
}