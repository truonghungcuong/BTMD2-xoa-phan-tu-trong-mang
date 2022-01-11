import java.util.Scanner;

public class Main {
    public static int[] remove(int[] array,int position,int size){
        int[] newArray = new int[size];
        for(int i = 0;i<position;i++){
            newArray[i] = array[i];
        }
        for(int i = position;i<array.length-1;i++){
            newArray[i] = array[i+1];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextInt();
        }
        int position;
        System.out.println("Nhap vi tri ban muon xoa:");
        position = sc.nextInt();
        size--;
        int[] newArray = remove(array,position,size);
        for(int i =0;i<size;i++){
            System.out.println(newArray[i]);
        }
    }
}