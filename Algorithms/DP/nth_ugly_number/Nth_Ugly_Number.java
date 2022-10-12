import java.util.Scanner;
  
class Nth_Ugly_Number { 
    /* Function to get the nth ugly number*/
    public static int getugly(int n) { 
        int ugly[] = new int[n];  // To store ugly numbers 
        int i2 = 0, i3 = 0, i5 = 0; 
        int multi2 = 2;
        int multi3 = 3;
        int multi5 = 5; 
        int next_ugly = 1; 
          
        ugly[0] = 1; 
          
        for(int i = 1; i < n; i++) { 
            next_ugly = Math.min(multi2, Math.min(multi3,multi5)); 
            ugly[i] = next_ugly; 
            if (next_ugly == multi2) { 
               i2 = i2+1; 
               multi2 = ugly[i2]*2; 
            } 
            if (next_ugly == multi3) { 
               i3 = i3+1; 
               multi3 = ugly[i3]*3; 
            } 
            if (next_ugly == multi5) { 
               i5 = i5+1; 
              multi5= ugly[i5]*5; 
            } 
        } //End for loop
        return next_ugly; 
    }// End "get ugly" method
  
    
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The ugly number is, " + getugly(num)); 
        sc.close();
    }// End main method 
} //End class
