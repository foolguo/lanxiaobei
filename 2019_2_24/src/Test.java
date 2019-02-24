//冒泡排序
/*
public class Test {
    public static void main(String[] args) {
        int[] array=new int[]{5,3,1,4,7};
        int flag=0;
        for(int i=0;i<array.length;i++){
            int temp=0;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
*/

//选择排序

/*
public class Test{
    public static void main(String[] args) {
        int[] array=new int[]{1,5,2,6,3};
        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        for(int i:array){
            System.out.print(i+"、");
        }
    }
}*/
//插入排序
/*
public class Test{
    public static void main(String[] args) {
        int[] array=new int[]{1,5,2,6,3};
        for(int i=1;i<array.length;i++){
            int j=i;
            if(array[i]<array[i-1]){
                int temp=array[i];
                while(j>0&&temp<array[j-1]){
                    array[j]=array[j-1];
                    j--;
                }
                array[j]=temp;
            }
        }
        for(int i:array){
            System.out.print(i+"、");
        }
    }
}*/
