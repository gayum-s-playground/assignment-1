public class Demo4 {
    public static void main(String[] args) {
        
        final String MONTH="\033[31m12";
        final String DAY="\033[32m28";
        final String YEAR="\033[33m2023";
        final String HOUR="\033[34m23";
        final String MINITE="\033[35m59";
        final String SECOND="\033[36m59";
        final String RESET="\033[0m";

        System.out.printf("%s%s/%s%s/%s%s %s%s:%s%s:%s%s\n",MONTH,RESET,DAY,RESET,YEAR,RESET,HOUR,RESET,MINITE,RESET,SECOND,RESET);

    }
    
}
