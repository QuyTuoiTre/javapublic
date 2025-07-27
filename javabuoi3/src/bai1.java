import java.util.Scanner;
public class bai1 {
    public static final String VUONG = "vuông";
    public static final String TAMGIAC = "tam giác";
    public static final String TRON = "tròn";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại hình(tròn,vuông,tam giác): ");
        String type = sc.nextLine();
        if(type.equalsIgnoreCase(VUONG))
        {
            System.out.print("Nhập cạnh hình vuông: ");
            double canh = sc.nextDouble();
            double dientichvuong = canh*canh;
            System.out.print("");
            System.out.print("diện tích hình vuông là: "+ dientichvuong);
        }
        else if(type.equalsIgnoreCase(TAMGIAC)) {
            System.out.print("Nhập đáy: ");
            double day = sc.nextDouble();
            System.out.print("");
            System.out.print("Nhập chiều cao: ");
            double cao = sc.nextDouble();
            double dientichtamgiac = 0.5 * day * cao;
            System.out.print("");
            System.out.print("diện tích tam giác là: " + dientichtamgiac);
        }
        else if(type.equalsIgnoreCase(TRON))
        {
            System.out.print("nhập bán kính: ");
            double bankinh = sc.nextDouble();
            final double pi = 3.14;
            double dientichtron = pi*bankinh*bankinh;
            System.out.print("");
            System.out.print("diện tích hình tròn là: " + dientichtron);
        }
        else
        {
            System.out.println("Hình không hợp lệ!");
        }
        }
    }
