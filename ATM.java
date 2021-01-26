public class ATM {
    public int countBanknotes(int sum) {


        int banknotes[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int maxBanknote = banknotes.length - 1;
        int quantityBanknotes = 0;

        while (maxBanknote >= 0) {
            if (banknotes[maxBanknote] > sum) {
                maxBanknote--;

            }
            else {
               // System.out.println(banknotes[maxBanknote]);               // Є можливість вивести покупюрно!
                sum -= banknotes[maxBanknote];
                quantityBanknotes++;
            }

        }
        return quantityBanknotes;
    }

    public static void main(String[] args) {
        ATM cash = new ATM();

        // Should be 500+50+20+5+2+1 = 6
        System.out.println("Total quantity of banknotes : " + cash.countBanknotes(578));
    }
}
