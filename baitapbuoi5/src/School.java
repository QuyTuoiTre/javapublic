import java.util.Scanner;
public class School {
    private String name;
    private String date;
    public School(){}
    public School(String name, String date){
        this.name=name;
        this.date=date;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên trường: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày vào trường: ");
        date = sc.nextLine();
    }
    public void output(){
        System.out.println("Tên trường: " + name );
        System.out.println("Ngày vào trường: " + date );
    }
}
