public class takesLonger {
    public static void main(String... args) {
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the String(quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)


        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote.indexOf('y'));

       String concat="always takes longer than";
        quote = quote.substring(0, 21)+" "+concat+" "+quote.substring(21);

        System.out.println(quote);
    }
    }


