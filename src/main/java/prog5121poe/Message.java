package prog5121poe;

public class Message {

    private String messageText;
    private String recipient;
    private String messageID;
    private static int messageCounter = 0;
    private int messageNumber;
    private String messageHash;

    
public Message(String recipient, String messageText) {
    this.recipient = recipient;
    this.messageText = messageText;

this.messageID = String.format("%010d",
        (long) (Math.random() * 10000000000L));
    
messageCounter++;
this.messageNumber = messageCounter;
this.messageHash = createMessageHash();
}
public String getMessageID()
    return messageID;
}

    public String getMessageText() {
        return messageText;
    }

    public String getRecipient() {
        return recipient;
    }

public boolean checkMessageLength() {
    return messageText != null
            && messageText.length() <= 250;
} 

public String createMessageHash() {
    if (messageText == null || messageText.trim().isEmpty()) {
        return "";
    }

    String[] words = messageText.trim().split("\\s+");

    String firstWord = words[0];
    String lastWord = words[words.length - 1];

    return (messageID.substring(0, 2)
            + ":" + messageNumber
            + ":" + firstWord + lastWord).toUpperCase();
}

public String getMessageHash() {
    return messageHash;

public boolean checkRecipientCell() {
    return recipient != null
            && recipient.matches("\\+27\\d{9}");
}
    
public String sentMessage(String choice) {
    switch (choice.toLowerCase()) {
        case "send":
            return "Message successfully sent.";
        case "store":
            return "Message successfully stored.";
        case "discard":
            return "Press 0 to delete message.";
        default:
            return "Invalid option.";
    }

