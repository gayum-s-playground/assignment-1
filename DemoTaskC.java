public class DemoTaskC {
    public static void main(String[] args) {

        final String BOLD_TEXT="\033[37;1m";
        final String RESET_TEXT="\033[0m";
        
        System.out.printf("\033[33m+%15s+%10s+%7s+\033[0m\n","---------------","-----------","-----------");
        System.out.printf("\033[33m|\033[0m%1$sCITY%2$15s\033[33m|\033[0m%1$sSTATE%2$10s\033[33m|\033[0m%1$sPOPULATION%2$5s\033[33m|\033[0m\n",BOLD_TEXT,RESET_TEXT);
        System.out.printf("\033[33m+%15s+%10s+%7s+\033[0m\n","---------------","-----------","-----------");
        System.out.printf("\033[33m|\033[0m%s%5s\033[33m|\033[0m%s%1s\033[33m|\033[0m\033[35m%,d%2s\033[0m\033[33m|\033[0m\n","Los Angles","","California","",3966936,"");
        System.out.printf("\033[33m|\033[0m\033[32m%s\033[0m%s%7s\033[33m|\033[0m\033[32m%s\033[0m%s%3s\033[33m|\033[0m\033[35m%,d%2s\033[0m\033[33m|\033[0m\n","New ","York","","New ","York","",8336817,"");
        System.out.printf("\033[33m+%15s+%10s+%7s+\033[0m\n","---------------","-----------","-----------");

    }
    
}
