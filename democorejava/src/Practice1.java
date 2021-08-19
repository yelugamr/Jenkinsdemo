

public class Practice1 {

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    StringBuffer a = new StringBuffer("Java programming is   fun");
	     System.out.println(a.reverse());
		 
	     //printing the specific letter from the given string
	     
		
		int a3=251425;
		
		int lengthOfInt = String.valueOf(a3).length();
		System.out.println("The value of the string " +lengthOfInt);
	/*
		 int rows = 5;

		    for (int i = 1; i <= rows; ++i)
		    {
		      for (int j = 1; j <= i; ++j) 
		      {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }*/
		    
		    
		   
		   
		    for (int i=1;i<=5;i++)
		    {
		    	for (int j=1;j<=i;j++)
		    	{
		    		System.out.print("* ");
		 		   
		    	}
		    	   System.out.println();
		    		 }
		 
		    
		    
		    
		    int a1[]={1,2,5,6,3,20,21,32,59,25,99,100};  
		    System.out.println("Odd Numbers:");  
		    for(int i=0;i<a1.length;i++){  
		    if(a1[i]%2!=0){  
		    System.out.println(a1[i]);  
		    }  
		    }  
		    System.out.println("Even Numbers:");  
		    for(int i=0;i<a1.length;i++){  
		    if(a1[i]%2==0){  
		    System.out.println(a1[i]);  
		    }  
		    }  
		    
		    
		    
		    String str = "this is java code";
	        String words[]=str.split("\\s");
	        String capitalizeStr="";
	 
	        for(String word:words){
	            // Capitalize first letter
	            String firstLetter=word.substring(0,1);
	            // Get remaining letter
	            String remainingLetters=word.substring(1);
	            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
	        }
	        System.out.println(capitalizeStr);
		    
	        
	    
	        
	        
		    }
		    

		  }


