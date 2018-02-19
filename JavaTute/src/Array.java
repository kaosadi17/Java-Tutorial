
public class Array {

	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		
		for(int i=0; i< array1.length; i++){
			System.out.println(array1[i]);
		}
		
		//enhanced for loop 
		
		for(int num: array1){
			System.out.println(num);
		}
		
		/* - you can't do modification using enhanced for loop
		 * because it doesn't support positioning
		 */

	}

}
