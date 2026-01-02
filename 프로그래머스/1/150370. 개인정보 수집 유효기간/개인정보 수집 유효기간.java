import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] strArr = terms[i].split(" ");
            
            map.put(strArr[0], Integer.parseInt(strArr[1]));
        }

        String[] date = new String[privacies.length];
        String[] pType = new String[privacies.length];

        for (int i = 0; i < privacies.length; i++) {
            String[] strArr = privacies[i].split(" ");
            
            date[i] = strArr[0];
            pType[i] = strArr[1];
        }
        
        String[] nowTemp = today.split("\\.");
        int nowYear = Integer.parseInt(nowTemp[0]);
        int nowMonth = Integer.parseInt(nowTemp[1]);
        int nowDay = Integer.parseInt(nowTemp[2]);
        
        int todayVal = (nowYear * 12 * 28) + (nowMonth * 28) + nowDay;
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] temp = date[i].split("\\.");
            int year = Integer.parseInt(temp[0]);
            int month = Integer.parseInt(temp[1]);
            int day = Integer.parseInt(temp[2]);
            
            int passTime = map.get(pType[i]);
            
            int start = (year * 12 * 28) + (month * 28) + day;
            int expire = start + (passTime * 28) - 1;

            if (todayVal > expire) {
                list.add(i + 1);
            }       
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}