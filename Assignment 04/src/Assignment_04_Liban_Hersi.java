public class Assignment_04_Liban_Hersi 
{
	public static void main(String[] args) 
	{
		int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Even numbers are: ");
		for(int index = 0; index < values.length; index++) {
			    if(values[index] % 2 == 0){         
			        System.out.print(values[index] + " ");
			    }
		}
		System.out.println(); // newline after loop
		System.out.println("Program by Liban Hersi Here");
	}
}
