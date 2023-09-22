package org.example.behavioral.mediator;

public class ConcreteChatRoom implements ChatRoom{

//    private CEO ceo;
//    private Employee employee;
//
//    public ConcreteChatRoom(CEO ceo, Employee employee) {
//        this.ceo = ceo;
//        this.employee = employee;
//    }

    @Override
    public void sendMesssage(Person person, String message) {
        person.receive(message);
    }
}

/**
 * In this example, the ConcreteChatRoom acts as the mediator that centralizes the communication between users (User objects).
 * Users send messages to each other using the sendMessage method, but they do so through the chat room mediator, which ensures that messages are relayed appropriately.
 * This pattern keeps the users decoupled from each other and simplifies the management of message exchanges.
 */