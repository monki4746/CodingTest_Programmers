class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] arr = str.split("");
        
        int sum = 0;
        
        for(String num: arr) {
            sum += Integer.parseInt(num);
        }
        return (x % sum ==0? true : false);
    }
}
