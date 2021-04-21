package JavaBased;

import java.lang.reflect.Array;

public class ArrayMin {
    int[] list = new int[5];

    //为数组赋随机值
    public void CreateArray() {
        for(int i = 0; i < this.list.length; i++) {
            this.list[i] = (int)(Math.random() * 100);
        }
    }

    //显示整个数组
    public void ShowList() {
        System.out.print("list =");
        for (int i : list) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    //数组最小值
    public void listMin() {
        int minItem = list[0];
        for(int i=1; i< list.length; i++){
            if(list[i] < minItem) {
                minItem = list[i];
            }
        }
        System.out.print("list最小值：" + minItem); //打印最小值
    }

    public static void main(String[] args) {
        ArrayMin arrayMin = new ArrayMin();
        arrayMin.CreateArray();
        arrayMin.ShowList();
        arrayMin.listMin();
    }

}
