package com.ss.android.ugc.aweme.web;

import a.g;
import a.i;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76633a;

    /* renamed from: b  reason: collision with root package name */
    private final QRCodeWebViewDialog f76634b;

    /* renamed from: c  reason: collision with root package name */
    private final a f76635c;

    h(QRCodeWebViewDialog qRCodeWebViewDialog, a aVar) {
        this.f76634b = qRCodeWebViewDialog;
        this.f76635c = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f76633a, false, 89889, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f76633a, false, 89889, new Class[]{i.class}, Object.class);
        }
        QRCodeWebViewDialog qRCodeWebViewDialog = this.f76634b;
        a aVar = this.f76635c;
        if (((Boolean) iVar.e()).booleanValue()) {
            qRCodeWebViewDialog.a(aVar.d(), aVar.f());
        }
        return null;
    }
}
