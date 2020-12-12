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

    public static double convertStringToDouble(String value){
        try
        {
            return Double.parseDouble(value);
        }
        catch (Exception e)
        {
            return 0.0;
        }
    }
}
