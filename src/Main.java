
public class Main {

	public static void main(String [] args) {
		
		
		
	}
	
	public boolean sum28(int[] nums) {
		  
		if(nums.length <= 1) return false;
		int result = 0;
		
		for(int i = 0; i<nums.length; i++) {
			
			if(nums[i] == 2) result = result + 2;
			
		}
		
		if(result == 8) return true;
		return false;
		
	}

	
}
