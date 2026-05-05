package String;

public class eachChar {

    public static  int countVowels(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String str){
     String ch = "";
     int n = str.length();
        for(int i = n-1; i>= 0; i-- ){
            ch = ch + str.charAt(i);
        }
        return ch;
    }

    public static boolean checkPalindrome(String str){

        String original = str;
        String reverse = reverseString(original);
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(original.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "moom";
     //reverseString(str);
        //System.out.print(countVowels(str));

     if(checkPalindrome(str)){
         System.out.print("your string is palindrome");
     }else{
         System.out.print("your string is  notttt a palindrome");
     }







        // each character of a string
//        for(int i = 0; i<str.length(); i++){
//            System.out.print(str.charAt(i) + " ");

 //
    }


}
