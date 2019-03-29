package string;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    /**
     * 字符串的作用：1.匹配 2.替换 3.切割 4.获取
     *
     * 正则表达式中各种字符的意思：
     * .代表任意字符
     * ^表示字符串开头或非
     * +代表1个或多个字符
     * *代表0个或多个字符
     * ?代表0个或1个字符
     * $代表字符串结尾 $1表示前一个参数的第一组
     * []代表字符集，多项单选
     * -表示区间，比如[0-9]表示数字0-9中选其一
     * ()代表捕获组，()内的称为一个组，捕获组后面的\\i里面的i代表捕获组的位置，从1开始
     * {}表示匹配次数
     * \代表反转，常用的有\\d,表示任意数字；\\w代表任意字符;\\s代表任意白字符，像空格、Tab、\n\r换行，回车
     */

    public boolean ipLegal() {
        String ipRegEx =
                "^([1-9]|([1-9][0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))(.([0-9]|([1-9][0-9])|" + "(1[0" + "-9][0" +
                        "-9])|(2[0-4][0-9])|(25[0-5]))){3}$";
        Pattern p = Pattern.compile(ipRegEx);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入ip：");
        String input = scanner.next();
        Matcher m = p.matcher(input);
        if (m.matches()) {
            System.out.println("合法");
            return true;
        } else {
            System.out.println("不合法");
            return false;
        }
    }

    public boolean phoneNumberLegalTest() {
        //134，159，187开头
        String regex = "^1(34|59|87)\\d{8}";
        Pattern p = Pattern.compile(regex);
        Scanner s = new Scanner(System.in);
        System.out.println("请输入任意手机号：");
        String phoneNumber = s.next();
        Matcher m = p.matcher(phoneNumber);
        if (m.matches()) {
            System.out.println("合法");
            return true;
        } else {
            System.out.println("不合法");
            return false;
        }
    }

    //1.255.255.255
    public boolean test(String string) {
        String regex = "[1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println("合法");
            return true;
        } else {
            System.out.println("不合法");
            return false;
        }
    }

    public static void main(String[] args) {

        //字符串的作用：1.匹配 2.替换 3.切割 4.获取

        //判断一个ip是否合法(1-255).(0-255).(0-255).(0-255)
        Regex regex = new Regex();
        //regex.ipLegal();

        String QQ = "11122222";
        String phoneNumber = "18911281036";
        String xiabida = "123-456.789";
        String phoneNumber2 = "18310061886";
        String regex2 = "(.)(.)\\2+";
        String regex3 = "^1(38|57|89)[0-9]{8}";
        String regex4 = "^[1-9]\\d{2}-\\d{3}.\\d{3}";
        String regex5 = "(^1\\d{2})(\\d{4})(\\d{4})";
        System.out.println(QQ.replaceAll(regex2,"$1$2"));
        System.out.println(phoneNumber.matches(regex3));
        System.out.println(xiabida.matches(regex4));
        System.out.println(phoneNumber2.replaceAll(regex5,"$1****$3"));
        //regex.phoneNumberLegalTest();
        regex.test("255");
    }

}
