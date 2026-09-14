class Solution {
    public int[] numberGame(int[] nums) {

        ArrayList<Integer> numsList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            numsList.add(nums[i]);
        }

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        while(numsList.size() >= 2){
            int min_1 = numsList.get(0);

            for(int j = 0; j < numsList.size(); j++){
                if(numsList.get(j) < min_1){
                    min_1 = numsList.get(j);
                }
            }
            
            for(int z = 0; z < numsList.size(); z++){
                if(numsList.get(z) == min_1){
                    numsList.remove(z);
                    break;
                }
            }

            int min_2 = numsList.get(0); 

            for(int i = 0; i < numsList.size(); i++){
                if(numsList.get(i) < min_2){
                    min_2 = numsList.get(i);
                }
            }
            
            for(int k = 0; k < numsList.size(); k++){
                if(numsList.get(k) == min_2){
                    numsList.remove(k);
                    break;
                }
            }
    
            arrList.add(min_2);
            arrList.add(min_1);
        }

        int[] arr = new int[arrList.size()];

        for(int i = 0; i < arrList.size(); i++){
            arr[i] = arrList.get(i);
        }

        return arr;

    }
    
}