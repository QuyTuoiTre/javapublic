
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        int c = (int)(Math.random() * 201);
        System.out.println("phép toán" + a + "+" + b + "=" +c);
        System.out.print("nhập câu trả lời(đúng/sai): ");
        String traloi = sc.nextLine().trim().toLowerCase();
        int ketquadung = a + b;
        boolean ketqua = (ketquadung == c);
        if(ketqua && traloi.equals("đúng") || (!ketqua && traloi.equals("sai")))
        {
            System.out.println("bạn trả lời đúng!");
        }
        else
        {
            System.out.println("bạn trả lời sai!");
        }
    }
}
