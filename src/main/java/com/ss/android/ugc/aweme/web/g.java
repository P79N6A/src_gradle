package com.ss.android.ugc.aweme.web;

import a.i;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76630a;

    /* renamed from: b  reason: collision with root package name */
    private final QRCodeWebViewDialog f76631b;

    /* renamed from: c  reason: collision with root package name */
    private final a f76632c;

    g(QRCodeWebViewDialog qRCodeWebViewDialog, a aVar) {
        this.f76631b = qRCodeWebViewDialog;
        this.f76632c = aVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f76630a, false, 89888, new Class[]{i.class}, Object.class)) {
            return this.f76631b.a(this.f76632c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f76630a, false, 89888, new Class[]{i.class}, Object.class);
    }
}
