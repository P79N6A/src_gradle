package com.bytedance.android.livesdk.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8931a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveMultiTypeAdapter f8932b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8933c;

    e(LiveMultiTypeAdapter liveMultiTypeAdapter, List list) {
        this.f8932b = liveMultiTypeAdapter;
        this.f8933c = list;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8931a, false, 3056, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8931a, false, 3056, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8932b.a(this.f8933c, (DiffUtil.DiffResult) obj);
    }
}
