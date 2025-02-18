public class Datatype {
    public static void main(String[] args) {
        int bigInt = Integer.MAX_VALUE, smallInt = Integer.MIN_VALUE;
        System.out.println(bigInt + " and " + smallInt);

        byte bigByte = Byte.MAX_VALUE, smallByte = Byte.MIN_VALUE;
        System.out.println(bigByte + " and " + smallByte);

        short bigShort = Short.MAX_VALUE, smallShort = Short.MIN_VALUE;
        System.out.println(bigShort + " and " + smallShort);

        float bigFloat = Float.MAX_VALUE, smallFloat = Float.MIN_VALUE;
        System.out.println(bigFloat + " and " + smallFloat);

        double bigDouble = Double.MAX_VALUE, smallDouble = Double.MIN_VALUE;
        System.out.println(bigDouble + " and " + smallDouble);

        System.out.println(567.84843765434797938589f);
        System.out.println();

        System.out.println(4.678D);

        System.out.println();
        System.out.println(3_000_000.35_566_4); //double
        System.out.println(346_736_723_653_672_367L);
        System.out.println(56736573265623567L);

        System.out.println();
        // three ways to assign a value to a character
        char a = 'D', b = '\u0044', c = 68; // literal, unicode, integer
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        System.out.println();
        char d = '?', e = '\u003F', f = 63;
        System.out.println("d: " + d + " e: " + e + " f: " + f);

        System.out.println((char) 122);
        System.out.println();

        //String is a class 
        System.out.println("cost: \u0024 2"); //unicode of dollar sign

        System.out.println();
        System.out.println('A' + 'B'); // 65 + 66 = 131

    }
}