class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char current = new_id.charAt(i);
            if (Character.isLetterOrDigit(current)
                || current == '-'
                || current == '_'
                || current == '.') {
                sb.append(current);
            }
        }
        answer = sb.toString();
        
        // 3단계 & 4단계 - 처음
        sb.setLength(0);
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) != '.' || 
                (sb.length() > 0 && sb.charAt(sb.length() - 1) != '.')) {
                sb.append(answer.charAt(i));
            }
        }
        answer = sb.toString();
        
        // 4단계 - 끝
        if (!answer.equals("") && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 5단계
        if (answer.equals("")) {
            answer = "a";
        }
        
        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            
            if (answer.charAt(14) == '.') {
                answer = answer.substring(0, 14);
            }
        }
        
        // 7단계
        for (int i = 0; i < 2 && answer.length() <= 2; i++) {
            answer += answer.charAt(answer.length() - 1);
        }
            
        return answer;
    }
}