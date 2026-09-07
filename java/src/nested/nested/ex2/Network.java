package afinal.nested.nested.ex2;

import afinal.nested.nested.ex1.NetworkMessage;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }


}
