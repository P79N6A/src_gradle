package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10479a;

    /* renamed from: b  reason: collision with root package name */
    private final bl f10480b;

    cd(bl blVar) {
        this.f10480b = blVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10479a, false, 4745, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10479a, false, 4745, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10480b.a((Throwable) obj);
    }
}
