import java.util.Arrays;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		// float or double for numbers with decimals. E.g. 5.69;
		String website = "Spre Rasarit";
		char letter = 'r';
		boolean myCard = true;
		
        //System.out.println(myNum);
        //System.out.println(website);
        //System.out.println(letter);
        //System.out.println(myCard);
    	//System.out.println(myNum + " is the value stored in the myNum variable" );
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 6;
		arr[3] = 5;
		arr[4] = 9;
		
//		int[] arr2 = {1, 3, 4, 5, 6, 88, 2324, 42, 1};
		
		// for loop
//		for (int i = 0; i < arr.length; i ++ ) {
//			System.out.println(arr[i]);
//		};
//		
//		for (int i = 0; i < arr2.length; i ++ ) {
//			System.out.println(arr2[i]);
//		};
//		
		String[] name = {"Marian", "Dandarila", "relucu"};
//		
//		for (int i = 0; i < name.length; i++ ) {
//			System.out.println(Arrays.toString(name));
//		}
		
		
		for (String s: name) {
			System.out.println(s);
		}
		
		
	}

}
