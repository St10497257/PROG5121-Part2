package prog5121poe;

public class Message {

    private String messageText;
    private String recipient;

    public Message(String recipient, String messageText) {
        this.recipient = recipient;
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getRecipient() {
        return recipient;
    }
}
