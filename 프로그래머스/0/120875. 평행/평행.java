class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double x1=dots[0][0];
        double x2=dots[1][0];
        double x3=dots[2][0];
        double x4=dots[3][0];
        double y1=dots[0][1];
        double y2=dots[1][1];
        double y3=dots[2][1];
        double y4=dots[3][1];
        
        double slope1=0;
        double slope2=0;
        
        slope1 = (y1-y2)/(x1-x2);
        slope2 = (y3-y4)/(x3-x4);
        if(slope1==slope2){ 
            return answer=1;
        }
        
        slope1 = (y1-y3)/(x1-x3);
        slope2 = (y2-y4)/(x2-x4);
        if(slope1==slope2){ 
            return answer=1;
        }
        
        slope1 = (y1-y4)/(x1-x4);
        slope2 = (y2-y3)/(x2-x3);
        if(slope1==slope2){ 
            return answer=1;
        }
        
        
        
        return answer;
    }
}