package Lab5;

import java.util.Locale;

public class ExString {
    //bt1
    public String upperCase(String upC) {
        String result = "";
        for (int i = 0; i < upC.length(); i++) {
            if (Character.isUpperCase(upC.charAt(i))) {
                result += upC.charAt(i) + ",";
            }

        }
        return result;

    }

    //bt2
    public String nonNumeric(String nonNum) {
        String rs = "";
        for (int i = 0; i < nonNum.length(); i++) {
            if (Character.isDigit(nonNum.charAt(i))) {
                continue;
            }
            rs = rs + nonNum.charAt(i) + " ";

        }
        return rs;
    }

    //bt3
    public int countString(String eStri, char a) {
        int count = 0;
        for (int i = 0; i < eStri.length(); i++) {
            if (a == eStri.charAt(i)) {
                count++;
            }

        }
        return count;

    }

    //bt4
    public int countChar(String s) {
        int i;
        int count = 0;
        char ch[] = new char[s.length()];
        for (i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }
    //bt7
    public void countVowCon(String str){
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z'))
                ccount++;
        }
        System.out.println("số nguyên âm: " + vcount);
        System.out.println("số phụ âm: " + ccount);
    }

}
