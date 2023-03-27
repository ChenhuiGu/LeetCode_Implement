package src;


public class ReverseWords {
    public String reverseWords(String s) {
        String str = s.trim();
        int i = str.length() - 1,j = i;
        StringBuilder res = new StringBuilder();
        while (i >= 0){
            while (i >= 0 && str.charAt(i) != ' ') i--;
            res.append(str, i+1, j+1).append(' ');
            while (i>=0 && str.charAt(i) == ' ') i--;
            j = i;
        }
        return res.toString().trim();
    }
}
