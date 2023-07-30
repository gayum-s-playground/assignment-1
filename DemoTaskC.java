public class DemoTaskC {
    public static void main(String[] args) {

        final String BOLD_TEXT="\033[30;1m";
        final String RESET_TEXT="\033[0m";
        
        System.out.printf("+%15s+%10s+%10s+\n","---------------","-----------","-------------");
        System.out.printf("|%1$sCITY%2$15s|%1$sSTATE%2$10s|%1$sPOPULATION%2$7s|\n",BOLD_TEXT,RESET_TEXT);
        System.out.printf("+%15s+%10s+%10s+\n","---------------","-----------","-------------");
        System.out.printf("|%s%5s|%s%1s|%,d%4s|\n","Los Angles","","California","",3966936,"");
        System.out.printf("|%s%7s|%s%3s|%,d%4s|\n","New York","","New York","",8336817,"");
        System.out.printf("+%15s+%10s+%10s+\n","---------------","-----------","-------------");

    }
    
}
