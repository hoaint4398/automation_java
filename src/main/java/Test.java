import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        arrList();
        maTrix();
//        sortInArrList();
    }

    //region xay dung chuong trinh
    /*
    1. nhap so N tu ban phim va tao ra ma tran NxN. Nhap gia tri cho ma tran nay tu ban phim voi
    dieu kien moi gia tri nam trong khoang 0 -> 100
    2. thuc hien cac noi dung sau (su dung ma tran tren)
    - tim p han tu lon nhat voi chi so cua no
    - tim va in ra cac phan tu la so nguyen to cua ma tran, neu khog phai so nguyen to thi se thay
    the bang so 0
    - sap xep cac cot cua ma tran theo thu tu tang dan
    - timm cot co tong so lon nhat
     */
    private static void maTrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so N ");
        int n = scanner.nextInt();
        if(n > 0 && n < 100){
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("Gia tri cua N[%s][%s] ", i, j);
                    int val = scanner.nextInt();
                    matrix[i][j] = val;
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("tim phan tu lon nhat voi chi so cua no");
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    max = Math.max(max, matrix[i][j]);
                }
            }
            System.out.println("Phan tu lon nhat la " + max);



            System.out.println("sap xep cac cot cua ma tran theo thu tu tang dan");

            System.out.println("sap xep cac cot cua ma tran theo thu tu tang dan");
            List<Integer> tong = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[j][i] + " ");
                    tong.add(matrix[j][i]);
                }
                System.out.println();
            }
            System.out.println(tong);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tong.add(matrix[j][i]);
                    System.out.print(matrix[j][i] + " ");
                    sortArr((ArrayList<Integer>) tong, j, n);
                }
                System.out.println();
            }
        }
    }

    private static void sortArr(ArrayList<Integer> arr, int start, int end){
        for(int i = start; i < end; i++){
            for(int j = end; j > i; j --){
                if(arr.get(j) < arr.get(j - 1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
        }
    }
    // end region

    // region 1. viet chuong trinh tao 1 arrayList moi tu 1 ArrayList da ton tai
    /*
    2. Viet chuong trinh loai bo cac phan tu trung nhau trong 1 ArrayList
    3. Tinh va hien thi tong cac phan tu cua ArrayList
     */
    private static void arrList() {
        ArrayList<Integer> arrExist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. viet chuong trinh tao 1 arrayList moi tu 1 ArrayList da ton tai");
        System.out.println("nhap so index trong array list ma ban muon ");
        int index = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < index; i++){
            System.out.printf("Phan tu thu %s la ", i);
            int val = scanner.nextInt();
            arrExist.add(val);
        }
        System.out.println("Chuoi trong arr list la " + arrExist);

        System.out.println("2. Viet chuong trinh loai bo cac phan tu trung nhau trong 1 ArrayList");
        for(int i = 0; i < index; i++){
            for(int j = 1; j < index; j++){
                if(arrExist.get(i) == arrExist.get(j)){
                    arrExist.remove(j);
                }
            }
        }
        System.out.println("Chuoi sau khi loai bo phan tu trung nhau la " + arrExist);
        List<Integer> distinctElements = arrExist.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Chuoi sau khi loai bo phan tu trung nhau la " + distinctElements);

        System.out.println("3. Tinh va hien thi tong cac phan tu cua ArrayList");
        int sum = 0;
        for (int val:arrExist) {
            sum += val;
        }
        System.out.println("Tong arrList la " + sum);

    }
    // endregion

    // region using For Sắp xếp các phần tử trong ArrayList đó theo thứ tự từ nhỏ
    /*
    /*
        Xây dựng chương trình:
1. Tạo ra một ArrayList số với số lượng phần tử được nhập từ bàn phím
2. Sắp xếp các phần tử trong ArrayList đó theo thứ tự từ nhỏ -> lơnLưu ý: Thời gian: 10mins
         */

    private static void sortInArrList() {
        System.out.println("1. Tạo ra một ArrayList số với số lượng phần tử được nhập từ bàn phím");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu ban muon nhap: ");
        ArrayList<Integer> arr = new ArrayList<>();
        int soPhanTu = scanner.nextInt();
        for(int i = 0; i < soPhanTu; i++){
            System.out.printf("\nNhap phan tu thu %s la ", i);
            int val = scanner.nextInt();
            arr.add(val);
        }
        System.out.println("chuoi trong arr la " + arr);
        ArrayList<Integer> arrSort = new ArrayList<>();
        System.out.println("2. Sắp xếp các phần tử trong ArrayList đó theo thứ tự từ nhỏ");

        int temp;
        int a = 5;
        int b = 6;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a " + a + " b " + b);

        for(int i = 1; i < arr.size(); i++){
            int max = Math.max(arr.get(i - 1), arr.get(i));
            int min = Math.min(arr.get(i - 1), arr.get(i));
            arr.set(i - 1, min);
            arr.set(i, max);
        }
        System.out.println("chuoi trong arr la " + arr);
    }

    // endregion

}