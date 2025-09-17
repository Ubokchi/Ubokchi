class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (String[] account : db) {
            String dbId = account[0];
            String dbPw = account[1];

            if (dbId.equals(inputId)) {
                if (dbPw.equals(inputPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}