package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //char
        //string
        char charA = 'A';
        char charB = 'B';
        System.out.println( "charA = " + (int)charA ); //65
        System.out.println( "charB = " + (int)charB ); //66

        //hashCode
        System.out.println();
        int hashCode = hashCode( "A" );
        System.out.println( "hashCode(\"A\") = " + hashCode( "A" ) );
        System.out.println( "hashCode(\"B\") = " + hashCode( "B" ) );
        System.out.println( "hashCode(\"C\") = " + hashCode( "AB" ) );

        //hashIndex
        int hashCodeA = hashCode( "A" );
        int hashIndex = hashIndex( hashCodeA );
        System.out.println( "hashIndex = " + hashIndex );

    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;

    }
}
