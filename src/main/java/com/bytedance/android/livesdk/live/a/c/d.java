package com.bytedance.android.livesdk.live.a.c;

import com.bytedance.android.live.a.a.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15795a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15796b;

    d(b bVar) {
        this.f15796b = bVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15795a, false, 10306, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15795a, false, 10306, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f15796b;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            bVar.f15790b.c(((a) th).getErrorCode());
        }
        bVar.f15790b.c(0);
    }
}
