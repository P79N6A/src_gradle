package com.ss.android.ugc.aweme.qrcode;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63334a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseScanQRCodeActivity f63335b;

    a(BaseScanQRCodeActivity baseScanQRCodeActivity) {
        this.f63335b = baseScanQRCodeActivity;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f63334a, false, 70345, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f63334a, false, 70345, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63334a, false, 70344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63334a, false, 70344, new Class[0], Void.TYPE);
            return;
        }
        this.f63335b.c();
    }
}
