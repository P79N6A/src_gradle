package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.a.a.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9924a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9925b;

    d(b bVar) {
        this.f9925b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9924a, false, 4058, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9924a, false, 4058, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f9925b;
        Throwable th = (Throwable) obj;
        if (bVar.f9919c) {
            if (th instanceof a) {
                a aVar = (a) th;
                bVar.a(aVar.getErrorCode(), aVar.getErrorMsg());
                return;
            }
            bVar.a(0, th.toString());
        }
    }
}
