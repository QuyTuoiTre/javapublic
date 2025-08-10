import java.util.Scanner;
public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        MaMay = sc.nextLine();
        System.out.println("nhập tên máy: ");
        TenMay = sc.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        TinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.println("mã máy: " + MaMay+ " |tên máy: " + TenMay +" |tình trạng: " + TinhTrang );
    }
}
