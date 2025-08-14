import java.util.Scanner;

public class HinhChuNhat extends HinhHoc2D{
    double chieuDai;
     double chieuRong;

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        chieuDai = input.nextDouble();
        System.out.print("Nhap chieu rong hinh nhat: ");
        chieuRong = input.nextDouble();
    }

    public void tinhChuVi(){
        chuVi = (chieuDai + chieuRong)*2;

    }

    public void tinhDienTich(){
        dienTich = chieuDai* chieuRong;
    }

    public void hienthi(){
        System.out.println("Chu vi HCM: " + chuVi);
        System.out.println("Dien tich HCM: " + dienTich);
    }

}
