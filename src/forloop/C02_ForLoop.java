package forloop;

public class C02_ForLoop {
    public static void main(String[] args) {
        //interwiew sorusu
        //String karakterleri teker yazdıra ve a harfini gorunce yazdırmayı bıraksın
        String cumle = "ogrenmek yasamin tek kanitidir";

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a') {
                break;
            }//if body
            System.out.print(cumle.charAt(i)+" ");

        }
    }
}
