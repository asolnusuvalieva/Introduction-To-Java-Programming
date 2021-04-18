public class CountLettersInArray {
    public static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign
        // them to the array
        for (int i = 0; i < chars.length; i++)
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();

        return chars;
    }
}
