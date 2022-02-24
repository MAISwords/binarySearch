//二分查找法
//T.aoyan 2022-2-24
public class Starter {
    public static void main(String[] args) {
        //定义一个数组
        int[] a1 = {0,1,2,3,4,5,6,7,8};
        int[] a2 = {0,1,2,3,4,5,6,7,8,9};
        //定义要找的数
        int b1 = 3;
        int b2 = 8;
        System.out.println(b1+"在第"+binarySearch(a1,b1)+"个位置！");
        System.out.println(b1+"在第"+binarySearch(a2,b2)+"个位置！");
    }
    //二分查找算法,传入数组索引和要找的数，返回要找的数的索引，如果没有找到返回-1
    public static int binarySearch(int[] a,int num){
        //定义2个下标，用于表示数组边界和中间值
        int low = 0;
        int high = a.length - 1;
        //开始查找，最后一次判断要找的值是否在low和high的下标重叠处
        while(low <= high){
            //向右边带符号右移动一位，表示除以2。这样写让计算机跑地更快
            int middle = (high + low) >>> 1;
            //如果下标middle对应的元素刚好是我们要找的元素，返回下标
            if(a[middle] == num){return middle;}
            //如果下标middle对应的元素大于我们要找的元素，让数组右边界值调到middle-1处
            else if(a[middle] > num){high = middle - 1;}
            //如果下标middle对应的元素小于我们要找的元素，让数组左边界值调到middle+1处
            else{low = middle + 1;}
        }
        //找完了都没有找到，说明该元素不存在
        return -1;
    }
}
