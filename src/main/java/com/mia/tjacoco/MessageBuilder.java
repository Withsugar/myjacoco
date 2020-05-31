package com.mia.tjacoco;


public class MessageBuilder {

    public static final String PROVIDED = "Please provide a name!";
    public static final String HELLO = "Hello ";

    public static String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if ("".equals(name)||null==name) {
            result.append(PROVIDED);
        } else {
            result.append(HELLO).append(name);
        }
        return result.toString();
    }

}
