class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] list = quiz[i].split(" ");
            int left = Integer.parseInt(list[0]);
            int right = Integer.parseInt(list[2]);
            int result = Integer.parseInt(list[4]);

            int calc;
            if (list[1].equals("+")) {
                calc = left + right;
            } else {
                calc = left - right;
            }

            if (calc == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}