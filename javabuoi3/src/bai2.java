import java.sql.SQLOutput;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi cần kiểm tra: ");
        String nhap = sc.nextLine();
        String chuoi = nhap.trim().toLowerCase();
        String daonguoc = new StringBuilder(chuoi).reverse().toString();
        if(chuoi.equals(daonguoc))
        {
            System.out.println(nhap.toUpperCase());
            System.out.println("chuỗi này đối xứng!");
        }
        else
        {
            System.out.println(nhap.toLowerCase());
            System.out.println("chuỗi này không đối xứng!");
        }
    }
}
