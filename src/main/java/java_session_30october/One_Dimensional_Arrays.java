package java_session_30october;

public class One_Dimensional_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		//Declaration
		int[] a;// this is the most popular Arrays
		int a1[];
		int []a2;
		int[]a3;
		//[] this dimension is declared before the variable and comma is used and another variable is declared _the both variables can use this dimmension
		
		//[]this dimension is declared after the variable and comma is used  _the other variables can not use this dimmension
		
		int[] a4, b4;//both a4 and b4 are 1_d
		int []a5,b5;//both are 1D arrays
		int a6[],b6;//a6 is 1D arrays and b6 is a variable
		
		
		
		//Creation
		//int []a8=new int [3];
		//int []a9=new int [-1];//Negative Arrays size Exception
		//System.out.println(a9.length);
		
		//Initialization how we put some value in this memory space
		
		int []a11=new int[4];

		a11[0]=123;
		a11[1]=124;
		a11[2]=125;
		a11[3]=126;
		
		System.out.println(a11.length);
		
		
		
		//Retrieve
    int []a14= {777,888,999,444,555,333,222,111,666};


   for(int i=0; i<a14.length;i++) {
	
	
	System.out.println(a14[i]+"");
}
	}

}
