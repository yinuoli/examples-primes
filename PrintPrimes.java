public class PrintPrimes {
  int numberOfPrimes;
  int rowsPerPage;
  int columnsPerPage;
  int ordMax;
  int listOfPrimes[];
  int multple[];
  int ord;
  int squareOfPrime;

  public PrintPrimes(int numberOfPrimes, int RR, int CC, int ORDMAX) {
    this.numberOfPrimes   = numberOfPrimes;
    this.rowsPerPage  = RR;
    this.columnsPerPage  = CC;
    this.ordMax = ordMax;
    this.listOfPrimes = new int[numberOfPrimes + 1];
    this.multiple = new int[ordMax+1];
    this.ord=2;
    this.squareOfPrime=9;
    
  }


  public static void main(String[] args) {
      PrintPrimes printPrimes = new PrintPrimes(300, 50, 4, 30);
      printPrimes.calculatePrimes();
      printPrimes.printPrimes();
  }

  public void calculatePrimes() {
      /* Two is the only even prime. All other prime numbers are odd.
       * To simplify the code, we simply add 2 as a prime number, and
       * delegate the task of finding all odd prime numbers to a helper
       * function.
       */
      listOfPrimes[1] = 2;
      calculateOddPrimes();
  }

  private void calculateOddPrimes() {
      boolean notPrime;
      int N;
      int currentValue = 1;
     

      for(int primesFoundSoFar = 2; primesFoundSoFar <= numberOfPrimes; primesFoundSoFar++) {
       notPrime=true;
       listOfPrime[primesFoundSoFar] = currentValue = partial(currentValue,notPrime);
      }
  }
        
        
  private int partialCalculation(int J, boolean JPPRIME){
  	do{
  
          J = J + 2;
          if (J == SQUARE) {
            ORD = ORD + 1;
            SQUARE = listOfPrimes[ORD] * listOfPrimes[ORD];
            MULT[ORD - 1] = J;
          }
          
          int N = 2;
          JPRIME = true;
          while (N < ORD && JPRIME) {
            while (MULT[N] < J)
              MULT[N] = MULT[N] + listOfPrimes[N] + listOfPrimes[N];
            if (MULT[N] == J)
              JPRIME = false;
            N = N + 1;
          }
        } while (!JPRIME);
        return J;
      }

   
    public void printPrimes() {
        int PAGENUMBER = 1;
        int PAGEOFFSET = 1;
        while (PAGEOFFSET <= numberOfPrimes) {
          System.out.println("The First " + numberOfPrimes +
                               " Prime Numbers --- Page " + PAGENUMBER);
          System.out.println("");
          
          printRow(PAGEOFFSET, rowsPerPage, columnsPerPage);
          System.out.println("\f")
          PAGENUMBER = PAGENUMBER +1;
          
          PAGEOFFSET=PAGEOFFSET+rowsPerPage * numberOfColumns;
          
        }
    }
    
    public void printRow(int PAGEOFFSET, int rowsPerPage, int columnsPerPage){
    	
          for (int ROWOFFSET = PAGEOFFSET; ROWOFFSET < PAGEOFFSET + RR; ROWOFFSET++){
           
            for (int C = 0; C < CC;C++)
              if (ROWOFFSET + C * RR <= numberOfPrimes)
                System.out.format("%10d", listOfPrimes[ROWOFFSET + C * RR]);
            System.out.println("");
          }
         
        }
    }
}

					 
