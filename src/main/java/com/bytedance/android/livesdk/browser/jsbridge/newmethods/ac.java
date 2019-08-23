package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.event.x;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ac implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9512a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f9513b = new ac();

    private ac() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9512a, false, 3709, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9512a, false, 3709, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null || ((ShareReportResult) dVar.f7871b).getDeltaIntimacy() <= 0)) {
            a.a().a((Object) new x((ShareReportResult) dVar.f7871b));
        }
    }
}
