package com.bytedance.android.livesdk.browser.jsbridge.c;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9452a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9453b = new c();

    private c() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9452a, false, 3620, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9452a, false, 3620, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("ClipboardMethod", (Throwable) obj);
    }
}
