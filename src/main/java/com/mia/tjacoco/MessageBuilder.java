package com.mia.tjacoco;


public class MessageBuilder {

    public static final String PROVIDED = "Please provide a name!";
    public static final String HELLO = "Hello ";

    public static String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if ("".equals(name)||null==name) {
            result.append(PROVIDED);
        } else if(HELLO.equals(name)){
            result.append("This is a hello!");
        }else {
            result.append(HELLO).append(name);
        }
        return result.toString();
    }

    public static int getMulRet(int a,int b) {

        if(a>0&&b>0){
            return a*b;
        }
        return 0;

    }
}
