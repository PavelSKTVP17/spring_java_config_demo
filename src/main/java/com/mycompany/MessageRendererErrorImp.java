package com.mycompany;


public class MessageRendererErrorImp  implements  MessageRenderer
{
    private Message msg;
    private Message msgBye;

    public MessageRendererErrorImp(Message msg, Message msg2) {
        this.msg = msg; this.msgBye = msg2;
    }

    @Override
    public void printMessage() {
        System.out.println( msg.getText() );
        System.out.println( msgBye.getText() );
    }
    
}
