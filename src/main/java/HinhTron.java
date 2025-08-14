import java.util.Scanner;

public class HinhTron extends HinhHoc2D {
    double banKinh;

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh:");
        banKinh = input.nextDouble();
    }
    public void tinhChuVi(){
        chuVi = banKinh  * 2 * Math.PI;
    }
    public void tinhDienTich(){
        dienTich = banKinh * banKinh * Math.PI;
    }
    public void hienThi(){
        System.out.println("Chu vi hinh tron:" + chuVi);
        System.out.println("Dien tich hinh tron:" + dienTich);
    }
}
