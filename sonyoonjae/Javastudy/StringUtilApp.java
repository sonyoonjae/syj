package com.sonyoonjae.Javastudy;

public class StringUtilApp {

    public static void main(String[] args) {

        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("��� ���ڿ�:" + resultStr);
    }

}
