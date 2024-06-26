class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0;i<keyinput.length;i++){
            
            
                
            
            if(keyinput[i].equals("right") && answer[0]<board[0]/2){
                right(answer);
            }
            
            if(keyinput[i].equals("down") && answer[1]*-1<board[1]/2){
                down(answer);
            }
            
            if(keyinput[i].equals("up") && answer[1]<board[1]/2){
                up(answer);
            }
            
            if(keyinput[i].equals("left") && answer[0]*-1<board[0]/2){
                left(answer);
            }
            
        }

        
        
        
        return answer;
    }
    public void up(int[] answer){
        answer[1]+=1;
    }
    
    public void down(int[] answer){
        answer[1]-=1;
    }
    
    public void left(int[] answer){
        answer[0]-=1;
    }
    
    public void right(int[] answer){
        answer[0]+=1;
    }
}