import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("輸入範圍");
        int num=0;
        num=sc.nextInt();
        

        int idx=0;
        int arr[]=new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        idx=num-1;
        while(idx>=0){
            System.out.printf("arr[%d]:%d\n",idx,arr[idx]);
            idx--;
        }
      
    }
}
