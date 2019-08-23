package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ac;
import com.bytedance.android.livesdk.chatroom.presenter.bk;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bl implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11296a;

    /* renamed from: b  reason: collision with root package name */
    private final bk f11297b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11298c;

    bl(bk bkVar, boolean z) {
        this.f11297b = bkVar;
        this.f11298c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11296a, false, 5291, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11296a, false, 5291, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        bk bkVar = this.f11297b;
        boolean z = this.f11298c;
        d dVar = (d) obj;
        ac acVar = (ac) dVar.f7871b;
        if (!(acVar == null || bkVar.b() == null)) {
            ((bk.a) bkVar.b()).a(acVar, dVar.f7872c.now, z);
        }
    }
}
