
package giaiphuongtrinhbac1va2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Phuong trinnh bac 2 co dang: ax^2 + bx + c = 0
        // Nhap he so cho a, b, c.
        System.out.print(" nhap he so cho a: ");
        double a = scanner.nextDouble();
        
        System.out.print(" nhap he so cho b: ");
        double b = scanner.nextDouble();
        
        System.out.print(" nhap he so cho c: ");
        double c = scanner.nextDouble();
        
        // Nếu a == 0 => phương trình quy về phương trình bậc 1.
        if( a == 0){
            if( b == 0){
                // b = 0 && c == 0 => phuogn trinh co vo so nghiem.
                if( c == 0){
                    System.out.println(" Phuong trinh co vo so nghiem.");
                // b == 0 && c != 0 => phuong trinh vo nghiem.    
                }else{
                    System.out.println(" Phuong trinh vo nghiem.");
                }
            // nếu b !+ 0 => x = -c / b
            }else{
                double x = -c / b;
                System.out.println(" Nghiem cua phuong trinh bac 1 la: x = " +x);
            }
        // Nếu a != 0 => đi tính Delta
        }else{
            // tính Delta
            double delta = (b * b) - (4 * a * c);
            // nếu delta > 0 => có 2 nghiệm phân biệt 
            // x1 = ( -b + căn bậc 2 của delta) / ( 2 * a)
            // x2 = ( -b - căn bậc 2 của delta) / ( 2 * a)
            if( delta > 0){
                double x1 = (-b + Math.sqrt(delta) / ( 2 * a));
                double x2 = (-b - Math.sqrt(delta) / ( 2 * a));
                
                System.out.println(" Phuong trinh co hai nghiem phan biet: ");
                System.out.println(" x1 = " + x1);
                System.out.println(" x2 = " + x2);
            // nếu delta == 0 => phương trình có nghiệm kép
            }else if( delta == 0){
                double x = -b / ( 2 * a );
                System.out.println(" Phuong trinh co nghiem kep: x = " + x);
            // nếu delta < 0 => phương trình vô nghiệm.    
            }else{
                System.out.println(" Phuong trinh vo nghiem.");
            }
        }
    }   
    
}
