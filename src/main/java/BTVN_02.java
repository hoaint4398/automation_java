import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BTVN_02 {
    public static void main(String[] args) {
//        PhanLoaiSoFor();
//        BinhPhuong();
        BangCuuChuong();

    }
    // region 1. In ra màn hình phân loại số với điều kiền như sau
    /*
    - Số lẻ -> Print "Weird"
    - số chẵn và trong khoảng [2, 5] -> Print "Not Weird"
    - số chẵn và trong khoảng [6, 20] -> Print "Weird"
    - số chẵn và > 20 -> Print "Not Weird"
    Số N được nhập từ bàn phím (1 <= N <= 100)
     */
    private static void PhanLoaiSoFor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. In ra màn hình phân loại số với điều kiền như sau. Dung ham if else");
        while(true){
            try{
                System.out.println("Vong lap While: N là số 1 <= N <= 100. Vui long nhap N trong khoang trên.");
                System.out.println("Nhap N: ");
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                if(num >= 1 && num <= 100){
                    String numString = "Not Weird";
                    if(num <= 5) numString = "Weird";
                    else if (num <= 20) numString = "Weird";
                    System.out.printf("%s la %s", number, numString);
                    break;
                }else System.out.println("N là số 1 <= N <= 100. Vui long nhap N trong khoang trên.");
            }catch (NumberFormatException e){
                System.out.println("Bạn nhap khong dung dinh dang. Vui long nhap lai.");
            }
        }

        do{
            try{
                System.out.println("\nVong lap Do While: N là số 1 <= N <= 100. Vui long nhap N trong khoang trên.");
                System.out.println("Nhap N: ");
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                if(num >= 1 && num <= 100){
                    String numString = "Not Weird";
                    if(num <= 5) numString = "Weird";
                    else if (num <= 20) numString = "Weird";
                    System.out.printf("%s la %s", number, numString);
                    break;
                }else System.out.println("N là số 1 <= N <= 100. Vui long nhap N trong khoang trên.");
            }catch (NumberFormatException e){
                System.out.println("Bạn nhap khong dung dinh dang. Vui long nhap lai.");
            }
        }while (true);

        for(int i = 1; i <= 3; i++){
            try{
                System.out.println("\nVong lap For: N là số 1 <= N <= 100. Vui long nhap N trong khoang trên. Ban chi co 3 lan nhap sai. Vui long can than khi nhap dap an. Warning");
                System.out.println("Nhap N: ");
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                if(num >= 1 && num <= 100){
                    String numString = "Not Weird";
                    if(num <= 5) numString = "Weird";
                    else if (num <= 20) numString = "Weird";
                    System.out.printf("%s la %s", number, numString);
                    break;
                }else System.out.printf("\nN là số 1 <= N <= 100. Ban da nhap sai %s", i);
            }catch (NumberFormatException e){
                System.out.printf("Bạn nhap khong dung dinh dang. Ban da nhap sai %s", i);
                if(i==3) System.out.println("\nBan da het co hoi");
            }

        }
    }

    // endregion

    // region 2. Nhập số N ( 2 <= N <= 20) và in ra bảng cửu chương với số N
    /*
    Bảng cưu chương bắt đầu từ 1 và kết thúc là 10; Ví dụ:
    Nhập 2 -> In
    2x1=2
    2x2=4
    ...
    2.10=20
     */
    private static void BangCuuChuong(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("2. Nhập số N ( 2 <= N <= 20) và in ra bảng cửu chương với số N");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%s x %s = %s%n", number, i, (number * i));
        }

        int i = 1;
        while (i < 11){
            System.out.printf("%s x %s = %s%n", number, i, (number * i));
            i++;
        }

        int j = 1;
        do {
            System.out.printf("%s x %s = %s%n", number, j, (number * j));
            j++;
        }while (j<11);
    }

    //endregion

    // region 3. Xây dựng chương trình để in ra chuỗi số theo quy tắc sau: chua xong
    /*
    Bạn hãy thực hiện query từ 3 giá trị a, b, n được nhập vào từ người dùng và in ra chuỗi với mỗi giá trị n.
    Điều kiện
    0<= a,b <= 50
    1 <= n <= 15
    Ví dụ: a=5; b=3; n=5;
    Kết quả: 8 14 26 50 98
     */
    private static void InChuoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xây dựng chương trình để in ra chuỗi số theo quy tắc sau:");
        System.out.println("voi dieu kien 0<= a,b <= 50 va 1 <= n <= 15 ");

        while (true){
            System.out.println("Nhap a: ");
            int a = scanner.nextInt();
            if(a >= 0){
                while (true) {
                    System.out.println("Nhap b: ");
                    int b = scanner.nextInt();
                    if (b <= 50) {
                        while (true) {
                            System.out.println("Nhap n: ");
                            int n = scanner.nextInt();
                            if (n >= 1 && n <= 15) {
                                int sum = a;
                                for (int i = 0; i < n; i++) {
                                    sum += (int) (Math.pow(2, i) * b);
                                    System.out.println(sum);
                                }
                                break;
                            } else System.out.println("Ban nhap sai gia tri n. Vui long nhap lai.");

                        }
                        break;
                    } else System.out.println("Ban nhap sai gia tri b. Vui long nhap lai.");

                }
                break;
            }else System.out.println("Ban nhap sai gia tri a. Vui long nhap lai.");

        }

    }
    // endregion

    // region 4. Xây dựng chương trình in ra số ngày của tháng. Ví dụ nhập vào tháng 1 -> Hiển thị số ngày là 31 và tháng là Feb
    private static void NgayThang(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang ma ban muon biet co bao nhieu ngay va ky tu viet tat bang tieng anh.");
        System.out.println("Nhap thang la ky tu so gom tu 1 den 12: ");
        int thang = scanner.nextInt();
        if(thang >= 1 && thang <= 12) {
            System.out.println("Dung if else");
            if (thang == 2) {
                System.out.printf("Thang %s co 29 ngay va duoc viet la %s%n", thang, ThangEng(thang));
            } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                System.out.printf("Thang %s co 30 ngay va duoc viet la %s%n", thang, ThangEng(thang));
            } else System.out.printf("Thang %s co 31 ngay va duoc viet la %s%n", thang, ThangEng(thang));

            System.out.println("dung switch case: ");
            switch (thang){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("Thang %s co 31 ngay va duoc viet la %s%n", thang, ThangEngSwitch(thang));
                    break;
                case 2:
                    System.out.printf("Thang %s co 29 ngay va duoc viet la %s%n", thang, ThangEngSwitch(thang));
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("Thang %s co 30 ngay va duoc viet la %s%n", thang, ThangEngSwitch(thang));
                    break;
            }
        }else System.out.println("Khong ton tai thang tren trong nam.");
    }

    private static String ThangEng(int i){
        if(i == 1) return "Jan";
        else if (i == 2) return "Feb";
        else if (i == 3) return "Mar";
        else if (i == 4) return "Apr";
        else if (i == 5) return "May";
        else if (i == 6) return "June";
        else if (i == 7) return "July";
        else if (i == 8) return "Aug";
        else if (i == 9) return "Sep";
        else if (i == 10) return "Oct";
        else if (i == 11) return "Nov";
        else return "Dec";
    }

    private static String ThangEngSwitch(int i){
        switch (i){
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            default : return "Dec";
        }
    }

    // endregion

    // region 5. Xây dựng chương trình in các số nằm giữa 2 giá trị nhập vào S và T với các điều kiện sau:
    /*
    (0<= S,T <= 1000)
    Nếu có tổng cộng < 10 số -> In ra toàn bộ các số
    Nếu có tổng cộng > 10 số và < 30 số -> In ra các số lẻ
    Nếu có tổng cộng  > 30 số và  < 50 số -> In ra các số chẵn
    Nếu có tổng cộng  > 50 số -> Thông báo lỗi và yêu cầu người dùng nhập lại
     */
    private static void InSoNamGiua2GiaTri(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap S voi dieu kien S >= 0: ");
            int s = scanner.nextInt();
            if(s >= 0){
                while (true) {
                    int t = scanner.nextInt();
                    if(t <= 1000){
                        int sum = s + t;
                        if(sum < 10){

                        }
                    }else System.out.println("Ban nhap sai T. Vui long nhap lai.");
                }
            }else System.out.println("Ban nhap sai N. Vui long nhap lai.");
        }
    }

    // endregion

    // region 6. Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:
    /*
    Danh sách số lẻ
    Danh sách số chẵn
    Tổng các số lẻ
    Tổng các sổ chẵn
    Giai thừa của số N
    In ra dãy số nguyên tố có trong N
    In ra dãy số fibonacci có trong N
    In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7
    In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0
    Điều kiện: 0<= N <= 100;
     */
    private static void InNBai6(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> sole = new ArrayList<Integer>();
        int sumsole = 0;
        List<Integer> sochan = new ArrayList<Integer>();
        int sumsochan = 0;
        int sumgiaithua = 1;
        List<Integer> trusodonvi = new ArrayList<Integer>();
        System.out.println("Người dùng nhập vào 1 số N và  0<= N <= 100: ");
        int n = scanner.nextInt();
        if(n >= 0 && n <= 100){
            if(n == 0) System.out.println("");
            else {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        sole.add(i);
                        sumsole += i;
                    }
                    if (i % 2 == 0) {
                        sochan.add(i);
                        sumsochan += i;
                    }
                    if (i % 7 == 0){

                    }
                    sumgiaithua *= i;
                }
                System.out.printf("Danh sach so le: %s%n", sole);
                System.out.printf("Danh sach so chan: %s%n", sochan);
                System.out.printf("Tong cac so le= %s%n", sumsole);
                System.out.printf("Tong cac so chan= %s%n", sumsochan);
                System.out.printf("Gia thua cua so %s la %s%n", n, sumgiaithua);
            }
        }
    }

    // endregion

}
