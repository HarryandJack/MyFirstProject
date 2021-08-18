import java.util.Scanner;
public class ExerciseArray06{
	public static void main(String[]args){
		int[] arr = {12,34,56,7,3,10,55,66,77,88,999,89};
		//输出增加前的
		System.out.print("增加前的数组");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{//最后一个元素不用逗号
				System.out.print(arr[i]);
			}
		}
		//从键盘输入
		System.out.print("需要在第几位插入元素？");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();//在这个指定位置添加元素
		System.out.println("元素是多少？");
		int ele = sc.nextInt();
		//调用方法insertEle
		insertEle(arr,index,ele);
		/*arr[11]=arr[10];
		arr[10]=arr[9];
		arr[9]=arr[8];
		arr[8]=91;
		
		for(int i=arr.length-1;i>=index;i--){
			arr[i]=arr[i-1];
		}
		arr[index-1]=ele;
			
		*/	
		//输出增加元素后的数组
			System.out.print("\n增加后的数组");
			for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.print(arr[i]);
			}
		}
	}
	//提取方法：在哪个位置添加哪个元素
	public static void insertEle(int[] arr,int index,int ele){
			for(int i=arr.length-1;i>=index;i--){
			arr[i]=arr[i-1];
		}
		arr[index-1]=ele;
		}
}