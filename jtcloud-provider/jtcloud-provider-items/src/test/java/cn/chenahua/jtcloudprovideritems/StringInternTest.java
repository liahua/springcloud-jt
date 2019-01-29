package cn.chenahua.jtcloudprovideritems;

import org.junit.Test;

public class StringInternTest {


    /*上面是jdk源码中对intern方法的详细解释。简单来说就是intern用来返回常量池中的某字符串，如果常量池中已经存在该字符串，则直接返回常量池中该对象的引用。否则，在常量池中加入该对象，然后 返回引用。下面的一个例子详细的解释了intern的作用过程:*/
    @Test
    public void intern() {
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String temp = "hhhl";
        s3 = "hhhl";
        s1 = "" + temp;
        s2 = s1.intern();


        System.out.println(s1 == s3);  // f
        System.out.println(s1 == s2);    //f
        System.out.println(s2 == s3);   //t
    }
}

