package Generic_Demo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pair_Demo {
    public static void main(String[] args) {
        String str = "Mary had a little lamb";
        String[] words = str.split(" ");
        for (String word:
             words) {
            System.out.println(word);
        }
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println(mm.toString());


    }
}
