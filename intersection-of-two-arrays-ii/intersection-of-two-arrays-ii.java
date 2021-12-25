class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(nums1.length >= nums2.length){
            for(Integer key : nums1){
                if(hm.containsKey(key)){
                    hm.put(key,hm.get(key)+1);
                }
                else
                    hm.put(key,1);
            }
            for(Integer key : nums2){
                if(hm.containsKey(key)){
                    if(hm.get(key) > 0){
                        hm.put(key,hm.get(key)-1);
                        arr.add(key);
                    }
                }
            }   
        }
        else{
            for(Integer key : nums2){
                if(hm.containsKey(key)){
                    hm.put(key,hm.get(key)+1);
                }
                else
                    hm.put(key,1);

            }
            for(Integer key : nums1){
                if(hm.containsKey(key)){
                    if(hm.get(key) > 0){
                        hm.put(key,hm.get(key)-1);
                        arr.add(key);
                    }
                }
            }
        }
        return arr.stream().mapToInt(i->i).toArray();
        
    }
}