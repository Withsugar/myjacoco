package com.mia.tjacoco;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageBuilderTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

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
