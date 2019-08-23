package anet.channel.strategy.dispatch;

public class DispatchEvent {
    public final int eventType;
    public final Object extraObject;

    public DispatchEvent(int i, Object obj) {
        this.eventType = i;
        this.extraObject = obj;
    }
}
