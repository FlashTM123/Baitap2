import java.util.Scanner;

public class HinhVuong extends HinhHoc2D{
     double canh;

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do dai canh: ");
        canh = input.nextDouble();
    }

    public void tinhChuVi(){
        chuVi = canh * 4;
    }
    public void tinhDienTich(){
        dienTich = canh * canh;
    }

    public void hienthi(){
        System.out.println("Chu vi hinh vuong: " + chuVi);
        System.out.println("Dien tich hinh vuong: " + dienTich);
    }
}
