
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

     
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : countMap.keySet()) {
            int freq = countMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

    
        int[] res = new int[k];
        int index = 0;
        for (int freq = buckets.length - 1; freq > 0 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    res[index++] = num;
                    if (index == k) {
                        return res;
                    }
                }
            }
        }

        return res;
    }
}
