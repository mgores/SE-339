public class test {

   public static void main(String[] args){
        MoneyMarketAccount sharpay =
                new MoneyMarketAccount("Sharpay␣Evans", 1, 2000000.00 , 4.25);
        System.out.println(sharpay.getInterestRate());
       Account troy =
               new SavingsAccount("Troy␣Bolton", 2,
                       3000.00 , 1.125);
       System.out.println(troy.getBalance());
       Account d = new MoneyMarketAccount("Mrs.␣Darbus", 4,
       10000.00 , 4.25);
      // InterestBearing chad = new CheckingAccount("Chad␣Danforth", 5, 777.77);
       //d.calculateInterest(365);

       /*
       Account kelsi =
               new SavingsAccount("Kelsi␣Nielsen", 3,
                       500.00 , 1.125);
       System.out.println(kelsi.getAccountInfo());
       //7

        */

       InterestBearing ryan =
               new MoneyMarketAccount("Ryan␣Evans", 6,
                       400000.00 , 1.125);
      System.out.println(((MoneyMarketAccount) ryan).getAccountInfo());
       CheckingAccount taylor = new CheckingAccount("Taylor␣McKessie", 8,
                       7000.00);
      System.out.println ((InterestBearing)taylor.getInterestRate());


Complex a = new Complex(4,5);
Complex b = (Complex) a.clone();
       System.out.println(a.equals(b));

int[] m = {1,2,3,4,5,6,7};
boolean y =hasI(m,0);



    }
    public static void methodA( int [] arr ) {
        int p=0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++) {
                p += arr[j] % 2;
            }
        }
    }
    public static boolean hasI(int[] arr, int i) {
        if (i == arr.length) return false;
        return arr[i] == 'i' ? true : hasI(arr, i + 1); }
}
