package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class by implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10466a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10467b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10468c;

    by(bl blVar, long j) {
        this.f10467b = blVar;
        this.f10468c = j;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10466a, false, 4740, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10466a, false, 4740, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10467b.a(this.f10468c);
    }
}
