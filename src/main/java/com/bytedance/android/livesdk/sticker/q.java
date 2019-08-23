package com.bytedance.android.livesdk.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17309a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f17310b = new q();

    private q() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17309a, false, 13388, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17309a, false, 13388, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
