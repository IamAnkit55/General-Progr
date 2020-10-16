class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length==0 || nums==null)  return -1;
        int result=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],2);
            }  
        }
        for(int num:nums){
           if (map.get(num)==1)
               result=num;
        }    
   return result;     
    }
}
