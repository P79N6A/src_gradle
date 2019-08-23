package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15481a;

    /* renamed from: b  reason: collision with root package name */
    private final u f15482b;

    public w(u uVar) {
        this.f15482b = uVar;
    }

    public final void accept(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15481a, false, 9321, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15481a, false, 9321, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Throwable th = (Throwable) obj;
        this.f15482b.f15475b = false;
        if (th == null) {
            str = "";
        } else {
            str = th.getMessage();
        }
        o.d(str);
    }
}
