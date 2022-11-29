import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BTVN_03_01 {
    public static void main(String[] args) throws Exception {
        arrList();
//        try{
//            maTrix();
//        }catch (Exception e){
//            System.out.println("sai dinh dang");
//        }

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
    private static void maTrix() throws Exception{
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

            List<Integer> nguyenTo = new ArrayList<>();
            System.out.println("tim va in ra cac phan tu la so nguyen to cua ma tran, neu khong phai so nguyen to thi se thay the bang so 0");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrix[i][j] % 2 == 0 || matrix[i][j] % 5 == 0 || matrix[i][j] % 7 == 0) matrix[i][j] = 0;
                    else nguyenTo.add(matrix[i][j]);
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("So nguyen to cua ma tran la " + nguyenTo);

            // chua dung. y tuong bi bi
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
                }
                sortArr((ArrayList<Integer>) tong, i, n);
                System.out.println();
            }


            System.out.println("tim cot co tong so lon nhat");
            List<Integer> tongSum = new ArrayList<>();
            int sum = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    sum += matrix[j][i];
                }
                tong.add(sum);
                sum = 0;
            }
            System.out.println("Phan tuy trong trong " + tongSum);
            int maxTong = Integer.MIN_VALUE;
            for (int i = 0; i < tong.size(); i++){
                maxTong = Math.max(maxTong, tong.get(i));
            }
            for (int i = 0; i < tong.size(); i++){
                if(maxTong == tong.get(i)){
                    System.out.println("cot co tong lon nhat la " + (i + 1));
                    break;
                }
            }
        }
    }

    private static void sortArr(ArrayList<Integer> arr, int start, int end){
        for(int i = start; i < end; i++){
            for(int j = end; j > i; j --){
                int max = Math.max(arr.get(j - 1), arr.get(j));
                int min = Math.min(arr.get(j - 1), arr.get(j));
                arr.set(j - 1, min);
                arr.set(j, max);
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
            for(int j = index - 1; j > i; j--){
                if(arrExist.get(i) == arrExist.get(j)){
                    arrExist.remove(j);
                    index--;
                }
            }
        }
        System.out.println("Loai bo phan tu trung nhau => array become " + arrExist);


        System.out.println("3. Tinh va hien thi tong cac phan tu cua ArrayList");
        int sum = 0;
        System.out.println("List danh sach arr sau khi loai bo phan tu trung nhau la ");
        for (int val:arrExist) {
            System.out.print(val + " ");
            sum += val;
        }
        System.out.print(" .Tong arrList la " + sum);

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

        System.out.println("2. Sắp xếp các phần tử trong ArrayList đó theo thứ tự từ nhỏ");
        for(int i = 0; i < arr.size(); i++){
            for(int j = arr.size() - 1; j > i; j--) {
                int max = Math.max(arr.get(j - 1), arr.get(j));
                int min = Math.min(arr.get(j - 1), arr.get(j));
                arr.set(j - 1, min);
                arr.set(j, max);
            }
        }
        System.out.println("chuoi trong arr la " + arr);
    }

    // endregion

}