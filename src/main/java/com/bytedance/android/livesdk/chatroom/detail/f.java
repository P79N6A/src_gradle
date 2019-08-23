package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public final class f implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9933a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9934b = false;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f9935c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    private final long f9936d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9937e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9938f;
    private final boolean g;
    private final a h;
    private Gson i;
    private long j = ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.a()).intValue());

    public interface a {
        void a(int i);

        boolean a();

        void b();

        void c();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9933a, false, 4068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9933a, false, 4068, new Class[0], Void.TYPE);
        } else if (this.f9934b) {
            this.f9934b = false;
            this.f9935c.removeCallbacksAndMessages(null);
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9933a, false, 4070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9933a, false, 4070, new Class[0], Void.TYPE);
        } else if (!this.f9934b || !this.h.a()) {
            a();
        } else {
            h.a().a(this.f9935c, this.f9936d, this.f9937e, this.g, 7);
            if (this.j > 0 && this.j >= ((long) ((Integer) LiveConfigSettingKeys.AUDIENCE_PING_INTERVAL.a()).intValue())) {
                this.f9935c.sendMessageDelayed(this.f9935c.obtainMessage(8), this.j * 1000);
            }
        }
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f9933a, false, 4069, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f9933a, false, 4069, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f9934b) {
            switch (message2.what) {
                case e.l /*?: ONE_ARG  (7 int)*/:
                    Object obj = message2.obj;
                    if (PatchProxy.isSupport(new Object[]{obj}, this, f9933a, false, 4071, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj}, this, f9933a, false, 4071, new Class[]{Object.class}, Void.TYPE);
                        break;
                    } else {
                        if (this.f9934b) {
                            if (!(obj instanceof com.bytedance.android.live.a.a.b.a)) {
                                if (obj instanceof PingResult) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    com.bytedance.android.live.core.c.a.b(2, "pingresult", this.i.toJson(obj));
                                    String valueOf = String.valueOf(System.currentTimeMillis() - currentTimeMillis);
                                    if (PatchProxy.isSupport(new Object[]{"pingresultCostTime", valueOf}, null, com.bytedance.android.live.core.c.a.f7834a, true, 266, new Class[]{String.class, String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{"pingresultCostTime", valueOf}, null, com.bytedance.android.live.core.c.a.f7834a, true, 266, new Class[]{String.class, String.class}, Void.TYPE);
                                    } else {
                                        com.bytedance.android.live.core.c.a.a(2, "pingresultCostTime", valueOf);
                                    }
                                    PingResult pingResult = (PingResult) obj;
                                    this.j = pingResult.getNextPingInterval();
                                    if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f9936d) {
                                        this.h.b();
                                        break;
                                    } else if (pingResult.getMosaicStatus() != 0) {
                                        pingResult.getRoomId();
                                        pingResult.getMosaicStatus();
                                    }
                                }
                            } else {
                                int errorCode = ((com.bytedance.android.live.a.a.b.a) obj).getErrorCode();
                                if (30001 != errorCode && 30003 != errorCode && 30004 != errorCode) {
                                    if (50002 == errorCode) {
                                        this.h.c();
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

    public f(long j2, long j3, String str, boolean z, a aVar) {
        this.f9936d = j2;
        this.f9937e = j3;
        this.f9938f = str;
        this.g = false;
        this.h = aVar;
        this.i = com.bytedance.android.live.a.a();
    }
}
