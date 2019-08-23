package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ah;
import java.io.File;

public final /* synthetic */ class aj implements ah.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64636a;

    /* renamed from: b  reason: collision with root package name */
    private final ah f64637b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64638c;

    aj(ah ahVar, a aVar) {
        this.f64637b = ahVar;
        this.f64638c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64636a, false, 73045, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64636a, false, 73045, new Class[]{File.class}, Void.TYPE);
            return;
        }
        this.f64637b.b(this.f64638c, file);
    }
}
