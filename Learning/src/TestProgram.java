
public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enum_Test sref = Enum_Test.NOODLES_CHICKEN;
		System.out.printf ("%s  \n", sref);
		
		
		Enum_Test[] menu = Enum_Test.values();
		for (Enum_Test Enum : menu )
		{
			//System.out.printf ("%s  ", Enum);
			System.out.printf("%s", Enum.toString());
			System.out.println("");
			System.out.printf("%d", Enum.getvalue());
			System.out.println("");
			
		}
			

	}

}
