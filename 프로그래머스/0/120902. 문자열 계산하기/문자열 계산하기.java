class Solution {
    public int solution(String my_string) {
        int answer = 0;
		String[] list = my_string.split(" ");
		
		answer = Integer.parseInt(list[0]);
		for (int i = 1; i < list.length; i += 2) {
			if (list[i].equals("+")) {
				answer += Integer.parseInt(list[i+1]);
			} else if (list[i].equals("-")) {
				answer -= Integer.parseInt(list[i+1]);
			}
		}
		
		return answer;
    }
}