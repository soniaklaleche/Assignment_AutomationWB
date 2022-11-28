package java_session_30october;

public class Two_dimensional_Arrays {

	public static void main(String[] args) {
		
		
		int[][] a;//please use this way

		int[] []a1;
		int a2[][];
		int[] a3[] ;
		
		
		//creation

		int [][]a11=new int[2][3];
		
		//initialise
		
		int[][]a10=new int [3][4];

		a11[0][0]=101;
		a11[0][1]=202;
		a11[0][2]=303;
		a11[0][3]=404;
		
		a11[1][0]=501;
		a11[1][1]=602;
		a11[1][2]=703;
		a11[1][3]=804;
		
		a11[2][0]=101;
		a11[2][1]=202;
		a11[2][2]=303;
		a11[2][3]=404;
	
		      
		
		int[][]a12= { {1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int[][]a13= { {1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
		
		
		//int[][] a14 = new int[][] { {10,20,30,40},{10,20,30,40},{10,20,30,40}};
		
		
		//retrieve
		int[][]a15= { {1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for(int i=0;i<a15.length;i++) {
			for(int j=0;j<a15[i].length;j++) {
				System.out.print(a15[i][j]+ "");
			}
				System.out.println();
			}
		}
		
	}



