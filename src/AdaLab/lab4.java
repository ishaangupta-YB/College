package AdaLab;
import java.util.Scanner;
public class lab4 {
      static int lcs( char[] X, char[] Y, int m, int n) {
            int L[][] = new int[m+1][n+1];
            for (int i=0; i<=m; i++) {
                  for (int j=0; j<=n; j++) {
                        if (i == 0 || j == 0) L[i][j] = 0;
                        else if (X[i-1] == Y[j-1]) L[i][j] = L[i-1][j-1] + 1;
                        else L[i][j] = max(L[i-1][j], L[i][j-1]);
                  }
            }
            int index = L[m][n];
            char[] ans = new char[index+1];
            ans[index]='\u0000';
            int i=m,j=n;
            while(i>0 && j>0) {
                  if(X[i-1] == Y[j-1]) {
                        ans[index-1] = X[i-1];
                        i--;
                        j--;
                        index--;
                  }else if (L[i-1][j] > L[i][j-1]) i--;
                  else j--;
            }
            System.out.print("\nLCS String is ");
            for(int k=0;k<ans.length;k++) System.out.print(ans[k]);
            return L[m][n];
      }
      static int max(int a, int b) {
            return (a > b)? a : b;
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 Strings");
            String s1= sc.nextLine();
            String s2= sc.nextLine();
            char[] X=s1.toCharArray(), Y=s2.toCharArray();
            int m = X.length, n = Y.length;
            System.out.println("\nLength of LCS is " +lcs(X,Y,m,n));
      }
}
