package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ao;
import java.io.File;

public final /* synthetic */ class ap implements ao.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64664a;

    /* renamed from: b  reason: collision with root package name */
    private final ao f64665b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64666c;

    ap(ao aoVar, a aVar) {
        this.f64665b = aoVar;
        this.f64666c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64664a, false, 73065, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64664a, false, 73065, new Class[]{File.class}, Void.TYPE);
            return;
        }
        this.f64665b.b(this.f64666c, file);
    }
}
