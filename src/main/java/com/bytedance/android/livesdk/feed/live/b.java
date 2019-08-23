package com.bytedance.android.livesdk.feed.live;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14257a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLiveViewHolder f14258b;

    b(BaseLiveViewHolder baseLiveViewHolder) {
        this.f14258b = baseLiveViewHolder;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14257a, false, 8719, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14257a, false, 8719, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        BaseLiveViewHolder baseLiveViewHolder = this.f14258b;
        if (((Boolean) obj).booleanValue() && baseLiveViewHolder.f8337c) {
            baseLiveViewHolder.a(baseLiveViewHolder.j);
        }
    }
}
