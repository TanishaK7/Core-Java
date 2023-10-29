public class PrimitiveDatatypesDemo {
    public static void main(String[] args) {
        
        //byte takes 1 byte
        byte byteMax = 127;
        byte byteMin = -128;
        
        System.out.println("Min range of byte is " + byteMin + " and" + " Max range of byte is " + byteMax);

        //short takes 2 bytes
        short shortMax = 32767;
        short shortMin = -32768;
        
        System.out.println("Min range of short is " + shortMin + " and" + " Max range of short is " + shortMax);

        //int takes 4 bytes
        int intMax = 2147483647;
        int intMin = -2147483648;
        
        System.out.println("Min range of int is " + intMin + " and" + " Max range of int is " + intMax);

        //long takes 8 bytes
        long longMax = 9223372036854775807L;
        long longMin = -9223372036854775808L;
        
        System.out.println("Min range of long is " + longMin + " and" + " Max range of long is " + longMax);

        //boolean
        boolean var = false;
        System.out.println("Boolean value is " + var);

    }
    }
    

