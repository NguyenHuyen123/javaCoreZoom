package Lab5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String upC= sc.nextLine();
        ExString e= new ExString();
        System.out.println("Chữ hoa có trong chuỗi: "+e.upperCase(upC));
        System.out.println("Chuỗi không có số: "+e.nonNumeric(upC));
        System.out.print("count c: "+e.countString(upC, '1'));
        System.out.println("\nSố lượng các từ trong chuỗi: "+ e.countChar(upC));
        e.countVowCon(upC);
    }
}
