/**
 * 问题描述
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 * 5 7
 *
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 */

//思路  1.先输入，确定初始字符串
    //  第一个数字说明回转几次
    //实际上是一个连续向右回转的问题
//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        char[] data=new char[m];
//        init(data);
//
//        for(int i=0;i<n;i++) {
//            resver(data, i, m);
//        }
//    }
//    public static char[] init(char[] data){
//        for(int i=0;i<data.length;i++){
//            data[i]=(char)(65+i);
//        }
//        return data;
//    }
//
//    public static void resver(char[] data,int count,int m){
//        char[] temp=new char[m];
//        int n=count;
//        int i=0;
////        System.out.println(data.length);
//        for(i=0;i<temp.length-n;i++){
//            temp[i]=data[count];
//            count++;
//        }
//        for(int j=0;j<n;j++){
//            temp[i]=data[j];
//            i++;
//        }
//        for(char j:temp){
//            System.out.print(j);
//        }
//        System.out.println();
//
//    }
//
//}

/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几
 */
//public class Test{
//    public static void main(String[] args) {
//        for(int a=0;a<=1;a++){
//            for(int b=0;b<=1;b++){
//                for(int c=0;c<=1;c++){
//                    for(int d=0;d<=1;d++){
//                        for(int f=0;f<=1;f++){
//                            System.out.println(a+" "+b+" "+c+" "+d+" "+f);
//                        }
//                    }
//                }
//            }
//        }
//    }
//}

/***
 * 判断是不是闰年
 */
import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int y=scanner.nextInt();
//        if(leapYear(y)){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    }
//    public static boolean leapYear(int y){
//        return (y%4==0)&&(y%100!=0)||(y%400==0);
//    }
//}
/***
 * 阶乘计算
 */
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        System.out.println(jieC(n));
//    }
//    public static long jieC(int n){
//        if(n==1){
//            return 1L;
//        }else{
//            return n*jieC(n-1);
//        }
//
//    }
//}

    //  输入那字符串接收
    //分解成字符串
    //反向存储
    //进行相加

public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        char[] num1=str1.toCharArray();
        char[] num2= str1.toCharArray();
        char[] n1=new char[100];
        char[] n2=new char[100];
        char[] sum=new char[101];
        int i=0,j=0;
        resver(num1);
        resver(num2);
        if(num1.length>num2.length){
            n2=java.util.Arrays.copyOf(num2,num1.length);
            for(i=num2.length;i<num1.length;i++){
                n1[i]='0';
            }
        }else{
            n2=java.util.Arrays.copyOf(num1,num2.length);
            for(i=num1.length;i<num2.length;i++){
                n2[i]='0';
            }
        }
        Add(n1,n2,sum);
    }
    public static void resver(char[] data){
        int i=0,j=0;
        for(i=0,j=data.length-1;i<j;i++,j--){
            char tmp=data[i];
            data[i]=data[j];
            data[j]=tmp;
        }

    }
    public static void Add(char[] n1,char[] n2,char[] sum){
        int i=0;
        int count=0;
        int tmp=0;
        for(i=0;i<n1.length;i--){
            tmp=n1[i]+n2[i];
            sum[i]=(char)(48+((tmp-96)%10));

        }
        resver(sum);
        for(char j:sum){
            System.out.println(j);
        }
    }
}
