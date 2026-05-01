//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
public class StringMethods {
    public static void main(String a[]){
        char blocks[]={'a','l','!'};
        String Str = new String(blocks);
        String phrase = "I'm a str1ng. Play with me";
        String wSpace = "  ";
        String trimMe = "Spaces gone?     ";
        String trimMe2 = "     Spaces gone?     ";

        

        System.out.println(phrase + "!");
        System.out.println(phrase.length());

        System.out.println(phrase.charAt(9));
        System.out.println(phrase.charAt(9) + 1); // Output is 50
        System.out.println(phrase.charAt(10) + 1); // Output is 111
       // System.out.println(phrase.indexOf());
       //  System.out.println(phrase.lastIndexOf());
        // System.out.println(phrase.replace());
        System.out.println(Str);
        System.out.println(phrase.toCharArray());
        System.out.println(Str.toUpperCase());  
        System.out.println(phrase.toLowerCase());  
        System.out.println("Is empty?"+phrase.isEmpty());  
        System.out.println(wSpace.isBlank());  
        System.out.println(phrase.substring(1,2));
        System.out.println(trimMe.trim());
        System.out.println(trimMe2.strip());
        System.out.println(trimMe2.stripLeading());
        System.out.println(trimMe2.stripTrailing());
        
    }
}
