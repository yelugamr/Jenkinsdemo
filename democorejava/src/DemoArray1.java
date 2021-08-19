
public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// single dimention - long way
	
		int numbers[] = new int[4]; // initialization  3 is size
		
		numbers[0] = 34;  // store 
		numbers[1] = 22;
		numbers[2] = 65;
		numbers[3] = 5;
		/*
		// short way
		int numbers[] = {34,22,65};  // store
		*/
				
		//int size = numbers.length; // length is operator 
		
		for(int i = 0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);  // retrival

		}
		
		String team[] = new String[2];
		team[0] = "parag";
		team[1] = "piyush";
		
		for(int i = 0;i<team.length;i++)
		{
			System.out.println(team[i]);  // retrival

		}

		
	}

}
