import java.util.Arrays;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		d.getData();
		// TODO Auto-generated method stub
		
		//strings are an object in JAVA 
				
		//string literal
		String myName = "Marian Dandarila";
		
		//using new keyword
		String b = new String("helllooooo");
		
		System.out.println(myName);
		
		String myNames = "Marian Dandarila boss";
		String[] splittedString = myNames.split(" ");
		
		for (int i = myName.length()-1; i >= 0; i--) {
			System.out.println(myName.charAt(i));
		}
		//System.out.println(Arrays.toString(splittedString));
		
		//trim - to remove spaces, 
		//split 
	}

}
