package academy.devdojo.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'W';
        boolean booleanP = true;

        Byte byteW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F; // Auto-boxing
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = true;

        int i = intW; // Unboxing
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);

        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isLetterOrDigit('2'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isIdeographic('*'));


    }
}
