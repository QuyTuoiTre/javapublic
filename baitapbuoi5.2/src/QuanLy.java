import java.util.Scanner;
public class QuanLy {
    private String hoTen;
    private String MaQL;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ tên quản lí: ");
        hoTen = sc.nextLine();
        System.out.println("nhập mã quản lí: ");
        MaQL = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Quản lý: " + hoTen + "| Mã quản lí: " + MaQL);
    }

}
