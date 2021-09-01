public class javaBasicClassOne {
    public static void main(String[] args){
        //byte类型
        byte max  = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        System.out.println(max);  //127
        System.out.println(min); //-128
        byte a = 120;
        System.out.println(a);
        /*
        byte b = 128; // 报错超出范围 java: 不兼容的类型: 从int转换到byte可能会有损失
        System.out.println(b);
        */
        //short类型
        short max2  = Short.MAX_VALUE;
        short min2 = Short.MIN_VALUE;
        System.out.println(max2); // 32767
        System.out.println(min2); // -32768
        //int类型 32位的2进制数字
        int max3  = Integer.MAX_VALUE;
        int min3 = Integer.MIN_VALUE;
        System.out.println(max3);
        System.out.println(min3);
        int aa = 10000;   //十进制
        int bb = 0xef12ab; //十六进制
        int cc = 01237; //八进制
        int dd = 0b01110; //二进制
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
        //long类型 64位的2进制数字
        long max4 = Long.MAX_VALUE;
        long min4 = Long.MIN_VALUE;
        System.out.println(max4);
        System.out.println(min4);

        //long类型初始化
        long l = 12345; //十进制的直接量
        long L = 123456L;
        System.out.println(l);
        System.out.println(L);

        long L16 = 0x123efefL;
        long L8 = 07232332;
        System.out.println(L16);
        System.out.println(L8);
    }

}
