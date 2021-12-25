class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        String result = "";
        if(strs.length == 1)
            return strs[0];
        for(String str : strs){
            if(minLen > str.length())
                minLen = str.length();
        }
        boolean matching = false;
        for(int i =0; i < minLen; i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j-1].charAt(i) == strs[j].charAt(i))
                    matching = true;
                else{
                    matching = false;
                    break;
                }
                    
            }
            if(matching)
                result = result+strs[0].charAt(i);
            else
                break;
        }
        return result;
    }
}