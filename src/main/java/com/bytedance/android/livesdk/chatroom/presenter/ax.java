package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.message.model.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ax implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11254a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11255b;

    /* renamed from: c  reason: collision with root package name */
    private final aq f11256c;

    ax(au auVar, aq aqVar) {
        this.f11255b = auVar;
        this.f11256c = aqVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11254a, false, 5267, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11254a, false, 5267, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11255b.b(this.f11256c);
    }
}
