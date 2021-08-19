
public class DemoArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int number[]={55,40,8,65,41}; //declare
		 
				    
		        for(int i=0;i<number.length;i++)
		            {
		                 // System.out.println("outer for"+i);
		         for(int j=i+1;j<number.length;j++)
		             {
		                   // System.out.println("inner for "+j);
		 
		 //  System.out.println(  "if("+number[i]+" > "+number[j]+")");
		             if(number[i] > number[j])
		              {
		// System.out.println(" int temp="+number[i]);
		         int temp=number[i];
		       //   System.out.println("temp :"+temp);
		  
		// System.out.println(number[i]+"="+number[j]);
		          number[i]=number[j];  // replace value
		      
		// System.out.println( number[j]+"="+temp);
		               number[j]=temp;
		       
		              } // end of if
		        }  // end of inner for
		            }  // end of outer for

		           System.out.println("sorted list");
		            for(int i=0;i<number.length;i++)
		             {
		            System.out.println("values are :"+number[i]);
		              }

		
		
	}

}
