package prog5121poe;

public class Message {

    private String messageText;
    private String recipient;
    private String messageID;

    
public Message(String recipient, String messageText) {
    this.recipient = recipient;
    this.messageText = messageText;

    this.messageID = String.format("%010d",
            (long) (Math.random() * 10000000000L));
}

public String getMessageID() {
    return messageID;
}

    }

    public String getMessageText() {
        return messageText;
    }

    public String getRecipient() {
        return recipient;
    }
}

public boolean checkMessageLength() {
    return messageText != null
            && messageText.length() <= 50;
}
