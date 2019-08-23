package com.bytedance.android.livesdk.rank.c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.rank.a.a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements a.C0117a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16933a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakHandler f16934b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    private final a.b f16935c;

    /* renamed from: d  reason: collision with root package name */
    private final long f16936d;

    /* renamed from: e  reason: collision with root package name */
    private final long f16937e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16938f = false;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16933a, false, 13069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16933a, false, 13069, new Class[0], Void.TYPE);
        } else if (!this.f16938f) {
            this.f16938f = true;
            h.a().a((Handler) this.f16934b, this.f16937e, this.f16936d, 12, 0);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16933a, false, 13070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16933a, false, 13070, new Class[0], Void.TYPE);
            return;
        }
        this.f16934b.removeCallbacksAndMessages(null);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{16}, this, f16933a, false, 13067, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{16}, this, f16933a, false, 13067, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        h.a().a((Handler) this.f16934b, this.f16937e, this.f16936d, 16, 0);
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f16933a, false, 13068, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f16933a, false, 13068, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        long j = 0;
        if (message.what == 12) {
            this.f16938f = false;
            if (message.obj instanceof Exception) {
                this.f16935c.a((Exception) message.obj);
                return;
            }
            b bVar = (b) message.obj;
            com.bytedance.android.livesdk.rank.model.a aVar = (com.bytedance.android.livesdk.rank.model.a) bVar.f7871b;
            if (bVar.f7872c != null) {
                j = bVar.f7872c.now;
            }
            aVar.k = j;
            this.f16935c.a(aVar);
        } else if (message.obj instanceof Exception) {
            this.f16935c.a(null, message.what);
        } else {
            b bVar2 = (b) message.obj;
            com.bytedance.android.livesdk.rank.model.a aVar2 = (com.bytedance.android.livesdk.rank.model.a) bVar2.f7871b;
            if (bVar2.f7872c != null) {
                j = bVar2.f7872c.now;
            }
            aVar2.k = j;
            this.f16935c.a(aVar2, message.what);
        }
    }

    public a(a.b bVar, long j, long j2) {
        this.f16935c = bVar;
        this.f16936d = j;
        this.f16937e = j2;
    }
}
