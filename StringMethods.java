//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
public class StringMethods {
    public static void main(String a[]){
        char blocks[]={'a','l','!'};
        String Str = new String(blocks);
        String phrase = "I'm a str1ng. Play with me";
        String wSpace = "  ";
        System.out.print(Str);
        System.out.println(Str.toUpperCase());  
        System.out.println(phrase.toLowerCase());  
        System.out.println("Is empty?"+phrase.isEmpty());  
        System.out.println(wSpace.isBlank());  
        System.out.println(phrase.substring(1,2));
    }
}
