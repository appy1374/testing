// import java.util.Scanner;

// public class Test {

//     static int bitwise(int[] ar ,int a, int b){
//         int x= ar[a-1];
//         for(int i=a;i<=b;i++){
//             x ^= ar[i];
//         }
//         return x;
//     }


//      public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int N = in.nextInt();
//         int Q = in.nextInt();
//         int B[] = new int[Q];
//         int A[] = new int[N]; 
//         for(int i=0;i<N; i++)
//         {
//             A[i]= in.nextInt();
//         }
//         for(int i=0; i<Q; i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             B[i]= bitwise(A,a,b);
//         }
//         for(int i=0; i<Q;i++){
//             System.out.println(B[i]);
//         }
//      }
// }
import java.util.Scanner;

public class Test {

    static int bitwise(int[] ar, int a, int b) {
        int x = ar[a - 1];  // Start with the first element in the range
        for (int i = a; i < b; i++) {  // Iterate from a to b-1
            x ^= ar[i];  // Accumulate the XOR
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int[] B = new int[Q];
        int[] A = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        // Process each query
        for (int i = 0; i < Q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            B[i] = bitwise(A, a, b);
        }

        // Print the results
        for (int i = 0; i < Q; i++) {
            System.out.println(B[i]);
        }
        
        in.close(); // Close the scanner
    }
}
