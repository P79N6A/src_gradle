package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.f.a;

public final /* synthetic */ class br implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64819a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileShareDialog f64820b;

    /* renamed from: c  reason: collision with root package name */
    private final IShareService.ShareResult f64821c;

    /* renamed from: d  reason: collision with root package name */
    private final a f64822d;

    br(ProfileShareDialog profileShareDialog, IShareService.ShareResult shareResult, a aVar) {
        this.f64820b = profileShareDialog;
        this.f64821c = shareResult;
        this.f64822d = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64819a, false, 73220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64819a, false, 73220, new Class[0], Void.TYPE);
            return;
        }
        ProfileShareDialog profileShareDialog = this.f64820b;
        IShareService.ShareResult shareResult = this.f64821c;
        a aVar = this.f64822d;
        profileShareDialog.onShareComplete(shareResult);
        if (aVar != null) {
            aVar.dismiss();
        }
    }
}
