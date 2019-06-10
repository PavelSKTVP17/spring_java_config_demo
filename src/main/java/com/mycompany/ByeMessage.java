package com.mycompany;


public class ByeMessage implements Message
{
    private String txt;

    public ByeMessage(String txt) {
        this.txt = "Bye"+txt;
    }

    @Override
    public String getText() {
        return txt;
    }
    
}
