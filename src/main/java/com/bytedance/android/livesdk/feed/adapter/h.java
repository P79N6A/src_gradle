package com.bytedance.android.livesdk.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13974a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f13975b = new h();

    private h() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13974a, false, 8499, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13974a, false, 8499, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
