//A program to count the occurrences of each letter in an array of characters.
/*
1. Randomly Generate 100 lowercase letters and assign into an array of chars
2. Create an array of 26 int values each of which counts the occurrences of a letter,
counts[0] counts the number of a’s, counts[1] counts the number of b’s, and so on.
 */

public class CountTheOccurrenceOfEachLetter {
    public static char[] createArrayOfRandomChars(){
        char[] chars = new char[100];

        for(int i = 0; i < chars.length; i++){
//            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return  chars;
    }

    public static void displayArray(char[] chars){
        // Display the characters in the array 20 on each line
        for(int i = 0; i< chars.length; i++){
            if((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            }else{
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++){
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
}
