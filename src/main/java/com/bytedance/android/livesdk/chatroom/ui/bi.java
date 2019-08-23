package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bi implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11933a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f11934b = new bi();

    private bi() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11933a, false, 5794, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11933a, false, 5794, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(bf.f11916b, (Throwable) obj);
    }
}
