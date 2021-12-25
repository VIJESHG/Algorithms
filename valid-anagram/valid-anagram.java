class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        if(s.length() != t.length())
            return false;
        for(int i =0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        for(int j=0; j < t.length(); j++){
            if(hm.containsKey(t.charAt(j))){
                hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
                if(hm.get(t.charAt(j)) < 0)
                    return false;
            }
            else{
                return false;
            }
                
        }
        return true;
    }
}