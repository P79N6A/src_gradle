package com.ss.android.ugc.aweme.im.sdk.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.im.sdk.share.b;

public final /* synthetic */ class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52418a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52419b;

    c(a aVar) {
        this.f52419b = aVar;
    }

    public final void onShare(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52418a, false, 53226, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52418a, false, 53226, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f52419b;
        if (aVar != null) {
            aVar.run(Boolean.FALSE);
        }
    }
}
