class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int minCost = triangle.get(0).get(0);
        int height = triangle.size();
        for(int i = 1; i < height; i++){
            int currMinCost = Integer.MAX_VALUE;
            int rows = triangle.get(i).size();
            for(int j = 0; j < rows; j++){
                if(j != 0 && j != rows-1)
                    triangle.get(i).set(j,triangle.get(i).get(j)+(Integer)Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1)));
                else if(j != 0 && j == rows-1)
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                else{
                    triangle.get(i).set(j,triangle.get(i).get(j)+triangle.get(i-1).get(j));
                }
                if(triangle.get(i).get(j) < currMinCost){
                    currMinCost = triangle.get(i).get(j);
                }
            }
            minCost = currMinCost;
        }
        return minCost;
    }
}