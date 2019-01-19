
import java.util.Scanner;
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String[] time=new String[]{"zero","one","two","three","four","five","six","seven","eight",
//        "nine","ten","eleven","twelve","thirdteen","fourteen","fifteen","sixteen","siventeen",
//        "eighteen","nineteen","twenty","thirty","forty","fifty"};
//        int h=scanner.nextInt();
//        if(h>=24){
//            h=scanner.nextInt();
//        }
//        int f=scanner.nextInt();
//        if(f>=60){
//            f=scanner.nextInt();
//        }
//        printTime(time,h,f);
//    }
//    public static void printTime(String[] time,int h,int f){
//        if(h<=20) {
//            System.out.print(time[h]+" ");
//        }else{
//            System.out.print(time[20]+" "+time[h-20]+" ");
//        }
//        if(f<=20){
//            System.out.print(time[f]);
//        }else if(f==30||f==40||f==50){
//            System.out.print(time[20+(f/10-2)]);
//        }else
//            {
//            switch(f/10){
//                case 2:
//                    System.out.print(time[20]+" "+time[f-20]);
//                    break;
//                case 3:
//                    System.out.print(time[20+(f/10-2)]+" "+time[f-30]);
//                    break;
//                case 4:
//                    System.out.print(time[20+(f/10-2)]+" "+time[f-40]);
//                    break;
//                case 5:
//                    System.out.print(time[20+(f/10-2)]+" "+time[f-50]);
//                    break;
//            }
//        }
//
//    }
//}

//public class Test{
//    public static int s=0;
//    public static int m=0;
//    public static int n=0;
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int r=scanner.nextInt();
//        int c=scanner.nextInt();
//        int[][] data=new int[r][c];
//        //  4次循环取数
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                data[i][j]=scanner.nextInt();
//            }
//        }
//        for(int i=0;i<r-1;i++){
//            System.out.print(data[i][0]+" ");
//        }
//        for(int i=0;i<c-1;i++){
//            System.out.print(data[r-1][i]+" ");
//        }
//        for(int i=r-1;i>=1;i--){
//            System.out.print(data[i][c-1]+" ");
//        }
//        for(int i=c-1;i>=1;i--){
//            System.out.print(data[0][i]+" ");
//        }
//    }
//}

//龟兔赛跑 ：
//兔子速度v1  超过乌龟t,休息s秒
//乌龟速度v2
//赛道长度l
//public class Test{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int v1=scanner.nextInt(),v2=scanner.nextInt(),t=scanner.nextInt(),s=scanner.nextInt(),l=scanner.nextInt();
//        int s1=0,s2=0,count=0;
//        while(s1<l&&s2<l){
//            s1+=v1;
//            s2+=v2;
//            if(s1==l||s2==l)break;
//            if(s1-s2>t){
//                s1-=v1*s;
//            }
//        }
//        if(s1>s2){
//            System.out.println("R");
//            System.out.println(l/v1+count*t);
//        }else if(s1<s2){
//            System.out.println("T");
//            System.out.println(l/v2);
//        }else if(s1==s2){
//            System.out.println("D");
//            System.out.println(l/v2);
//        }
//    }
//}















