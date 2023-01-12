package src;

/**
 * @author chenhuigu
 */
public class IsNumber {
    public boolean isNumber(String s){
        try {
            Double.valueOf(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
