package mytest;

public class Test {
    public static void main(String[] args){
        Son son=new Son();
        son.say();
        Father father=(Father) son;
        father.say();

        //复写的永远优先


        String  str1 = "abcd";
        String  str2 = "abcd";
        String  str3 = "ab" + "cd";
        String  str4 = "ab";
        str4 += "cd";
        System.out.println(str1  == str2);
        System.out.println(str1  == str3);
        System.out.println(str1  == str4);
        str2  += "e";
        System.out.println(str1  == str2);
    }
}
