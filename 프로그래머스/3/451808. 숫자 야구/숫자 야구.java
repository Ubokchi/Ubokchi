import java.util.*;
import java.util.function.IntFunction;

class Solution {

    public int solution(int n, IntFunction<String> submit) {
        List<String> candidates = generateCandidates();

        while (candidates.size() > 1) {
            // 현재 후보 중 하나를 제출
            String guess = candidates.get(0);
            String result = submit.apply(Integer.parseInt(guess));

            // 정답이면 바로 반환
            if (result.equals("4S 0B")) {
                return Integer.parseInt(guess);
            }

            // 결과 파싱
            String[] parts = result.split(" ");
            int s = Integer.parseInt(parts[0].replace("S", ""));
            int b = Integer.parseInt(parts[1].replace("B", ""));

            // 모순되는 후보 제거
            List<String> next = new ArrayList<>();
            for (String candidate : candidates) {
                if (isPossible(candidate, guess, s, b)) {
                    next.add(candidate);
                }
            }
            candidates = next;
        }

        // 후보가 하나만 남은 경우
        return Integer.parseInt(candidates.get(0));
    }

    // 가능한 모든 비밀번호 생성 (1~9, 중복 없음)
    private List<String> generateCandidates() {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                for (int k = 1; k <= 9; k++)
                    for (int l = 1; l <= 9; l++) {
                        if (i != j && i != k && i != l &&
                            j != k && j != l &&
                            k != l) {
                            list.add("" + i + j + k + l);
                        }
                    }
        return list;
    }

    // guess 결과가 (sS bB)와 일치하는지 검사
    private boolean isPossible(String candidate, String guess, int s, int b) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 4; i++) {
            if (candidate.charAt(i) == guess.charAt(i)) {
                strike++;
            } else if (candidate.indexOf(guess.charAt(i)) != -1) {
                ball++;
            }
        }

        return strike == s && ball == b;
    }
}