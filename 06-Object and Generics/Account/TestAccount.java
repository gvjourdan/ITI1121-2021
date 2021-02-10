public class TestAccount {

    public static void main(String[] args){

        Account a, b;
        a = new Account( 1, new String( "Jane Doe" ) );
        b = new Account( 1, new String( "Jane Doe" ) );

        if ( a.equals( b ) ) {
            System.out.println( "a and b are equals" );
        } else {
            System.out.println( "a and b are not equals" );
        }

        b = null;
        if ( a.equals( b ) ) {
            System.out.println( "a and b are equals" );
        } else {
            System.out.println( "a and b are not equals" );
        }


        a.setName(null);
        if ( a.equals( b ) ) {
            System.out.println( "a and b are equals" );
        } else {
            System.out.println( "a and b are not equals" );
        }


        Integer i = new Integer(4);
        if ( a.equals( i ) ) {
            System.out.println( "a and i are equals" );
        } else {
            System.out.println( "a and i are not equals" );
        }
    }
}
