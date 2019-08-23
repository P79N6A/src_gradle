package com.bytedance.android.livesdk.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17311a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f17312b = new r();

    private r() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17311a, false, 13389, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17311a, false, 13389, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
