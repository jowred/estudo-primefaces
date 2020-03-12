package com.mkyong.editor;

import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;

@NamedEvent
@RequestScoped
public class BasicView {
     
    private String text;
    
    BasicView() {
        this.text = "Hello World!";
    }
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}