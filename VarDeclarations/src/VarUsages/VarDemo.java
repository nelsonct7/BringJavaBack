package VarUsages;

// LVTI : Local variable type inference
// from Java10 onwards we can declare local variable with out the data type specified
// but instance variables should be declared with type, since they are meant to store some values,
// the local variables are suppose to perform some operations.
/**
 * a class can not be declared as var
 * class var{
 * this will throw error
 * }
 */
class Aliance{
	String name="temp";
}
public class VarDemo {
//	var temp=10; => instance variables should be typed	
	public static void main(String[] args) {
		var var1=5;
		var var2=4;
		var sum = var1+var2;
		System.out.println("Sum of the value is "+sum);
		var var="sample"; // we can use var as a variable. its not a reserved name as variable
//		var temp; => you can not instantiate a variable with var key word with out declaring the value for it
		int nums[]=new int[10];
		// when var is used to declare an array no need to put the [] with the variable
		var nums1=new int[10];
		// we can use var to store a reference object of a class
		var refObj=new Aliance();
		System.out.println("Name in refObj "+refObj.name	);
	}

}
