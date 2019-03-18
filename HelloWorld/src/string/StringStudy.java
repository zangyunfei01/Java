package string;

public class StringStudy {
    public static void main(String[] args) {

        /**
         * 通过赋值操作创建的字符串是放在常量池中的。
         * 首先是在常量池中找下有没有"abc"这个常量，如果有，那么直接用，不创建；如果没有，创建一个"abc"常量
         * 然后创建一个String类型常量的引用str1，指向"abc"常量
         * 当再给str2赋值为"abc"的时候，引用会指向已存在的"abc"常量，就不创建，直接拿来用了
         *
         * 字符串str3中，str2是作为str3的一个变量的。
         * 这种字符串中有变量的形式，和常量或其他变量拼接后，就会生成新的字符串，所以str3和str5的内存地址不同
         * 进一步讲就是str3的写法其实是new出来的（str4的创建过程就是str3的内部处理过程）
         * new出来的变量会在堆中开辟内存来存储，而str5是直接存放在字符串常量池中的，所以str3和str5的内存地址不同
         *
         * str6虽然和str3一模一样，但是都包含变量str2，所以都是分别创建的新的字符串，所以str3和str6内存地址也是不同的
         *
         * str7是由两个常量拼接的字符串，它其实就是"abcdef"，所以str7和str8指向同一块内存地址
         * */

        String str1 = "abc";
        String str2 = "abc";
        String str3 = str2 + "d";
        String str4 = new StringBuilder().append(str2).append("d").toString();
        String str5 = "abcd";
        String str6 = str2 + "d";
        String str7 = "abcd" + "ef";
        String str8 = "abcdef";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str3 == str6);
        System.out.println(str7 == str8);

        System.out.println(str3);
        System.out.println(str5.intern());
    }
}
