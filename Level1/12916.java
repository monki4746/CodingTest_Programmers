class Solution {
    boolean solution(String s) {
        int p=0, y=0;
        boolean answer = true;
        
        s = s.toUpperCase();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='P'){
                p++;
            }else if(s.charAt(i)=='Y'){
                y++;
            }
            answer = p == y ? true:false;
        }
        return answer;
    }
}
