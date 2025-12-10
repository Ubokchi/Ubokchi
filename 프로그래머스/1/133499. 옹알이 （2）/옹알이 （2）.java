class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            if (isBabble(list, babbling[i])) answer++;
        }
        
        return answer;
    }
    
    public boolean isBabble(String[] babble, String str) {
        String recent = "";
        int i;
        
        while (!str.equals("")) {
            for (i = 0; i < babble.length; i++) {
                if (str.length() < babble[i].length()) continue;
                
                String temp = str.substring(babble[i].length());
                    
                if (str.startsWith(babble[i]) && !babble[i].equals(recent)) {
                    recent = babble[i];
                    str = str.substring(babble[i].length());
                    break;
                }
            }
            if (i == babble.length) return false;
        }
        
        return true;
    }
}