/**
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 */
import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) throws Exception {
//       Scanner scanner=new Scanner(System.in);
//       int n=scanner.nextInt();
//       String[] str=new String[n];
//       for(int i=0;i<=n;i++){
//           str[i]=scanner.nextLine();
//           System.out.println(Integer.parseInt(str[i],16));
//       }
//       for(int j=0;j<n;j++){
//            System.out.println(Integer.parseInt(str[j],8));
//        }
//
//
//    }

//    public static void main(String[] args)throws Exception {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("\n请输入一个16进制数:");
//
//        String str = sc.next();
//
//        int n = Integer.parseInt(str, 16);
//
//        System.out.println("输入 " + str + "，转换成整数是  " + n);
//    }
//}

/**
 * 153是一个非常特殊的数，它等于它的每位数字的立方和
 * 即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 */
//public class Test{
//    public static void main(String[] args) {
//        for(int i=100;i<1000;i++){
//            if(findNum(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean findNum(int n){
//        int temp=n,sum=0;
//        while(temp>0){
//            sum+=(temp%10)*(temp%10)*(temp%10);
//            temp/=10;
//        }
//        if(sum==n){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
//}

/**
 *  杨辉三角，不输出空格
 */
import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int[][] data=new int[n][n];
//        for(int i=0;i<n;i++){
//            data[i][0]=1;
//            data[i][i]=1;
//            for(int j=1;j<i;j++){
//                    data[i][j]=data[i-1][j-1]+data[i-1][j];
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.println("\n");
//            for(int j=0;j<=i;j++){
//                System.out.print(data[i][j]+" ");
//
//            }
//
//        }
//    }
//}

//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int[] data=new int[n];
//        for(int i=0;i<data.length;i++){
//            data[i]=scanner.nextInt();
//        }
//        int key=scanner.nextInt();
//        System.out.println(findNum(data,key));
//    }
//    public static int findNum(int[] data,int key){
//        for(int i=0;i<data.length;i++){
//            if(data[i]==key){
//                return i+1;
//            }
//        }
//        return -1;
//    }
//}

public class  Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] data=new int[n];
        for(int i=0;i<data.length;i++){
            data[i]=scanner.nextInt();
        }
        System.out.println(maxVaule(data));
        System.out.println(minVaule(data));
    }
    public static int maxVaule(int[] data){
        int max=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }

    public static int minVaule(int[] data){
        int min=data[0];
        for(int i=1;i<data.length;i++){
            if(data[i]<min){
                min=data[i];
            }
        }
        return min;
    }
}