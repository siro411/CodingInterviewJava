
public class Find {

	public static void main(String[] args){
    	int tar=7;
    	int [][] arr={{1,2,8,9},{2,4,9,12},{4,8,10,13},{6,8,11,15}};
    	boolean bool=Find(tar,arr);
    	if(bool){
    		System.out.println("found!");
    	}else {
    		System.out.println("not found!");
    	}
        
    }
	
    public static boolean Find(int target, int [][] array) {

    	for(int row=0;row<array.length;row++) {
    		for(int col=array[row].length-1;col>0;col--) {
    			if(target==array[row][col]){
    				return true;
    			}else if(target<array[row][col]){
    				continue;
    			}else {
    				break;
    			}
    		}
    	}
    	return false;
        
    }
    
}
