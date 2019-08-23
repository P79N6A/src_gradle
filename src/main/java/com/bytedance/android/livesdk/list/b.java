package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15773a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f15774b = new b();

    private b() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15773a, false, 10232, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15773a, false, 10232, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a("MultiRoomIdListProvider", (Throwable) obj);
    }
}
