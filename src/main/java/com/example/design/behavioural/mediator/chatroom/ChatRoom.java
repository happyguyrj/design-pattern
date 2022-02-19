package com.example.design.behavioural.mediator.chatroom;

import java.util.Date;

// mediator class
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }
}
