package lab2_2;

import java.util.Scanner;

public class Ex2 {

    public static  String inputLowerAndUpperCase() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập chữ cái: ");

        String str= scanner.nextLine();
        if (!str.equals(str.toUpperCase())){
            return str.toUpperCase();
        }else {
            return str.toLowerCase();
        }

    }

    public static void main(String[] args) {
        System.out.println(inputLowerAndUpperCase());
    }
}
