package com.bytedance.android.live.core.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8359a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f8360b = new c();

    private c() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8359a, false, 1498, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8359a, false, 1498, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("CustomFontTextView", (Throwable) obj);
    }
}
