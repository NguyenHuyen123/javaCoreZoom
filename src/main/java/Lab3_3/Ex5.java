package Lab3_3;

public class Ex5 {

    public String reverseNumber(int n) {
//        String s="";
//        s= String.valueOf(n);
//        StringBuilder str= new StringBuilder(s);
//        return str.reverse()+" ";
        String s= String.valueOf(n);
        char[] reverse= s.toCharArray();
        String kq="";
        for (int i =reverse.length-1; i >=0 ; i--) {
            kq+=reverse[i]+"";
        }
        return kq;
    }

}
