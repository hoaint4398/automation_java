import java.util.*;

public class BTVN_03 {
    public static void main(String[] args) {
//        baiFirst();
//        baiSecond();
//        baiThird();
        baiFour();
    }

    // region 4. Viết chương trình nhập vào ma trận A có N dòng, M cột chua các phần từ là số nguyên lớn hơn 0 và nhỏ hơn 100
    /*
    Tìm phần tử lớn nhất và chỉ số của nó (Nếu có nhiều thì in ra toàn bộ các index đó)
Tìm và in ra ma trận với điều kiện các phần tử là số nguyên tố của ma trận thì giữ nguyên, không phải thì in 0
Sắp xếp các cột của ma trận và in ra tổng của mỗi cột
     */

    private static void baiFour() {
        System.out.println("Viết chương trình nhập vào ma trận A có N dòng, M cột chua các phần từ là số nguyên lớn hơn 0 và nhỏ hơn 100");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap dong N: ");
        int n = scanner.nextInt();
        System.out.println("Nhap cot M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        hoai:
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Nhap gia tri cua matrix[%s][%s] la: ", i, j);
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] < 0 || matrix[i][j] > 100){
                    System.out.println("N dòng, M cột chua các phần từ là số nguyên lớn hơn 0 và nhỏ hơn 100");
                    break hoai;
                }
            }
        }

    }

    // endregion

    // region 3. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
    /*
    In ra list theo thứ tự giảm dần.
Chỉ ra vị trí số 77 trong list(Array)
     */

    private static void baiThird() {
        System.out.println("các số chia hết cho 7 nhưng không phải bội số của 5 là: ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 10; i <= 200; i++){
            if(i % 7 == 0 && i % 5 != 0){
                System.out.print(i + " ");
                list.add(i);
            }
        }
        System.out.println("\nList theo thứ tự giảm dần la ");
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nChỉ ra vị trí số 77 trong list(Array)");
        for(int i = 0; i <= list.size() - 1; i++){
            if(list.get(i) == 77){
                System.out.println("vị trí số 77 trong list(Array) la " + (i + 1));
                break;
            }
        }
    }
    // endregion

    // region 2.  chuỗi: "TestekVN - Đào tạo kiểm thử thực chiến", hãy thực hiện các yêu cầu sau:
    /*
    1. Đếm số lượng ký tự e trong chuỗi
    2. Kểm tra chuỗi có phải bắt đầu bằng "Test" không, nếu đúng in ra true, sai in false
    3. Lấy vị trí của từ "thực" trong chuỗi
    4. In ra chuỗi đảo ngược của chuỗi trên (Ví dụ: Chuỗi đầu vào là "TestekVN" -> Kết quả: "NVketseT")
     */
    private static void baiSecond() {
        System.out.println("Chung ta co chuoi: TestekVN - Đào tạo kiểm thử thực chiến");
        String text = "TestekVN - Đào tạo kiểm thử thực chiến";

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'e'){
                count++;
            }
        }

        System.out.println("1. Số lượng ký tự e trong chuỗi la: " + count);
        System.out.println("2. Kểm tra chuỗi có phải bắt đầu bằng \"Test\" không: " + text.startsWith("Test"));
        System.out.println("3. Lấy vị trí của từ \"thực\" trong chuỗi");

        System.out.println("4. In ra chuỗi đảo ngược của chuỗi trên (Ví dụ: Chuỗi đầu vào là \"TestekVN\" -> Kết quả: \"NVketseT\")");
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }

    }
    // endregion

    // region 1. Nhập một chuỗi từ bàn phím và in ra số lượng ký tự viết hoa. Ví dụ: TestekVN -> In ra 3 (T, V, N)
    private static void baiFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn bạn nhạp một chuỗi bất kỳ từ bàn phím: ");
        String chuoi = scanner.nextLine();
        String text = chuoi.trim();
        boolean checkChar = false;
        String textConvert = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == textConvert.charAt(i)){
                checkChar = true;
                System.out.print(text.charAt(i) + "  ");
            }
        }
    }

    // endregion


}
