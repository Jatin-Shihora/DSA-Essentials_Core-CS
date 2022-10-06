public class Matriceaddsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int A[][]= {{3,5,9},{7,6,2},{4,3,5}};
 int B[][]= {{1,5,2},{6,8,4},{3,9,7}};
 int C[][]=new int[3][3];
 int D[][]=new int[3][3];
 //Addition
 for(int i=0;i<A.length;i++) {
	 for(int j=0;j<A.length;j++) {
		 C[i][j]=A[i][j]+B[i][j];
	 }
 }
 
 for(int x[]:C) {
	 for(int y :x) {
		 System.out.print(y+" ");
	 }
	 System.out.println(" ");
 }
 // Subtraction
 
 for(int i=0;i<A.length;i++) {               
	 for(int j=0;j<A.length;j++) {
		 D[i][j]=A[i][j]-B[i][j];
	 }
 }
 
 for(int x[]:D) {
	 for(int y :x) {
		 System.out.print(y+" ");
	 }
	 System.out.println(" ");
 }
 
 
	}

}
