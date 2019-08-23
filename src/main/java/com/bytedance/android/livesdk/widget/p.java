package com.bytedance.android.livesdk.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18529a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f18530b = new p();

    private p() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18529a, false, 14508, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18529a, false, 14508, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("LiveTagPicker", (Throwable) obj);
    }
}
