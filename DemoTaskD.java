public class DemoTaskD {
    public static void main(String[] args) {
        
        final String BOLD_TEXT="\033[37;1m";
        final String RESET="\033[0m";

        System.out.printf("\033[33m+%s+%s+%s+\033[0m\n","-".repeat(7),"-".repeat(15),"-".repeat(7));
        System.out.printf("\033[33m|\033[0m%1$sITEM%2$s\t\033[33m|\033[0m%1$sQUANTITY%2$s\t\033[33m|\033[0m%1$sPRICE%2$s\t\033[33m|\033[0m\n",BOLD_TEXT,RESET);
        System.out.printf("\033[33m+\033[32m%s\033[33m+%s+\033[32m%s\033[33m+\033[0m\n","-".repeat(7),"-".repeat(15),"-".repeat(7));
        System.out.printf("\033[33m|\033[0m%s\t\033[33m|\033[0m\033[34m%15d\033[0m\033[33m|\033[0m\033[32m$\033[0m\033[31m%.2f\033[0m\t\033[33m|\033[0m\n","Apples",5,0.99);
        System.out.printf("\033[33m|\033[0m%s\033[33m|\033[0m\033[34m%15d\033[0m\033[33m|\033[0m\033[32m$\033[0m\033[31m%.2f\033[0m\t\033[33m|\033[0m\n","Oranges",10,1.49);
        System.out.printf("\033[33m+\033[32m%s\033[33m+%s+\033[32m%s\033[33m+\033[0m\n","-".repeat(7),"-".repeat(15),"-".repeat(7));

    }
    
}
