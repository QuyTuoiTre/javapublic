import java.util.Scanner;
public class Student {
    private String name;
    private String Class;
    private double Score;
    private Faculty y = new Faculty();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("nhập lớp : ");
        Class = sc.nextLine();
        System.out.println("Nhập điểm: ");
        Score = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhập thông tin khoa: ");
        y.input();
    }
    public void output(){
        System.out.println("thông tin sinh viên:");
        System.out.println("Tên sinh viên: " + name );
        System.out.println("Lớp: " + Class);
        System.out.println("Điểm số: " + Score );
        y.output();
    }
}
