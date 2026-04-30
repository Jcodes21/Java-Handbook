//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html

public class phrase {
    public static void main(String a[]){
        String phrase = "Play with me";
        String wSpace = "  ";
        System.out.println(phrase.toUpperCase());  
        System.out.println(phrase.toLowerCase());  
        System.out.println(phrase.isEmpty());  
        System.out.println(wSpace.isBlank());  
        System.out.println(phrase.substring(1,2));  
    }
}
