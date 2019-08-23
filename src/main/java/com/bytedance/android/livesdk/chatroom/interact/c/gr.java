package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.data.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gr implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10764a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10765b;

    gr(gc gcVar) {
        this.f10765b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10764a, false, 5001, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10764a, false, 5001, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        gc gcVar = this.f10765b;
        d dVar = (d) obj;
        if (dVar.f7871b == null || ((a) dVar.f7871b).f10863a == null || ((a) dVar.f7871b).f10863a.f11019b == null || !((a) dVar.f7871b).f10863a.f11019b.g) {
            gcVar.c();
            return;
        }
        gcVar.f10732b = false;
        gcVar.a((a) dVar.f7871b);
    }
}
