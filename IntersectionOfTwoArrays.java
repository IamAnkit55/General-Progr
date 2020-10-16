class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<nums2.length;j++){
            if(set.contains(nums2[j])){
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int result[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
