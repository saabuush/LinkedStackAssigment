public class assig3 {
    public static void main(String[] args) {

                //  a letter
                char chl =(char)('0'+ Math.random()*('z'-'a'+1));
                System.out.println("the generate is "+ chl);
                System.out.println("Is character a letter? " + Character.isLetter(chl));

                //  a letter or digit
                char ch_ld=(char)('0'+ Math.random()*('z'-'a'+1));
                System.out.println("the generated number is "+ch_ld);
                System.out.println("Is character a letter or digit? "
                        + Character.isLetterOrDigit(ch_ld));

                //  lowercase
                char ch_lower =(char)('A'+ Math.random()*('z'-'a'+1));
                System.out.println("the generate is "+ ch_lower);
                char chLower = Character.toLowerCase(ch_lower);
                System.out.println("Lowercase of character: " + chLower);

                // uppercase
                char ch_upper =(char)('a'+ Math.random()*('z'-'a'+1));
                System.out.println("the generate is "+ ch_upper);
                char chUpper = Character.toUpperCase(ch_upper);
                System.out.println("Uppercase of character: " + chUpper);
}
        }





