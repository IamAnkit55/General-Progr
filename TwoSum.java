class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result=0;
      int[] arr = new int[2];
        if(nums.length==0 || nums== null) return arr ;
        
        HashMap <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                arr[1]=i;
                arr[0]=map.get(comp);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
