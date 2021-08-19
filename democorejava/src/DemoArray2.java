
public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// long way
		/*
		char ch[][] = new char[2][3]; // 2 rows 3 cols
		
		ch[0][0] = 'a';  // storing
		ch[0][1] = 'b';
		ch[0][2] = 'c';
		
		ch[1][0] = 'd';
		ch[1][1] = 'e';
		ch[1][2] = 'f';
		*/
		
		// short way
		char ch[][] = {{'a','b','c'},{'d','e','f'}};
		// retrive
		
		/*
		System.out.println(ch[1][1]);
		
		int rowsize = ch.length; // 2 rows
		System.out.println(rowsize);
		
		int colsizerow0 = ch[0].length;  // 3 cols in row0
		
		System.out.println(colsizerow0);
		
int colsizerow1 = ch[1].length;  // 3 cols in row0
		
		System.out.println(colsizerow1);
		*/
		
		for(int row=0;row < ch.length;row++)
		{
			for(int col=0;col < ch[row].length;col++)
			{
				System.out.print(ch[row][col]+" ");
				
			}
System.out.println();
		}
		
	}

}
