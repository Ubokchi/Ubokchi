class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder("");
        int[] currentL = {3, 0};
        int[] currentR = {3, 2};
        int L = 0;
        int R = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 1) {
                answer.append("L");
                currentL[0] = (numbers[i] - 1) / 3;
                currentL[1] = 0;
            } else if (numbers[i] % 3 == 0 && numbers[i] != 0) {
                answer.append("R");
                currentR[0] = (numbers[i] - 1) / 3;
                currentR[1] = 2;
            } else {
                L = countHand(currentL, numbers[i]);
                R = countHand(currentR, numbers[i]);
                String check = checkHand(L, R, hand);
                
                answer.append(check);
                
                if (check.equals("R")) {
                    if (numbers[i] == 0) {
                        currentR[0] = 3;
                    } else {
                        currentR[0] = (numbers[i] - 1) / 3;
                    }
                    currentR[1] = 1;
                } else {
                    if (numbers[i] == 0) {
                        currentL[0] = 3;
                    } else {
                        currentL[0] = (numbers[i] - 1) / 3;
                    }
                    currentL[1] = 1;
                }
            }
        }
        
        return answer.toString();
    }
    
    public int countHand(int[] current, int goal) {
        int count = 0;
        int sub = 0;
        
        if (goal == 0) {
            count += 3 - current[0];
        } else {
            sub = current[0] - ((goal - 1) / 3);
            count += (sub > 0) ? sub : (sub * -1);
        }
        
        if (goal == 0) {
            sub = current[1] - 1;
        } else {
            sub = current[1] - (goal % 3 - 1);
        }
        count += (sub > 0) ? sub : (sub * -1);
        
        return count;
    }
    
    public String checkHand(int L, int R, String hand) {
        if (L > R) {
            return "R";
        } else if (L < R) {
            return "L";
        } else {
            if (hand.equals("left")) {
                return "L";
            } else {
                return "R";
            }
        }
    }
}