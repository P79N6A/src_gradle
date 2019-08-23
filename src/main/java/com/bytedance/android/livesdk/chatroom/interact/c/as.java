package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class as implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10391a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f10392b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10393c;

    as(ar arVar, boolean z) {
        this.f10392b = arVar;
        this.f10393c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10391a, false, 4691, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10391a, false, 4691, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10392b.b(this.f10393c);
    }
}
