package com.bytedance.android.livesdk.gift.panel.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15342a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f15343b = new b();

    private b() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15342a, false, 9932, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15342a, false, 9932, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("DouyinGiftPanelBottomWidget", (Throwable) obj);
    }
}
