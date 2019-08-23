package com.bytedance.android.livesdk.chatroom.interact.a;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.a.h;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10277a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10278b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10279c;

    f(a aVar, long j) {
        this.f10278b = aVar;
        this.f10279c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10277a, false, 4613, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10277a, false, 4613, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10278b;
        long j = this.f10279c;
        d dVar = (d) obj;
        if (dVar.f7870a == 0) {
            LinkAutoMatchModel linkAutoMatchModel = (LinkAutoMatchModel) dVar.f7871b;
            if (linkAutoMatchModel.getRivalRoom() != null) {
                aVar.f10267e = false;
                if (aVar.f10266d != null) {
                    aVar.f10266d.dispose();
                    aVar.f10266d = null;
                }
                for (h.a b2 : aVar.f10264b) {
                    if (b2.b(linkAutoMatchModel)) {
                        break;
                    }
                }
            } else if (j == 0) {
                aVar.f10267e = false;
                for (h.a b3 : aVar.f10264b) {
                    if (b3.b()) {
                        break;
                    }
                }
            } else {
                for (h.a a2 : aVar.f10264b) {
                    if (a2.a(linkAutoMatchModel)) {
                        break;
                    }
                }
            }
        }
    }
}
