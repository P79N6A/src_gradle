package anet.channel.monitor;

public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f1235a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1236b;

    public final int getCode() {
        return this.f1236b;
    }

    public final String getDesc() {
        return this.f1235a;
    }

    public static NetworkSpeed valueOfCode(int i) {
        if (i == 1) {
            return Slow;
        }
        return Fast;
    }

    private NetworkSpeed(String str, int i) {
        this.f1235a = str;
        this.f1236b = i;
    }
}
