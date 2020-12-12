public class Strings //class to check if Strings are numeric or to convert Strings to double to fix exception
{
    public static boolean isNumeric(String target)  //checks if String is numeric
    {
        for (int x = 0; x < target.length(); x++) //for loop to check for a numerical value
        {
            if (!Character.isDigit(target.charAt(x))) //not a numeric value
            {
                return false; //returns false - doesn't allow user to input character
            }
        }
        return true; //numeric value - allows user to input character
    }

    public static double convertStringToDouble(String value) //fixes exception when parsing
    {
        try //will return value if there is an input value
        {
            return Double.parseDouble(value); //returns value as a double
        }
        catch (Exception e) //exception given because no value is input
        {
            return 0.0; //sets value to a default of 0.0
        }
    }
}
