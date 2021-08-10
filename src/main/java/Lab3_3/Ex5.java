package Lab3_3;

public class Ex5 {

    public String reverseNumber(int n) {
        String s="";
        s= String.valueOf(n);
        StringBuilder str= new StringBuilder(s);
        return str.reverse()+" ";

    }

}
