package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public List<List<Integer>> permute(int[] nums) {
	    List<List<Integer>> finalresults = new ArrayList<List<Integer>>();
	    List<Integer> result = new ArrayList<>();
	    
	    if (nums.length == 0) { //int[] is an array class 
	        return finalresults;
	    }
	    
	    subset(nums, result, finalresults);
	    System.out.println(finalresults);
	    return finalresults;
	}

	public void subset(int[] nums, List<Integer> each, List<List<Integer>> finals) {
	    if ( each.size()== nums.length) {
	        List<Integer> temp = new ArrayList<>(each); //creates a new arraylist and list ensure to use linkedlist later
	        finals.add(temp);//add a new list of 'each'           // since it is list, it can only use the methods in list
	    }                                                 // type casting ArrayList<Integer> arrayList = (ArrayList<Integer>) list;
	    							// initialization: List<String> list = Arrays.asList(new String[]{"foo", "bar"});
	                                                      //List<List<Integer>> list = new LinkedList<List<Integer>>(); parameter in generic type must be the same
	    									
	    
	    for (int i=0; i<nums.length; i++) {  
	        if (!each.contains(nums[i])) {
	            each.add(nums[i]);//put number to the list
	            subset(nums, each, finals); //recursion to add number from num one by one
	            each.remove(each.size() - 1);
	        }
	    }
	}
	
	public static void main(String[] args) {
		Permutation p = new Permutation();
		int[] nums= {10,11,12,15};
		p.permute(nums);
	}
	
	
	
}
