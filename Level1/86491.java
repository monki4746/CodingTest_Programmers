class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        int size;
        
        for(int i=0; i<sizes.length; i++){
            int temp;
        
            for(int j=0; j<2; j++){
                if(sizes[i][0] < sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }

                if(width < sizes[i][0]){
                    width = sizes[i][0];
                }
                if(height < sizes[i][1]){
                    height = sizes[i][1];
                }
            }
        }
        size = width * height;
        
        return size;
    }
}
