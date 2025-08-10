import java.util.Scanner;
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private  QuanLy x;
    private May[] y;
    private Integer n;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.println("Nhập diện tích phòng: ");
        DienTich = sc.nextDouble();
        System.out.println("nhập tên quản lí: ");
        x = new QuanLy();
        x.Nhap();
        System.out.println("Nhập số lượng máy: ");
        int n = Integer.parseInt (sc.nextLine());
        y = new May[n];
        for (int i = 0; i < n; i++){
            System.out.println("nhập thông tin máy thứ " + (i + 1 ) + ": ");
            y[i] = new May();
            y[i].Nhap();
        }
    }
    public void xuat(){
        System.out.println("thông tin phòng máy");
        System.out.println("mã phòng: " +MaPhong + " |tên phòng: " + TenPhong + " |diện tích: " + DienTich);
        x.Xuat();
        System.out.println("Danh sách máy tính:");
        for(May mt : y ){
            mt.xuat();
        }
    }
}
