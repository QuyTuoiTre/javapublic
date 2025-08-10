import java.util.Scanner;
public class Faculty {
    private String name ;
    private String date;
    private School x = new School();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày vào khoa: ");
        date = sc.nextLine();
        System.out.println("nhập thông tn trường: ");
        x.input();
    }
    public void output(){
        System.out.println("tên khoa: " + name );
        System.out.println("Ngày vào khoa: " + date );
        x.output();
    }
}
