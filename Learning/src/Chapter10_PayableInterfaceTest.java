// Fig. 10.15: PayableInterfaceTest.java
// Tests interface Payable.

public class Chapter10_PayableInterfaceTest 
{
   public static void main( String[] args )
   {
      // create four-element Payable array
      Chapter10_Payable[] payableObjects = new Chapter10_Payable[ 4 ];
      
      // populate array with objects that implement Payable
      payableObjects[ 0 ] = new Chapter10_Invoice( "01234", "seat", 2, 375.00 );
      payableObjects[ 1 ] = new Chapter10_Invoice( "56789", "tire", 4, 79.95 );
      payableObjects[ 2 ] =  new Chapter10_SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
      payableObjects[ 3 ] = new Chapter10_SalariedEmployee( "Lisa", "Barnes", "888-88-8888", 1200.00 );

      System.out.println( "Invoices and Employees processed polymorphically:\n" ); 

      // generically process each element in array payableObjects
      for ( Chapter10_Payable currentPayable : payableObjects )
      {
         // output currentPayable and its appropriate payment amount
         System.out.printf( "%s \n%s: $%,.2f\n\n", 
            currentPayable.toString(), 
            "payment due", currentPayable.getPaymentAmount() ); 
      } // end for
   } // end main
} // end class PayableInterfaceTest
