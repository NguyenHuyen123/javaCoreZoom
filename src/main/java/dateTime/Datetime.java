package dateTime;

import java.util.Date;
import java.util.Scanner;

public class Datetime {
    int year;
    byte day, month;
    static Date inputDateTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm theo cú pháp dd/MM/yyyy");
        Date result = null;
        try {
            String[] arrString = sc.nextLine().split("/");
            result = new Date(Integer.parseInt(arrString[2]), Integer.parseInt(arrString[1]), Integer.parseInt(arrString[0]));
        } catch (Exception e) {
            return null;
        }
        return result;
    }
    public static int time() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giờ ");
        int hour = sc.nextInt();
        System.out.println("Nhập phút ");
        int min = sc.nextInt();
        System.out.println("Nhập giây ");
        int sec = sc.nextInt();
        int result = 0;
        result += hour * 3600 + min * 60 + sec;
        return result;
    }

    public static double timesTamp() {
        Date inputDate = inputDateTime();
        // tính từ ngày 1/1/1970
        double totalDay = 0;
        if (inputDate != null) {
            // tính thời gian trước khi năm mới nhất
            for (int i = 1970; i < inputDate.getYear(); i++) {
                totalDay += i % 4 == 0 ? 366 : 365;
            }

            // tính thời gian năm hiên tại
            for (int i = 1; i < inputDate.getMonth(); i++) {
                switch (inputDate.getMonth()) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        totalDay += 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        totalDay += 30;
                        break;
                    case 2:
                        totalDay += inputDate.getYear() % 4 == 0 ? 29 : 28;
                        break;
                    default:
                        break;
                }
            }

            totalDay += inputDate.getDay();
            return (totalDay * 86400);
        } else {
            return totalDay;

        }
    }
}
