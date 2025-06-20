public class make_install {

    public make_install(){
        String str = "make install";

        System.out.println("Слово в обратном порядке: ");

        String result = reverseString(str);
        System.out.println(result);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }


}
