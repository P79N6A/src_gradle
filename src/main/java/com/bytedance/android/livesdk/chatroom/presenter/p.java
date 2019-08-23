package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.presenter.n;
import com.bytedance.android.livesdk.gift.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11386a;

    /* renamed from: b  reason: collision with root package name */
    private final n f11387b;

    p(n nVar) {
        this.f11387b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11386a, false, 5186, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11386a, false, 5186, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        n nVar = this.f11387b;
        Throwable th = (Throwable) obj;
        nVar.f11378e = false;
        o.a(nVar.f11376c.f15105d, nVar.f11379f.getId(), th);
        if (nVar.b() != null) {
            if (th instanceof a) {
                a aVar = (a) th;
                if (40001 == aVar.getErrorCode()) {
                    ((n.a) nVar.b()).a();
                } else {
                    ((n.a) nVar.b()).a(aVar.getPrompt());
                }
            } else {
                ((n.a) nVar.b()).c();
            }
        }
    }
}
