import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("xin chao " + name );
        System.out. print("Hay nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.println("ban " + tuoi + " tuoi" );
        //sc.nextLine();
        System.out.print("hay nhap chieu cao: ");
        float chieucao = sc.nextFloat();
        System.out.println("cao " + chieucao + " met" );
        sc.nextLine();
        System.out.print("Hay nhap lop: ");
        String LopToi = sc.nextLine();
        System.out.print("Lop: " + LopToi );
        float gpa = sc.nextFloat();
        System.out.print("hay nhap diem gpa:  ");
        System.out.println("Diem trung binh: " + gpa);
        //TOAN TU
        System.out.print("Nhap a: " );
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        System.out.println("phep cong a+b= " + (a+b));
        System.out.println("phep tru a-b= " + (a-b));
        System.out.println("phep nhan a*b= " + (a*b));
        System.out.println("phep chia a/b= " + (a/b));
        System.out.println("phep chia du a%b= " + (a%b));
        if(a==b)
        {
            System.out.print("Hai so a va b bang nhau! ");
        } else
        {
            System.out.print("Hai so khong bang nhau!");
        }
        //MANG
        int[] number = new int[5];
        int[] phantu = {0,1,2,3,4,5};
        System.out.print("cac phan tu mang: ");
        for (int i = 0; i <= 5; i++)
        {
            System.out.print( i + " ");
        }
        int tong =  0 ;
        for (int i = 0; i < 5; i++)
        {
            tong+=i;
        }
        System.out.println(" tong cac  phan tu: " + tong );
        System.out.println("Tim phan tu lon nhat trong mang!");
        int max = phantu [0];
        for (int i = 0; i < 5; i ++ )
        {
            if (phantu[i] > max )
            {
                max = phantu[i];
            }
        }
        System.out.println("Phan tu max: " + max );
        // VONG LAP
        System.out.println("Bang cuu chuong 5:");
        int Bang5 = 5;
      for (int i = 1; i <= 10; i ++)
      {
          System.out.println(Bang5 + "x" + i +" = " + Bang5*i);
      }
      int i = 0;
      int tong = 0;
      while (i < 101 )
      {
        if (i % 2 == 0)
        {
            tong+=i;
        }
        i++;
      } System.out.println("tong cac so chan: " + tong);
    }
}





