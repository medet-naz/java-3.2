public class main {
    public static void main(String[] args) {
        
        int balance = 100;
        int gettedBalance = 700;
        int bonusBalance;
        int overall;


        if (gettedBalance >= 1000) {

            bonusBalance = gettedBalance / 100;
            overall = balance + bonusBalance + gettedBalance;


        } else {
            overall = balance + gettedBalance;
        }
        System.out.println(overall);
    }
}
