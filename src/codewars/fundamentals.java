package codewars;

public class fundamentals {
    public static String disemvowel(String str) {

        /* Disemvowel Trolls.
        Trolls are attacking your comment section!

        A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

        Your task is to write a function that takes a string and return a new string with all vowels removed.

        For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

        Note: for this kata y isn't considered a vowel.
        */

        String[] vowels = {"a", "o", "e", "i", "u", "A", "O", "E", "I", "U"};
        for (int i = 0; i < vowels.length; i++)
            str = str.replace(vowels[i], "");
        return str;
    }

    public static String[] fixTheMeerkat(String[] arr) {
            /*You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!

            Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

            Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics

            Simples!
            */
        return null;
    }

    public static void main(String[] args) {

        //System.out.println(disemvowel("I love java"));
    }
}
