import java.util.Arrays;

public class QuickSortForString {
    public static void main(String[] args) {
        String [] arr = {"shahvez","shah jahan","khasif"};
        sort(arr,0, arr.length-1);
        printArray(arr);
        String name = "Sukkur IBA University";
        System.out.println(name.toLowerCase());
    }
    public static void sort(String [] arr,int low,int high){
        if(low >= high){
            return;
        }
        int si = low;
        int ei = high;
        int mi = si + (ei - si) / 2;
        String pivot = arr[mi];
        while(si <= ei){
            while (arr[si].compareTo(pivot) < 0){
                si++;
            }
            while (arr[ei].compareTo(pivot) > 0){
                ei--;
            }
            if(si <= ei){
                String temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                si++;
                ei--;
            }
        }
        sort(arr,low,ei);
        sort(arr,si,high);
    }
    public static void printArray(String [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
