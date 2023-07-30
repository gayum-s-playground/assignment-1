public class DemoTaskB {
    public static void main(String[] args) {

        final String COLOR="\033[34m";
        final String RESET="\033[0m";
       
        System.out.printf("\033[33m+%10s+%5s+\033[0m\n","----------","-----");
        System.out.printf("\033[33m|\033[0m%1$sNAME%2$10s\033[33m|\033[0m%1$s AGE%2$5s\033[33m|\033[0m\n",COLOR,RESET);
        System.out.printf("\033[33m+%10s+%5s+\033[0m\n","----------","-----");
        System.out.printf("\033[33m|\033[0m%-10s\033[33m|\033[0m\033[35m%5d\033[0m\033[33m|\033[0m\n","Alice",24);
        System.out.printf("\033[33m|\033[0m%-10s\033[33m|\033[0m\033[35m%5d\033[0m\033[33m|\033[0m\n","Bob",30);
        System.out.printf("\033[33m+%10s+%5s+\033[0m\n","----------","-----");

    }
    
}
