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
      int i;
      int currentValue = 1;
     

      for(int primesFoundSoFar = 2; primesFoundSoFar <= numberOfPrimes; primesFoundSoFar++) {
       notPrime=true;
       listOfPrime[primesFoundSoFar] = currentValue = partial(currentValue,notPrime);
      }
  }
        
  private int partialCalculation(int currentValue, boolean notPrime){
  	do{
          currentValue = currentValue + 2;
          
          if (currentValue == squareOfPrime) {
            ord = ord + 1;
            squareOfPrime = listOfPrimes[ord] * listOfPrimes[ord];
            multiple[ord - 1] = currentValue;
          }
          
          int i = 2;//i is a counter
          notPrime = true;
          while (i < ord && notPrime) {
            while (multiple[i] < currentValue)
              multiple[i] = multiple[i] + listOfPrimes[i] + listOfPrimes[i];
            if (multiple[i] == currentValue)
              notPrime = false;
            i = i + 1;
          }
        } while (!notPrime);
        return currentValue;
      }

   
    public void printPrimes() {
        int pageNumber = 1;
        int pageOffset = 1;
        while (pageOffset <= numberOfPrimes) {
          System.out.println("The First " + numberOfPrimes +
                               " Prime Numbers --- Page " + pageNumber);
          System.out.println("");
          
          printRow(pageOffset, rowsPerPage, columnsPerPage);
          System.out.println("\f")
          pageNumber = pageNumber +1;
          
          pageOffset=pageOffset+rowsPerPage * numberOfColumns;
          
        }
    }
    
    public void printRow(int pageOffset, int rowsPerPage, int columnsPerPage){
    	
          for (int rowOffset = pageOffset; rowOffset < pageOffset + rowsPerPage; rowOffset++){
           
            for (int counter = 0; counter < columnPerPage ;counter++)
              if (rowOffset + counter * rowPerPage <= numberOfPrimes)
                System.out.format("%10d", listOfPrimes[rowOffSet + counter * rowPerPage]);
            System.out.println("");
          }
         
        }
    }
}

					 
