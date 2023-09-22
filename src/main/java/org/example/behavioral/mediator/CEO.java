package org.example.behavioral.mediator;

public class CEO implements Person{
    private String name;
    private ChatRoom chatRoom;

    public CEO(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(Person person, String message) {
        chatRoom.sendMesssage(person, message);
    }


    @Override
    public String receive(String msg) {
        System.out.println( name + " received: " + msg);
        return msg;
    }
}
