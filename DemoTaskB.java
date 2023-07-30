public class DemoTaskB {
    public static void main(String[] args) {

        final String COLOR="\033[34m";
        final String RESET="\033[0m";
       
        System.out.printf("+%10s+%5s+\n","----------","-----");
        System.out.printf("|%1$sNAME%2$10s|%1$sAGE%2$6s|\n",COLOR,RESET);
        System.out.printf("+%10s+%5s+\n","----------","-----");
        System.out.printf("|%-10s|%-5d|\n","Alice",24);
        System.out.printf("|%-10s|%-5d|\n","Bob",30);
        System.out.printf("+%10s+%5s+\n","----------","-----");

    }
    
}
