package com.bytedance.android.livesdk.chatroom.interact.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10861a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10862b = new l();

    private l() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10861a, false, 5056, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10861a, false, 5056, new Class[]{Object.class}, Void.TYPE);
        }
    }
}
