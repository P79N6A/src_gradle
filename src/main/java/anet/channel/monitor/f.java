package anet.channel.monitor;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f1258a;

    /* renamed from: b  reason: collision with root package name */
    protected long f1259b;

    /* renamed from: c  reason: collision with root package name */
    private final double f1260c = 40.0d;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1261d = true;

    public int a() {
        return 0;
    }

    public boolean a(double d2) {
        return d2 < 40.0d;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        if (!this.f1261d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f1259b <= ((long) (a() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
            return true;
        }
        this.f1261d = false;
        return false;
    }
}
