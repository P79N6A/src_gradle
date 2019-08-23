package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class aq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11233a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11234b;

    public aq(af afVar) {
        this.f11234b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11233a, false, 5242, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11233a, false, 5242, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11234b;
        Throwable th = (Throwable) obj;
        afVar.h = false;
        if (afVar.f11208b != null) {
            afVar.f11208b.a(th);
        }
    }
}
