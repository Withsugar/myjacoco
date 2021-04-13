package com.mia.tjacoco;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MessageBuilderTest {

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("开始class之前");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("结束class之后");
    }

    @Test
    public void testNameMessage() {
        String name = "Jake";
        MessageBuilder messageBuilder = new MessageBuilder();
        Assert.assertEquals(MessageBuilder.HELLO + name, messageBuilder.getMessage(name));
    }

    @Test
    public void testEmptyMessage() {
        String name="";
        MessageBuilder messageBuilder = new MessageBuilder();
        Assert.assertEquals(MessageBuilder.PROVIDED, messageBuilder.getMessage(name.trim()));
    }

    @Test
    public void testNullMessage() {
        String name=null;
        MessageBuilder messageBuilder = new MessageBuilder();
        Assert.assertEquals(MessageBuilder.PROVIDED, messageBuilder.getMessage(name));
    }


}
