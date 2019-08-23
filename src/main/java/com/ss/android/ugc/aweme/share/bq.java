package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64815a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileShareDialog f64816b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64817c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.qrcode.f.a f64818d;

    bq(ProfileShareDialog profileShareDialog, a aVar, com.ss.android.ugc.aweme.qrcode.f.a aVar2) {
        this.f64816b = profileShareDialog;
        this.f64817c = aVar;
        this.f64818d = aVar2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64815a, false, 73219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64815a, false, 73219, new Class[0], Void.TYPE);
            return;
        }
        ProfileShareDialog profileShareDialog = this.f64816b;
        a aVar = this.f64817c;
        com.ss.android.b.a.a.a.b(new br(profileShareDialog, aVar.a(profileShareDialog.mShareStruct), this.f64818d));
    }
}
