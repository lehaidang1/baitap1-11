
package giaiphuongtrinhbac1va2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //    Phương trình bậc 1 có dạng: ax + b = 0
        
        // Nhập hệ số cho a.
        System.out.print(" Nhap gia tri cua a: ");
        double a = scanner.nextDouble();
        // Nhâp hệ số cho b.
        System.out.print(" Nhap gia tri cua b: ");
        double b = scanner.nextDouble();
        // Nếu a = 0.
        if( a== 0) {
            // Và b = 0 => Phuong trinh co vo so nghiem.
            if( b == 0 ){
                System.out.println(" Phuong trinh co vo so nghiem. ");
                //  Va b != 0 => Phuong trinh vo nghiem
            }else{
                System.out.println(" Phuong trinh vo nghiem.");
            }
        }else{
            // Nếu a != 0 => x = -b / a.
            double x = -b / a;
            System.out.println(" Nghiem cua phuog trinh la: " + x);
    }
    
}
}