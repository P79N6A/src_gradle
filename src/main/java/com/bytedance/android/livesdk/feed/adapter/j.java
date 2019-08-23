package com.bytedance.android.livesdk.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13978a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f13979b = new j();

    private j() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13978a, false, 8501, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13978a, false, 8501, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
