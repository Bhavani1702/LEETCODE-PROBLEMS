class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int lt = 0;
        int t = 0;
        for(int i = 0;i < n;i++){
            if(nums[i] < target){
                lt++;
            }
            if(nums[i] == target){
                t++;
            }
        }
        ArrayList<Integer> val = new ArrayList<>();
        for(int i = 0; i < t;i++){
            val.add(lt+i);
        }
        return val;
        
    }
}