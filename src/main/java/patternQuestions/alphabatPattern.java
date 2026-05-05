package patternQuestions;

public class alphabatPattern {
    public static void main(String[] args){

//        for(int i = 0; i<26; i++){
//            for(int j = 0; j<=i; j++){
//                System.out.print((char) ('a' + j) + " ");
//            }
//            System.out.println(" ");
//        }

        for(int i = 0; i<26; i++){
            char ch = 'A';
            for(int j = 0; j<=i; j++){
                System.out.print(ch +  " ");
                ch++;
            }
            System.out.println(" ");
        }
    }
}
