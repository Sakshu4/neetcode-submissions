class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer>PrevMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(PrevMap.containsKey(diff)){
                return new int []{PrevMap.get(diff),i};
            }
            else{
                PrevMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
