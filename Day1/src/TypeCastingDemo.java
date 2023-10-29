public class TypeCastingDemo {
    public static void main(String[] args) {

        //widening typecasting/implicit typecasting
        byte b = 23;
        long l = b;
        System.out.println(l);

        float f = 12.45f;
        double d = f;
        System.out.println(d);

        char ch = 'A';
        int i2 = ch;
        System.out.println(i2);

        char var1 = '\u00A4';
        long l2 = var1;
        System.out.println(l2);

        System.out.println("******************************");

        //narrowing typecasting/explicit typecasting
        double d1 = 64886.976d;
        int l3 = (int)d1;
        char f2 = (char)d1;
        System.out.println(l3);
        System.out.println(f2);

        long sap = 764679938;
        byte b2 = (byte)sap;
        short abc = (short)sap;
        System.out.println(b2);
        System.out.println(abc);

    }
    
}
