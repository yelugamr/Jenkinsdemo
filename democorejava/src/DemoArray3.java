import java.io.*;
public class DemoArray3 {
	
	
	
	public String[][] getTeam(int row) throws IOException
	{
		String team[][] = new String[row][];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i<row;i++)
		{
			System.out.println("enter no of cols for row "+i);
			
			int col = Integer.parseInt(br.readLine().trim());
			
			team[i] = new String[col]; // initialize array
			
		}  
		
		for(int r=0;r<team.length;r++)
		{
			for(int c=0;c<team[r].length;c++)
			{
				System.out.println("enter name to arraay");
				team[r][c] = br.readLine().trim(); // adding values to array
			}
		}
		return team;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
DemoArray3 a = new DemoArray3();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no of row");

int row = Integer.parseInt(br.readLine().trim());


String res[][] = a.getTeam(row) ;

// retrive

for(int r=0;r<res.length;r++)
{
	for(int c=0;c<res[r].length;c++)
	{
		System.out.print(res[r][c]+" "); // getting values
		
	}
	System.out.println();
}

	}

}
