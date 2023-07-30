public class Demo5 {
    public static void main(String[] args) {
        
        final String COLOR_BLUE="\033[34m";
        final String COLOR_PURPLE="\033[35m";
        final String COLOR_GREEN="\033[35m148410\033[32m0";
        final String RESET="\033[0m";

        System.out.printf("%s%s%s-%s%s%s-%s%s%s-%s\n",COLOR_BLUE,978,RESET,COLOR_PURPLE,3,RESET,COLOR_PURPLE,16,RESET,COLOR_GREEN);
    }
    
}
