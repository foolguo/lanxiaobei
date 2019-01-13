/**
 *
 * 问题描述
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * 输入格式
 * 输入包含一个整数n。
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 * 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可,
 * 而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，
 * 直接计算余数往往比先算出原数再取余简单。
 */


//import java.util.Scanner;
//public class Test {
//    public static final int N=10007;
//    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        int n=scanner.nextInt();
//        System.out.println(result(n));
//    }
//    public static int result(int n){
//
//        return fabonacci(n)%N;
//    }
//    public static int fabonacci(int n){
//        int f1=1,f2=1;
//        if(n==1||n==2){
//            return 1;
//        }
//        for(int i=3;i<=n;i++){
//            int m=f2;
//            f2=f1+f2;
//            f1=m;
//        }
//        return f2;
//    }
//}

/**
 * 问题描述
 * 给定圆的半径r，求圆的面积。
 * 输入格式
 * 输入包含一个整数r，表示圆的半径。
 * 输出格式
 * 输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
 * 说明：在本题中，输入是一个整数，但是输出是一个实数。
 * 对于实数输出的问题，请一定看清楚实数输出的要求，比如本题中要求保留小数点后7位，
 * 则你的程序必须严格的输出7位小数，输出过多或者过少的小数位数都是不行的，都会被认为错误。
 * 实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。
 *
 *
 * 本题对精度要求较高，请注意π的值应该取较精确的值。你可以使用常量来表示π，
 * 比如PI=3.14159265358979323，也可以使用数学公式来求π，比如PI=atan(1.0)*4。
 */

//import  java.util.Scanner;
//class Cirle{
//    public static final double PI=3.14159265358979323;
//    private int radius;
//    public double area;
//    public Cirle(int radius){
//        this.radius=radius;
//    }
//    public double area(){
//        this.area=PI*(this.radius*this.radius);
//        return this.area;
//    }
//
//}
//public class Test{
//    public static final double PI=3.14159265358979323;
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int r=scanner.nextInt();
//        Cirle cirle=new Cirle(r);
//        String result = String.format("%.7f", cirle.area());
//        System.out.println(result);
//    }
//}


/**
 * 问题描述
 * 求1+2+3+...+n的值。

 */
//import  java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        System.out.println(print(n));
//    }
//    public static int print(int n){
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        return sum;
//    }
//}

import java.util.Scanner;

/**
 * 输入A、B，输出A+B。
 * 说明：在“问题描述”这部分，会给出试题的意思，以及所要求的目标。
 */
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt(),b=scanner.nextInt();
//        System.out.println((a+b));
//
//    }
//}

/**
 * 问题描述
 * 　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * 输入格式
 * 　　第一行为一个整数n。
 * 　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
 * 输出格式
 * 　　输出一行，按从小到大的顺序输出排序后的数列。
 */

//import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int[] data=new int[n];
//        for(int i=0;i<data.length;i++){
//            data[i]=scanner.nextInt();
//        }
//        print(sort(data));
//
//    }
//    public static int[] sort(int[] data){
//        for(int i=0;i<data.length;i++){
//            for(int j=i+1;j<data.length;j++){
//                if(data[i]>data[j]){
//                    int temp=data[i];
//                    data[i]=data[j];
//                    data[j]=temp;
//                }
//            }
//        }
//        return data;
//    }
//    public static void print(int[] data){
//        for(int i:data) {
//            System.out.print(i + " ");
//        }
//    }
//}