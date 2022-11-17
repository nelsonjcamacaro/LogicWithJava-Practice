import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;

public class Anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("pablo","bopla"));
    }

    public static boolean isAnagram (String word1, String word2){

        if (word1.toLowerCase() == word2.toLowerCase()){
            System.out.println("la palabra "+ word1 +" no es un anagrama");
            return false;
        } else {
            char[] word1InArray = word1.toLowerCase().toCharArray();
            char[] word2InArray = word2.toLowerCase().toCharArray();
            Arrays.sort(word1InArray);
            Arrays.sort(word2InArray);
            String word1Sorted = new String(word1InArray);
            String word2Sorted = new String(word2InArray);
                if (word1Sorted.equals(word2Sorted)){
                    return true;
                }else{
                    System.out.println("entro aqui");
                    return false;
                }
        }
    }
    }
