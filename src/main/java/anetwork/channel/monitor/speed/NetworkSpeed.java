package anetwork.channel.monitor.speed;

public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    
    private final int code;
    private final String desc;

    public final int getCode() {
        return this.code;
    }

    public final String getDesc() {
        return this.desc;
    }

    public static NetworkSpeed valueOfCode(int i) {
        if (i == 1) {
            return Slow;
        }
        return Fast;
    }

    private NetworkSpeed(String str, int i) {
        this.desc = str;
        this.code = i;
    }
}
