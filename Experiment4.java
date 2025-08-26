import java.util.Scanner;
public class Experiment4 {
    public static int lcs(String str1 , String str2){
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int [m+1][n+1];
        for(int i = 0 ; i < m+1 ;i++){
            for(int j = 0 ; j < n+1 ; j++ ){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < m+1 ; i++ ){
            for(int j = 1 ; j < n+1 ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter first string");
        String str1 = scnr.nextLine();
        System.out.println("Please enter second string");
        String str2 = scnr.nextLine();
        System.out.println("Length of LCS : "+lcs(str1,str2));
    }
}
