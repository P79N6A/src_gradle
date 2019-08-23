package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class at implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11239a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11240b;

    public at(af afVar) {
        this.f11240b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11239a, false, 5245, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11239a, false, 5245, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11240b;
        Throwable th = (Throwable) obj;
        if (afVar.f11208b != null) {
            afVar.f11208b.a(th);
        }
    }
}
