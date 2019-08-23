package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.au;
import com.bytedance.android.livesdk.message.model.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11270a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11271b;

    /* renamed from: c  reason: collision with root package name */
    private final aq f11272c;

    /* renamed from: d  reason: collision with root package name */
    private final au.c f11273d;

    bb(au auVar, aq aqVar, au.c cVar) {
        this.f11271b = auVar;
        this.f11272c = aqVar;
        this.f11273d = cVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11270a, false, 5271, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11270a, false, 5271, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11271b.a(this.f11272c, this.f11273d, (Integer) obj);
    }
}
