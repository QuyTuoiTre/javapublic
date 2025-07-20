import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    //Bai 1:
        /*int r;
        double pi = 3.14;
        do
        {
            System.out.print("nhap ban kinh r: ");
            r = sc.nextInt();
            if (r < 0 || r > 1000)
            {
                System.out.print("Xin vui long nhap lai! ");
            }
        } while (r < 0|| r > 1000);
        double dientich = pi*r*r;
        double chuvi = 2*pi*r;
        System.out.println("chu vi hinh tron la: " + chuvi);
        System.out.println("dien tich honh tron la: " + dientich);*/
//Bai 2:
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int[]mang = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang la: ");
        

    }
}
