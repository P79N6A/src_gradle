package anet.channel.request;

import anet.channel.util.ALog;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;

public class c implements Cancelable {
    public static final c NULL = new c(null, 0, null);

    /* renamed from: a  reason: collision with root package name */
    private final int f1276a;

    /* renamed from: b  reason: collision with root package name */
    private final SpdySession f1277b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1278c;

    public void cancel() {
        try {
            if (!(this.f1277b == null || this.f1276a == 0)) {
                ALog.i("awcn.TnetCancelable", "cancel tnet request", this.f1278c, "streamId", Integer.valueOf(this.f1276a));
                this.f1277b.streamReset((long) this.f1276a, 5);
            }
        } catch (SpdyErrorException e2) {
            ALog.e("awcn.TnetCancelable", "request cancel failed.", this.f1278c, e2, "errorCode", Integer.valueOf(e2.SpdyErrorGetCode()));
        }
    }

    public c(SpdySession spdySession, int i, String str) {
        this.f1277b = spdySession;
        this.f1276a = i;
        this.f1278c = str;
    }
}
