public class Main
{
	public static void main(String[] args) {
	    int[] nums={2,6,9,1,7,4,5};
	    for(int i=0;i<nums.length;i++){
	        int key=nums[i];
	        int j=i-1;
	        while(j>=0&&nums[j]>key){
	            nums[j+1]=nums[j];
	            j--;
	        }
	        nums[j+1]=key;
	    }
	    for (int i:nums){
	        
		System.out.print(i);
	}
}
}