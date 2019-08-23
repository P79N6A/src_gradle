package anet.channel.strategy;

public class ConnEvent {
    public long connTime = Long.MAX_VALUE;
    public boolean isSuccess;

    public String toString() {
        if (this.isSuccess) {
            return "ConnEvent#Success";
        }
        return "ConnEvent#Fail";
    }
}
