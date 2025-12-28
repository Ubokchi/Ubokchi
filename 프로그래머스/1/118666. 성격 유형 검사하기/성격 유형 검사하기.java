import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 각 성격 유형별 점수 저장
        Map<Character, Integer> scoreMap = new HashMap<>();
        char[] types = {'R','T','C','F','J','M','A','N'};
        for (char c : types) {
            scoreMap.put(c, 0);
        }

        // 점수 계산
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if (choice == 4) continue;

            int score = Math.abs(choice - 4);
            char type;

            if (choice < 4) { // 비동의
                type = survey[i].charAt(0);
            } else { // 동의
                type = survey[i].charAt(1);
            }

            scoreMap.put(type, scoreMap.get(type) + score);
        }

        // 결과 생성
        StringBuilder answer = new StringBuilder();
        answer.append(getType(scoreMap, 'R', 'T'));
        answer.append(getType(scoreMap, 'C', 'F'));
        answer.append(getType(scoreMap, 'J', 'M'));
        answer.append(getType(scoreMap, 'A', 'N'));

        return answer.toString();
    }

    private char getType(Map<Character, Integer> map, char a, char b) {
        if (map.get(a) > map.get(b)) return a;
        if (map.get(a) < map.get(b)) return b;
        return (a < b) ? a : b;
    }
}