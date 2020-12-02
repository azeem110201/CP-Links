/// all negative to one side and all positive to other sides


class NegPos{
	
	public static int[] NegPosFunc(int[] nums){
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right){
			
			if(nums[left] < 0 && nums[right] < 0){
				left++;
			}
			else if(nums[left] > 0 && nums[right] > 0){
				right--;
			}
			else if(nums[left] > 0 && nums[right] < 0){
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
			else{
				left++;right--;
			}
		}
		
		return nums;
		
		
	}
    public static void main(String args[]){
	
	    int[] nums = new int[]{-12, -11, -13, -5, 6, -7, -5, 3, -6};
		
		int[] nums_2 = new int[nums.length];
		
		nums_2 = NegPosFunc(nums);
		
		for(int i = 0; i < nums_2.length; i++){
			System.out.print(nums_2[i] + " ");
		}
	}
}