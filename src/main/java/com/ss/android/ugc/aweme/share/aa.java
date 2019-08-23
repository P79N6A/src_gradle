package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.z;
import java.io.File;

public final /* synthetic */ class aa implements z.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64600a;

    /* renamed from: b  reason: collision with root package name */
    private final z f64601b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64602c;

    aa(z zVar, a aVar) {
        this.f64601b = zVar;
        this.f64602c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64600a, false, 73017, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64600a, false, 73017, new Class[]{File.class}, Void.TYPE);
            return;
        }
        z zVar = this.f64601b;
        a aVar = this.f64602c;
        if (file == null) {
            zVar.n = false;
            return;
        }
        zVar.b(file);
        zVar.a(aVar.d(), aVar.f());
    }
}
