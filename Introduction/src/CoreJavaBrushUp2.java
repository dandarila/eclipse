import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1, 2, 4, 5, 6, 6, 7, 90};
		for (int i = 0; i < arr2.length; i ++ ) {
			if (arr2[i] % 2 == 0) { 
				System.out.println(arr2[i]);
				break;
			} else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		ArrayList <String> a = new ArrayList<String>();
		//create object if the class - object.method
		a.add("Marian");
		a.add("Gyuri");
		a.add("12");
		//a.remove(index);
		//a.get(index);
		
		System.out.println(a.get(1));
	}
}
