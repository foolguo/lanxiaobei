/**
 * 给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。
 * 现在要向棋盘中放入n个黑皇后和n个白皇后，使任意的两个黑皇后都不在同一行、
 * 同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或同一条对角线上。
 * 问总共有多少种放法？n小于等于8
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] data=new int[n][n];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                data[i][j]=scanner.nextInt();
            }
        }
        ifPut(data,n);
    }
    public static void ifPut(int[][] data,int n){
        int r=0,c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;i++){


            }
        }

    }
}
