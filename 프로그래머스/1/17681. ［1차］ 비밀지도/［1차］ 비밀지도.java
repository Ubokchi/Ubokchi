class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String hash1 = toHash(n, arr1[i]);
            String hash2 = toHash(n, arr2[i]);
            answer[i] = "";
            
            for (int j = 0; j < n; j++) {
                if (hash1.charAt(j) == '#' || 
                   hash2.charAt(j) == '#') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
    
    public String toHash(int n, int arrNum) {
        String str = "";
        
        for (int i = 0; i < n; i++) {
            if (arrNum % 2 == 1) {
                str = "#" + str;
            } else {
                str = " " + str;
            }
            
            arrNum /= 2;
        }
        
        return str;
    }
}