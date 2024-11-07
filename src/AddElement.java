import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        //Nhap size mang
        do {
            System.out.print("Nhap size mang: ");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Size cua mang it nhat la 1! Nhap lai!");
            }
        } while (size <= 0);
        //Nhap cac phan tu trong mang
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        //Hien thi danh sach mang
        System.out.println("Danh sach cac phan tu trong mang: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        //Tien hanh chen phan tu
        System.out.print("Nhap phan tu can chen: ");
        int insert = sc.nextInt();
        //Nhap vi tri can chen
        System.out.print("Nhap vi tri can chen: ");
        int position = sc.nextInt();
        //Kiem tra vi tri hop le
        if (position < 0 || position > size) {
            System.out.println("Khong the chen vao vi tri khong hop le!");
        } else {
            int[] newArr = new int[size + 1];
            //Sao chep cac phan tu o mang cu vao mang moi truoc khi chen
            for (int j = 0; j < position; j++) {
                newArr[j] = arr[j];
            }
            //Chen phan tu insert vao vi tri position
            newArr[position] = insert;
            //Sao chep cac phan tu con lai tu mang cu vao mang moi
            for (int j = position; j < size; j++) {
                newArr[j+1] = arr[j];
            }
            //In ra mang moi sau khi chen
            System.out.println("Mang moi sau khi chen phan tu "+insert+" vao vi tri "+position+": ");
            for (int j = 0; j < newArr.length; j++) {
                System.out.print(newArr[j] + " ");
            }
            System.out.println();
        }
    }
}
