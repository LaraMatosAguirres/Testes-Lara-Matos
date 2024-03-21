public class Inversao {
    public static void main(String[] args) {

        String nome = "nome";
        char[] charArray = nome.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        System.out.println(charArray);
    }
}
