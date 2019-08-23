package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.livesdkapi.d.c;
import com.bytedance.android.livesdkapi.d.d;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13611a;

    /* renamed from: b  reason: collision with root package name */
    private final DataCenter f13612b;

    b(DataCenter dataCenter) {
        this.f13612b = dataCenter;
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f13611a, false, 8025, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f13611a, false, 8025, new Class[]{c.class}, Void.TYPE);
            return;
        }
        DataCenter dataCenter = this.f13612b;
        if (dataCenter != null) {
            dataCenter.lambda$put$1$DataCenter("cmd_douyin_commerce_ready", cVar2);
        }
    }
}
