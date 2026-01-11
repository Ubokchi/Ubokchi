class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] now = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    now[0] = i;
                    now[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] str = routes[i].split(" ");
            now = changePosition(park, now, str[0], Integer.parseInt(str[1]));
        }
        
        return now;
    }
    
    public int[] changePosition(String[] park, int[] now, String op, int n) {
        if (op.equals("N")) {
            
            for (int i = 1; i <= n; i++) {
                if (now[0] - i < 0 || park[now[0] - i].charAt(now[1]) == 'X') {
                    return now;
                }
            }
            
            return new int[]{now[0] - n, now[1]};
        } 
        
        else if (op.equals("S")) {
            
            for (int i = 1; i <= n; i++) {
                if (now[0] + i >= park.length
                    || park[now[0] + i].charAt(now[1]) == 'X') {
                    return now;
                }
            }
            
            return new int[]{now[0] + n, now[1]};
        } 
        
        else if (op.equals("W")) {
            
            for (int i = 1; i <= n; i++) {
                if (now[1] - i < 0 || park[now[0]].charAt(now[1] - i) == 'X') {
                    return now;
                }
            }
            
            return new int[]{now[0], now[1] - n};
        }
        
        else {
            
            for (int i = 1; i <= n; i++) {
                if (now[1] + i >= park[0].length()
                    || park[now[0]].charAt(now[1] + i) == 'X') {
                    return now;
                }
            }
            
            return new int[]{now[0], now[1] + n};
        }
    }
}