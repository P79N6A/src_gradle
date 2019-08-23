package com.bytedance.android.livesdk.feed.roomdetector;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public final class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14366a;

    /* renamed from: b  reason: collision with root package name */
    final Handler f14367b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    boolean f14368c = false;

    /* renamed from: d  reason: collision with root package name */
    private final long f14369d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14370e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14371f;
    private final boolean g;
    private final a h;
    private Gson i;
    private long j = ((long) ((Integer) com.bytedance.android.livesdk.feed.j.b.h.a()).intValue());

    public interface a {
        void a(int i);

        void a(long j, long j2);

        boolean c();

        void d();

        void e();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14366a, false, 8864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14366a, false, 8864, new Class[0], Void.TYPE);
        } else if (this.f14368c) {
            this.f14368c = false;
            this.f14367b.removeCallbacksAndMessages(null);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14366a, false, 8866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14366a, false, 8866, new Class[0], Void.TYPE);
        } else if (!this.f14368c || !this.h.c()) {
            a();
        } else {
            ((RoomRetrofitApi) d.a().d().a(RoomRetrofitApi.class)).sendPlayingPing(this.f14369d, 1).compose(i.a()).subscribe(new c(this), new d(this));
            if (this.j > 0 && this.j >= ((long) ((Integer) com.bytedance.android.livesdk.feed.j.b.h.a()).intValue())) {
                this.f14367b.sendMessageDelayed(this.f14367b.obtainMessage(8), this.j * 1000);
            }
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f14366a, false, 8865, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f14366a, false, 8865, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f14368c) {
            switch (message.what) {
                case e.l /*?: ONE_ARG  (7 int)*/:
                    Object obj = message.obj;
                    if (PatchProxy.isSupport(new Object[]{obj}, this, f14366a, false, 8867, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj}, this, f14366a, false, 8867, new Class[]{Object.class}, Void.TYPE);
                        break;
                    } else {
                        if (this.f14368c) {
                            if (!(obj instanceof com.bytedance.android.live.a.a.b.a)) {
                                if (obj instanceof PingResult) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    com.bytedance.android.live.core.c.a.b(4, "pingresult", this.i.toJson(obj));
                                    com.bytedance.android.live.core.c.a.b("pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                                    PingResult pingResult = (PingResult) obj;
                                    this.j = pingResult.getNextPingInterval();
                                    if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f14369d) {
                                        this.h.d();
                                        break;
                                    } else if (pingResult.getMosaicStatus() != 0) {
                                        this.h.a(pingResult.getRoomId(), (long) pingResult.getMosaicStatus());
                                    }
                                }
                            } else {
                                int errorCode = ((com.bytedance.android.live.a.a.b.a) obj).getErrorCode();
                                if (30001 != errorCode && 30003 != errorCode && 30004 != errorCode) {
                                    if (50002 == errorCode) {
                                        this.h.e();
                                        break;
                                    }
                                } else {
                                    this.h.a(errorCode);
                                }
                            }
                        }
                        return;
                    }
                    break;
                case 8:
                    b();
                    break;
            }
        }
    }

    public b(long j2, long j3, String str, boolean z, a aVar) {
        this.f14369d = j2;
        this.f14370e = j3;
        this.f14371f = str;
        this.g = z;
        this.h = aVar;
        this.i = com.bytedance.android.live.a.a();
    }
}
