class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int idx = 0;
        int basket[] = new int[moves.length];
        
        for (int i = 0; i < moves.length; i++) {
            int spot = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                int toy = board[j][spot];
                
                if (toy != 0) {
                    board[j][spot] = 0; 
                    basket[idx] = toy;
                    idx++;
                    
                    if (idx >= 2 && basket[idx - 1] == basket[idx - 2]) {
                        idx -= 2;
                        answer += 2;
                        
                        break;
                    }
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}