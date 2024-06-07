import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (;l<=r;l++){
          if ( containsOnly05(l) ) {
                result.add(l);
            }
        }

        int[] answer = new int[result.size()];

        if (result.isEmpty()) {
            answer = new int[]{-1}; 
        } else {
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
        }
        return answer;
    }

    private boolean containsOnly05(int number){
        while(number > 0) {
            int digit = number % 10;
           if (digit != 0 && digit != 5) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}