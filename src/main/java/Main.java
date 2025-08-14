//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       HinhChuNhat hcn = new HinhChuNhat();

       HinhVuong hv  = new HinhVuong();

       HinhTron ht = new HinhTron();

        System.out.println("Hinh chu nhat");
       hcn.nhap();
       hcn.tinhChuVi();
       hcn.tinhDienTich();
       hcn.hienthi();
        System.out.println("Hinh vuong");
       hv.nhap();
       hv.tinhChuVi();
       hv.tinhDienTich();
       hv.hienthi();
       System.out.println("Hinh Tron");
       ht.nhap();
       ht.tinhChuVi();
       ht.tinhDienTich();
       ht.hienThi();
    }
}