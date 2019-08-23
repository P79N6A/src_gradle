package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10443a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10444b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10445c;

    bn(bl blVar, long j) {
        this.f10444b = blVar;
        this.f10445c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10443a, false, 4729, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10443a, false, 4729, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10444b.a(this.f10445c);
    }
}
