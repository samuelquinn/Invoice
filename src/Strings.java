public class Strings
{
    public static boolean isNumeric(String target) {
        for (int x = 0; x < target.length(); x++)
        {
            if (!Character.isDigit(target.charAt(x)))
            {
                return false;
            }
        }
        return true;
    }
}
